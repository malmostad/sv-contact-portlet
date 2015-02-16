/**
 * 
 */
package se.malmo.www.kontaktruta.portlet;

import java.lang.reflect.Type;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.portlet.PortletContext;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.http.Cookie;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.portlet.context.PortletContextAware;

import se.malmo.www.kontaktruta.model.Contact;
import se.malmo.www.kontaktruta.model.ContactBox;
import se.malmo.www.kontaktruta.model.ContactKey;
import senselogic.sitevision.api.Utils;
import senselogic.sitevision.api.context.PortletContextUtil;
import senselogic.sitevision.api.metadata.MetadataUtil;
import senselogic.sitevision.api.property.PropertyUtil;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.googlecode.ehcache.annotations.key.StringCacheKeyGenerator;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.Setter;
import net.sf.ehcache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import se.malmo.www.kontaktruta.model.APIContact;
import static se.malmo.www.kontaktruta.portlet.ContactConfigController.GROUPS;
import static se.malmo.www.kontaktruta.portlet.ContactConfigController.PERSONS;
import se.malmo.www.kontaktruta.service.ContactService;

/**
 * @author HEKA
 *
 */
public class ContactController implements PortletContextAware {
    private final Log logger = LogFactory.getLog(this.getClass());
    
    protected final Gson gson = new Gson();
    private final StringCacheKeyGenerator generator = new StringCacheKeyGenerator(false, false);
    private final Type contactsType =  new TypeToken<LinkedList<Contact>>() {}.getType();
    
    public final static String CONTACTS_METADATA = "kontaktruta";
    public final static String CONTACTS_CITYAREAS_METADATA = "kontaktrutastadsomradenV4_3";
    
    public final static String CONTACTS_PREF = "contacts";
    public final static String DISTRICTSELECTOR_PREF = "districtSelector";
    public final static String TEXT_PREF = "text";
    public final static String META_NAME = "metaname";
    

    public final static WindowState WINDOWSTATE_SOLO = new WindowState("solo");
    
    private final Map<String, String> districts;
    
    private PortletContext portletContext;    
    private boolean useInContent = false;
    
    private final Map<String, String> areas;
    
    @Getter @Setter private String metadataName;
    @Getter @Setter private String legacyName;
        
    @Autowired
    protected ContactService contactService;

    
    @Value("#{cacheManager.getCache('contacts')}")
    protected Cache cache;
    
	public ContactController() {
        super();
        
        this.districts = new LinkedHashMap<String,String>();

        districts.put("", "Välj stadsdel");
        districts.put("CENTRUM", "Centrum");
        districts.put("HUSIE", "Husie");
        districts.put("FOSIE", "Fosie");
        districts.put("HYLLIE", "Hyllie");
        districts.put("LIMHAMN-BUNKEFLO", "Limhamn-Bunkeflo");
        districts.put("KIRSEBERG", "Kirseberg");
        districts.put("OXIE", "Oxie");
        districts.put("ROSENGÅRD", "Rosengård");
        districts.put("SÖDRA INNERSTADEN", "Södra Innerstaden");
        districts.put("VÄSTRA INNERSTADEN", "Västra Innerstaden");
        
        this.areas = new LinkedHashMap<String,String>();

        areas.put("", "Välj stadsområde");
        areas.put("NORR", "Norr");
        areas.put("ÖSTER", "Öster");
        areas.put("SÖDER", "Söder");
        areas.put("VÄSTER", "Väster");
        areas.put("INNERSTADEN", "Innerstaden");       
        
    }

    /**
     * @return the districts
     */
    public Map<String,String> getDistricts() {    	
    	return areas;    	   
    }
              
    public Map<String,String> getDistricts(ContactBox contactBox) {
        return getDistricts(contactBox, null);
    }
    
    public Map<String,String> getDistricts(ContactBox contactBox, Contact contact) {
        Map<String,String> filtered = new LinkedHashMap<String, String>();
        filtered.putAll(getDistricts());
        Iterator<ContactKey> i = contactBox.getContacts().keySet().iterator();
        while (i.hasNext()) {
            ContactKey key = i.next();
            if (contact == null || !key.getDistrict().equals(contact.getDistrict()))
                filtered.remove(key.getDistrict());
        }
        return filtered;
    }
    
    /**
     * @return city areas
     */
    public Map<String, String> getAreas() {
    	return areas;
    }
    
    public Map<String,String> getAreas(ContactBox contactBox) {
        return getAreas(contactBox, null);
    }
    
    public Map<String,String> getAreas(ContactBox contactBox, Contact contact) {
        Map<String,String> filtered = new LinkedHashMap<String, String>();
        filtered.putAll(getDistricts());
        Iterator<ContactKey> i = contactBox.getContacts().keySet().iterator();
        while (i.hasNext()) {
            ContactKey key = i.next();
            if (contact == null || !key.getDistrict().equals(contact.getDistrict()))
                filtered.remove(key.getDistrict());
        }
        return filtered;
    }
    
    
    
    /**
     * @param request
     * @param prefs
     * @return
     */
    protected ContactBox loadContactBox(PortletRequest request, PortletPreferences prefs) {    	
       
        ContactBox contactBox = new ContactBox();
        String contactsJSON = null;
        if (isUseInContent()) {
            contactsJSON = prefs.getValue(CONTACTS_PREF, "");
        }
        else {
            Utils utils = (Utils)request.getAttribute("sitevision.utils");
            PortletContextUtil pcUtil = utils.getPortletContextUtil();
            MetadataUtil metaUtil = utils.getMetadataUtil();
            PropertyUtil propertyUtil = utils.getPropertyUtil();
            
            Node currentPage = pcUtil.getCurrentPage();        
            
            try {
                contactBox.setInheritance(metaUtil.isMetadataValueInherited(currentPage, metadataName));
            } catch (RepositoryException re) {
                contactBox.setInheritance(false);
            }
            contactBox.setDistrictSelector(Boolean.parseBoolean(prefs.getValue(DISTRICTSELECTOR_PREF, "false")));
            contactBox.setText(prefs.getValue(TEXT_PREF, ""));
    
            // Get contacts from metadata
            contactsJSON = propertyUtil.getString(currentPage, metadataName);
        }
        
        if (contactsJSON != null && contactsJSON.trim().length() > 0) {
            try {
                List<Contact> contactsList = gson.fromJson(contactsJSON, contactsType);
                Map<ContactKey, Contact> contacts = new LinkedHashMap<ContactKey, Contact>();
                Iterator<Contact> i = contactsList.iterator();
                while (i.hasNext()) {
                    Contact contact = i.next(); 
                    contacts.put(contact.getKey(), contact);
                }
                contactBox.setContacts(contacts);
            } catch (Exception ex) {
                Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        return contactBox;
    }
    
    /**
     * @param contactBox
     * @param request
     * @param prefs
     * @throws Exception
     */
    protected void saveContactBox(ContactBox contactBox, PortletRequest request, PortletPreferences prefs) throws Exception {
        
        if (isUseInContent()) {
            List<Contact> contacts = new LinkedList<Contact>();
            contacts.addAll(contactBox.getContacts().values());
            prefs.setValue(CONTACTS_PREF, gson.toJson(contacts));
        }
        else {
            Utils utils = (Utils)request.getAttribute("sitevision.utils");
            PortletContextUtil pcUtil = utils.getPortletContextUtil();
            MetadataUtil metaUtil = utils.getMetadataUtil();
            Node currentPage = pcUtil.getCurrentPage();
            
            if (contactBox.isInheritance())
                metaUtil.removeMetadataPropertyValue(currentPage, metadataName);
            else {
                List<Contact> contacts = new LinkedList<Contact>();
                contacts.addAll(contactBox.getContacts().values());
                
                for (Contact c: contacts){
                    String key = generator.generateKey(convertType(c.getType()), c.getDn());
                    cache.remove(key);
                }
                metaUtil.setMetadataPropertyValue(currentPage, metadataName, gson.toJson(contacts));
            }
            
            prefs.setValue(DISTRICTSELECTOR_PREF, contactBox.isDistrictSelector() ? "true" : "false");            
            prefs.setValue(TEXT_PREF, contactBox.getText());
        }
        prefs.store();        
    }

    protected String createRenderSoloURL(RenderResponse response) {
        return createRenderSoloURL(response, "application/vnd.senselogic.sitevision.portlet");
    }
    protected String createRenderSoloURL(RenderResponse response, String contentType) {
        PortletURL renderSoloURL = response.createRenderURL();
        try {
            renderSoloURL.setWindowState(WINDOWSTATE_SOLO);
        } catch (WindowStateException e) {
            logger.error(e.getMessage(), e);
        }
        renderSoloURL.setParameter("sv.contenttype", contentType);
        
        return renderSoloURL.toString();
    }  
    
    protected String createRenderSoloURL2(RenderRequest request) {
        return createRenderSoloURL2(request, null);
    }
    protected String createRenderSoloURL2(RenderRequest request, String contentType) {
        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        PropertyUtil propertyUtil = utils.getPropertyUtil();
        Node currentPage = utils.getPortletContextUtil().getCurrentPage();
        Node currentPortlet = utils.getPortletContextUtil().getCurrentPortlet();
        
        StringBuilder url = new StringBuilder();
        url.append('/');
        String pageId = propertyUtil.getString(currentPage, "jcr:uuid");
        if (pageId.indexOf('_') > 0)
            pageId = pageId.substring(0, pageId.indexOf('_'));
        url.append(pageId);
        url.append('/');
        url.append(propertyUtil.getString(currentPortlet, "jcr:uuid"));
        url.append(".portlet");
        if (contentType != null) {
            url.append("?sv.contenttype=");
            url.append(contentType);
        }
        
        return url.toString();
    }
    
    protected Map<String,Cookie> getCookies(PortletRequest request) {
        String header = request.getProperty("Cookie");
        HashMap<String,Cookie> cookies = new HashMap<String,Cookie>();
        while (header != null && header.length() > 0) {
            int semicolon = header.indexOf(';');
            if (semicolon < 0)
                semicolon = header.length();
            if (semicolon == 0)
                break;
            String token = header.substring(0, semicolon);
            if (semicolon < header.length())
                header = header.substring(semicolon + 1);
            else
                header = "";
            try {
                int equals = token.indexOf('=');
                if (equals > 0) {
                    String name = token.substring(0, equals).trim();
                    String value = token.substring(equals+1).trim();
                    cookies.put(name, new Cookie(name, value));
                }
            } catch (Throwable e) {
                ;
            }
        }    
        return cookies;
    }

    protected PortletContext getPortletContext() {
        return portletContext;
    }
    
    @Override
    public void setPortletContext(PortletContext portletContext) {
        this.portletContext = portletContext;
        
    }

    /**
     * @return the useInContent
     */
    public final boolean isUseInContent() {
        return useInContent;
    }

    /**
     * @param useInContent the useInContent to set
     */
    public final void setUseInContent(boolean useInContent) {
        this.useInContent = useInContent;
    }
    
    public String convertType(int type){
        if (type == 1){
            return PERSONS;
        }
        return GROUPS;
    }
    
    protected APIContact findContact(Contact contact){
        String contactType = convertType(contact.getType());
        APIContact apiContact = contactService.getContact(contactType, contact.getDn(), APIContact.class);
        return apiContact;
    }
}
