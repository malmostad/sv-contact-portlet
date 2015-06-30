/**
 * 
 */
package se.malmo.www.kontaktruta.portlet;

import com.google.gson.Gson;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import net.sf.ehcache.Cache;

import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import se.malmo.www.kontaktruta.model.APIContact;
import se.malmo.www.kontaktruta.model.APISuggestion;

import se.malmo.www.kontaktruta.model.AutocompleteResult;
import se.malmo.www.kontaktruta.model.Contact;
import se.malmo.www.kontaktruta.model.ContactBox;
import se.malmo.www.kontaktruta.model.ContactKey;
import se.malmo.www.kontaktruta.model.ContactObject;
import senselogic.sitevision.api.Utils;
import senselogic.sitevision.api.render.LinkRenderer;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
@Controller
@RequestMapping("CONFIG")
@SessionAttributes("contactBox")
public class ContactConfigController extends ContactController {  
    public static final String PERSONS = "employees";
    public static final String GROUPS = "group_contacts";
    
    private final Log logger = LogFactory.getLog(this.getClass());

    private final Map<String,String> types;
    private final Map<String,String> attributes;
    
    @Value("${searchBasePerson}")
    private String searchBasePerson;
    
    @Value("${searchBaseFunction}")
    private String searchBaseFunction;
    
    @Value("${kontaktruta.show_avatar}") 
    private Boolean showAvatar;
    
    /**
     * 
     */
    public ContactConfigController() {
        super();
        types = new LinkedHashMap<String,String>();
        types.put("1", "Person");
        types.put("2", "Funktion");
        
        attributes = new LinkedHashMap<String,String>();
        attributes.put("avatar", "Visningsbild");
        attributes.put("title", "Titel");
        attributes.put("mail", "E-post");
        attributes.put("telephone", "Fast telefon");
        attributes.put("mobile", "Mobil");
        attributes.put("fax", "Fax");
        attributes.put("telephoneHours", "Telefontider");
        attributes.put("postalAddress", "Postadress");
        attributes.put("visitingAddress", "Besöksadress");
        attributes.put("visitingHours", "Besökstider");
        attributes.put("homepage", "Hemsida");
        
    }
    
    @RequestMapping // default
    public String doConfig(Model model, PortletPreferences prefs, RenderRequest request, RenderResponse response) {
        
        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        
        // Remove the avatar option to be selectable in the config view 
        if(!showAvatar) {
            attributes.remove("avatar");
        }
        
        ContactBox contactBox = null;
        if (!model.containsAttribute("contactBox")) {
            contactBox = loadContactBox(request, prefs);
            model.addAttribute("contactBox", contactBox);
        }
        else {
            contactBox = (ContactBox) model.asMap().get("contactBox");
        }
        
        Map<String,String> districts = getDistricts();        
        Map<String,String> contacts = new LinkedHashMap<String, String>();
        Iterator<Contact> i = contactBox.getContacts().values().iterator();
        
        while (i.hasNext()) {
            Contact contact = i.next();
            APIContact apiContact = findContact(contact);
            if (apiContact == null){
                Logger.getLogger(ContactViewController.class).error("No related contact in contact api for id: " + contact.getDn());
                continue;
            } 
            ContactObject co = contact.getContactObject(apiContact);
            String key = gson.toJson(contact.getKey()).toString().replaceAll("\"", "&#34;");
            StringBuilder value = new StringBuilder();
            value.append(co.getName());
            if (contactBox.isDistrictSelector()) {
                value.append(", ");
                value.append(districts.get(contact.getDistrict()));
            }
            contacts.put(key, value.toString());
            
        }
        
       	model.addAttribute("areaTypeName", "Stadsområde");
        
        model.addAttribute("contactList", contacts);        
        model.addAttribute("renderResponse", response);
        if (isUseInContent())
            return "contactInfoForm";
        else
            return "contactBoxForm";
    }
    
    @RequestMapping // default
    public void processAction(Model model, @ModelAttribute("contactBox") ContactBox contactBox, PortletPreferences prefs, ActionRequest request, ActionResponse response) {        
      
        if (request.getParameter("_ok") != null) {                
            try {
                saveContactBox(contactBox, request, prefs);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        else if (request.getParameter("_addContact") != null) {
            response.setRenderParameter("action", "add");
        }
        else if (request.getParameter("_modifyContact") != null) {
            response.setRenderParameter("contact", request.getParameter("contact"));
            response.setRenderParameter("action", "modify");
        }
        else if (request.getParameter("_removeContact") != null) {
            ContactKey key = gson.fromJson(request.getParameter("contact"), ContactKey.class);
            contactBox.getContacts().remove(key);
        }
        
        if (request.getParameter("_ok") != null || request.getParameter("_cancel") != null) {   
             
            try {
                response.setPortletMode(PortletMode.VIEW);
            } catch (PortletModeException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }
    
    @RequestMapping(params = "action=add") // render phase
    public String doViewAddContactForm(Model model, @ModelAttribute("contactBox") ContactBox contactBox, RenderRequest request, RenderResponse response) {
        if (!model.containsAttribute("contact")) {
            model.addAttribute("contact", new Contact());
        }
        if (contactBox.isDistrictSelector())
            model.addAttribute("districts", getDistricts(contactBox));
        
        return contactForm(model, request, response);
    }
    
    @RequestMapping(params = "action=modify") // render phase
    public String doViewModifyContactForm(Model model, @RequestParam("contact") String contactKey, 
            @ModelAttribute("contactBox") ContactBox contactBox, RenderRequest request, RenderResponse response) {
        
        Contact contact = null;
        if (contactKey != null) {
            ContactKey key = gson.fromJson(contactKey, ContactKey.class);
            contact = contactBox.getContacts().get(key);
            model.addAttribute("contact", contact);
        }
        if (contactBox.isDistrictSelector())
            model.addAttribute("districts", getDistricts(contactBox, contact));
        
        return contactForm(model, request, response);
    }
    
    private String contactForm(Model model, RenderRequest request, RenderResponse response) {       
        Utils utils = (Utils)request.getAttribute("sitevision.utils");

        model.addAttribute("directoryUtil", utils.getDirectoryUtil());
        model.addAttribute("renderSoloURL", createRenderSoloURL(response));
        model.addAttribute("renderResponse", response);
        model.addAttribute("types", types);
        model.addAttribute("attributes", attributes);
        model.addAttribute("action", "modify");
       	model.addAttribute("areaTypeName", "stadsområde");
        if (isUseInContent()) 
            model.addAttribute("useInContent", Boolean.TRUE);
            
        return "contactForm";   
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(params = "action=searchJSON") // render phase
    public String doAjaxSearchContactJSON(Model model, @RequestParam("query") String query,
            @RequestParam("type") int type, RenderRequest request, RenderResponse response) {
        
        AutocompleteResult ar = new AutocompleteResult();
        ar.setQuery(query);
        APISuggestion[] suggestions = contactService.getContactList(convertType(type), query, APISuggestion[].class);
        if (suggestions != null && suggestions.length > 0) {
            String[] items = new String[suggestions.length];
            String[] data  = new String[suggestions.length];
            int i=0;
            for (APISuggestion s: suggestions){
                items[i] = s.toString();
                data[i] = s.getId();
                i++;
            }
            ar.setSuggestions(items);
            ar.setData(data);
        } else {
            ar.setSuggestions(new String[] { "(Inga träffar)" });
        }
        String content = gson.toJson(ar);
        model.addAttribute("content", content);

        return "searchJSON";
    }
    
    @RequestMapping(params = "action=attributes") // render phase
    public String doAjaxContactAttributes(Model model, @ModelAttribute("contact") Contact contact, 
            BindingResult result, SessionStatus status, RenderRequest request, RenderResponse response) {
        
        String contactId = contact.getDn();
        if (contactId != null && contactId.length() > 0){
            List<String> contactAttrs = getContactAttributes(contact);
            String jsonAttributes = gson.toJson(contactAttrs);
            model.addAttribute("attributes", jsonAttributes);
        }
        return "contactAttributes";
    }    

    @RequestMapping(params = "action=preview")  // action phase
    public String doAjaxPreviewContact(Model model, @ModelAttribute("contact") Contact contact, 
            BindingResult result, SessionStatus status, RenderRequest request, RenderResponse response) {
        Utils utils = (Utils)request.getAttribute("sitevision.utils");

        model.addAttribute("contact", contact);
        String identifier = contact.getDn();
        if (identifier != null && identifier.length() > 0){
            APIContact apiContact = contactService.getContact(convertType(contact.getType()), identifier, APIContact.class);
            model.addAttribute("apiContact", apiContact);
        }
        LinkRenderer linkRenderer = utils.getLinkRenderer();
        linkRenderer.setRel("external");
        linkRenderer.setOpenNewWindow(true);
        model.addAttribute("linkRenderer", linkRenderer);
        model.addAttribute("showAvatar", showAvatar);
        if (isUseInContent())
            model.addAttribute("useInContent", Boolean.TRUE);

        return "contactPreview";
    }    
    
    @RequestMapping(params = "action=modify")  // action phase
    public void processActionModifyContact(@ModelAttribute("contact") Contact contact, @ModelAttribute("contactBox") ContactBox contactBox, 
            BindingResult result, SessionStatus status, ActionRequest request, ActionResponse response) {

        if (request.getParameter("_ok") != null) {
            if (result.hasErrors())
                return;
            
            String identifier = contact.getDn();
            APIContact apiContact = contactService.getContact(convertType(contact.getType()), identifier, APIContact.class);
            if (apiContact != null) {
                contact.setCn(apiContact.getName());
            }
            contactBox.getContacts().put(contact.getKey(), contact);
        }
        response.setRenderParameter("action", "config");            
    }    
    
    
    @RequestMapping(params = "action=remove")
    public void processActionRemoveContact(@RequestParam("contact") String contact, 
            @ModelAttribute("contactBox") ContactBox contactBox, ActionResponse response) {
        ContactKey key = gson.fromJson(contact, ContactKey.class);
        contactBox.getContacts().remove(key);
        response.setRenderParameter("action", "config");
    }
    

    /**
     * @return the searchBasePerson
     */
    public String getSearchBasePerson() {
        return searchBasePerson;
    }

    /**
     * @return the searchBaseFunction
     */
    public String getSearchBaseFunction() {
        return searchBaseFunction;
    }

    /**
     * @param searchBasePerson the searchBasePerson to set
     */
    public void setSearchBasePerson(String searchBasePerson) {
        this.searchBasePerson = searchBasePerson;
    }

    /**
     * @param searchBaseFunction the searchBaseFunction to set
     */
    public void setSearchBaseFunction(String searchBaseFunction) {
        this.searchBaseFunction = searchBaseFunction;
    }
    
    /*
    * goes through the list of attributes and actually looks for the ones that
    * dont exist, so dont be confused by the if(value == null)
    */
    protected List<String> getContactAttributes(Contact contact){
        APIContact apiContact = contactService.getContact(convertType(contact.getType()), contact.getDn(), APIContact.class);
    
        ContactObject co = contact.getContactObject(apiContact);
        List<String> contactAttrs = new LinkedList<String>();
        Iterator<String> i = attributes.keySet().iterator();
        while (i.hasNext()) {
            String key = i.next();
            String methodName = "get"+key.substring(0,1).toUpperCase()+key.substring(1);
            try {
                Method method = co.getClass().getMethod(methodName);
                Object value = method.invoke(co, (Object[])null);
                if (value == null)
                contactAttrs.add(key);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return contactAttrs;
    }
}
