/**
 * 
 */
package se.malmo.www.kontaktruta.portlet;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.jcr.Node;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.Cookie;
import javax.xml.ws.Action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import se.malmo.www.district.web.DistrictController;
import se.malmo.www.kontaktruta.model.APIContact;
import se.malmo.www.kontaktruta.model.Contact;
import se.malmo.www.kontaktruta.model.ContactBox;
import se.malmo.www.kontaktruta.model.ContactKey;
import se.malmo.www.kontaktruta.model.ContactObject;
import se.malmo.www.kontaktruta.service.ContactService;
import se.malmo.www.kontaktruta.util.ContactBoxUtils;
import se.malmo.www.skrivtilloss.exception.WriteToUsDeliveryException;
import se.malmo.www.skrivtilloss.model.Message;
import senselogic.sitevision.api.Utils;
import senselogic.sitevision.api.context.PortletContextUtil;
import senselogic.sitevision.api.property.PropertyUtil;
import senselogic.sitevision.api.render.LinkRenderer;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
@Controller
@RequestMapping("VIEW")
public class ContactViewController extends ContactController {
    private final Log logger = LogFactory.getLog(this.getClass());
    
    public static final String CONTACT_ID = "contactid";
    protected final static String MA_DISTRICT = "district";
    protected final static String MA_DISTRICTS = "districts";
    protected final static String MA_CONTACTBOX = "contactBox";
    protected final static String MA_CONTACTS = "currentContacts";
    protected final static String MA_CONTACT_OBJECT_LIST = "contactObjectList";
    protected final static String MA_AREATYPENAME = "areaTypeName";
    protected final static String MAIL_RESPONSE_VIEW = "mailResponseView";
    
    public static final String WRITETOUS_PAGEID = "writeToUsPageId";
    public static final String WRITETOUS_CONTACT = "writeToUsContact";
    
    public static final String[] MESSAGE_SUBJECTS = {"Felanmälan","Fråga","Annat"};
    
    private static final long MIN_SESSION_DURATION = 15000;
    
    
    private VelocityEngine velocityEngine;
    private String fromAddress;
    private String smtpHost;
    private JavaMailSenderImpl mailSender = null;	
    
    /**
     * @return the smtpHost
     */
    public final String getSmtpHost() {
        return smtpHost;
    }

    /**
     * @param smtpHost the smtpHost to set
     */
    public final void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }
    
    /**
     * @return the fromAddress
     */
    public final String getFromAddress() {
        return fromAddress;
    }

    /**
     * @param fromAddress the fromAddress to set
     */
    public final void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }
    
    /**
     * @param velocityEngine the velocityEngine to set
     */
    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    /**
     * @return the velocityEngine
     */
    public VelocityEngine getVelocityEngine() {
        return velocityEngine;
    }
    
    private JavaMailSenderImpl getMailSender() {
        if (mailSender == null) {
            mailSender = new JavaMailSenderImpl();
            mailSender.setHost(getSmtpHost());
        }
        return mailSender;
    }
    
    
    private boolean isEmptyOrNull(String val){    	
    	if(val!=null){
    		String trimmedVal = val.trim();
    		if(trimmedVal.isEmpty()){
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean isValidEmailAddress(String email) {
    	   boolean result = true;
    	   try {
    	      InternetAddress emailAddr = new InternetAddress(email);
    	      emailAddr.validate();
    	   } catch (AddressException ex) {
    	      result = false;
    	   }
    	   return result;
    }
    
    /**
     * @param message
     * @param form
     * @param contact
     * @param contactObject
     * @param sendToContact
     * @throws Exception
     */
    private void sendMessageByMail(Message message, Contact contact, ContactObject contactObject, boolean sendToContact) throws Exception {
        // Render mail body
        StringWriter sw = new StringWriter();
        VelocityContext context = new VelocityContext();
        context.put("message", message);
              
        getVelocityEngine().mergeTemplate("writetousMail.vm", "UTF-8", context, sw);
        String body = sw.toString();
        
        //String subject = MimeUtility.encodeText(new StringBuilder("Skriv till oss - ").append(message.getType()).toString(), "UTF-8", "Q");
        String subject = new StringBuilder("Skriv till oss - ").append(message.getType()).toString();
        
        if (sendToContact) {
            // Send mail - Contact
            if (message.getEmail() != null && !message.getEmail().isEmpty())
                sendMail(getFromAddress(), contactObject.getMail(), message.getEmail(), subject, body);
            else   
                sendMail(getFromAddress(), contactObject.getMail(), subject, body);
        } 
        
        // Send mail - Submitter
        if (message.isContactByEmail()) 
            sendMail(contactObject.getMail(),message.getEmail(), subject, body);
        
    }
    
    private void sendMail(String from, String to, String subject, String body) throws Exception {
        sendMail(from, to, null, subject, body);
    }
    
    private void sendMail(String from, String to, String replyTo, String subject, String body) throws Exception {
        JavaMailSenderImpl mailSender = getMailSender();
        
        MimeMessage mm = mailSender.createMimeMessage();        
        MimeMessageHelper helper = new MimeMessageHelper(mm, "UTF-8");
        
        helper.setFrom(from);
        helper.setTo(to);
        if (replyTo != null)
            helper.setReplyTo(replyTo);
        
        helper.setSubject(subject);
        helper.setText(body);
        mailSender.send(mm);
    }
    
    private Contact getContact(PortletRequest request) {
        int contactId = Integer.parseInt(request.getParameter(CONTACT_ID));
        Map<ContactKey, Contact> contacts = ContactBoxUtils.getContacts(request);
        if (contacts != null  && (contactId >= 0 || contactId < contacts.size())) {
            Contact contact = contacts.values().toArray(new Contact[contacts.size()])[contactId];
            return contact;
        }
        return null;
    }
    
    @RequestMapping(params = "action=writetous")
    public String doWriteToUsView(Model model, RenderRequest request, RenderResponse response, PortletSession session, PortletPreferences prefs) {        
    	String viewName = handleMailAction(model, prefs, request, response);
    	return viewName;
    }
    
    @RequestMapping(params = "action=writetous")
    public void processWriteToUsAction(Model model, PortletPreferences prefs, ActionRequest request, ActionResponse response) {    
    	
    	String name= request.getParameter("name");
		String email = request.getParameter("email");
		String contactid = request.getParameter("contactid");
		String phone = request.getParameter("phone");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		response.setRenderParameter("name", name);
    	response.setRenderParameter("email", email);
    	response.setRenderParameter("contactid", contactid);
    	response.setRenderParameter("phone", phone);
    	response.setRenderParameter("subject", subject);
    	response.setRenderParameter("message",  message);
    	
    	response.setRenderParameter("action", "writetous");
    }
    
    
    public String handleMailAction(Model model, PortletPreferences prefs, RenderRequest request, RenderResponse response) {    	    

    	String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contactid = request.getParameter("contactid");
		String phone = request.getParameter("phone");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
    	
    	boolean hasErrors = false;
    	boolean hasValidEmail = false;
    	
    	Hashtable<String, String> validationErrors = new Hashtable<String, String>();
    	
    	if(isEmptyOrNull(name)){
    		validationErrors.put("name","Fältet Namn får inte vara tomt");
    		hasErrors = true;
    	}
    	if(!isEmptyOrNull(email)){
	    	if(!isValidEmailAddress(email)){
	    		validationErrors.put("email","Fältet E-post måste vara korrekt ifyllt");
	    		hasErrors = true;
	    	}else{
	    		hasValidEmail = true;
	    	}
	    	
    	}
    	if(isEmptyOrNull(message)){
    		validationErrors.put("message","Fältet Meddelande får inte vara tomt");
    		hasErrors = true;
    	}
    	
    	if(isEmptyOrNull(subject)){
    		validationErrors.put("subject","Ange vad meddelandet avser");
    		hasErrors = true;
    	}
    	
    	
       	//Spam check. If session time is too short, warn for spam and don't send message
    	PortletSession session = request.getPortletSession();
        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        long sessionLifetime = System.currentTimeMillis() - session.getCreationTime();
        if (sessionLifetime < MIN_SESSION_DURATION) {
            String msg = (new StringBuilder()).append("Possible SPAM robot post detected from ").append(utils.getClientUtil().getClientAddress()).append(", Post was done only ").append(sessionLifetime).append(" ms after session was created, limit is").append(MIN_SESSION_DURATION).append(" ms").toString();
            logger.warn(msg);
            model.addAttribute("senderror","Spam");            
            hasErrors = true;
        }            
    	
    	String responseView = "contact-writeToUsForm";
    	if(!hasErrors){
    		//No validation errors, let's send mail    		  
    		  Message messageToSend = new Message();
    		  
    	      Map<String, String> fields = new HashMap<String, String>();
    	      
    	      fields.put(Message.USERIP_PCID,utils.getClientUtil().getClientAddress());
    	      fields.put(Message.SOURCEURL_PCID, utils.getPropertyUtil().getString(utils.getPortletContextUtil().getCurrentPage(), "URL"));
    	      
    	      
    	      fields.put(Message.NAME_PCID, name);
    	      fields.put(Message.EMAIL_PCID, email);
    	      fields.put(Message.TELEPHONE_PCID, phone);
    	      
    	      if(hasValidEmail){
    	    	fields.put(Message.CONTACTBYEMAIL_PCID, "true");
    	      }
    	      
    	      try{
    	    	  int subjectIndex = Integer.parseInt(subject);
    	    	  fields.put(Message.TYPE_PCID, MESSAGE_SUBJECTS[subjectIndex]);
    	      }catch(Exception e){
    	    	  logger.error("Error setting subject in mail: "+e.getMessage());
    	      }
    	      fields.put(Message.MESSAGE_PCID, message);
    	      messageToSend.setField(fields);
              
    	      Contact contact = getContact(request);
              
              APIContact apiContact = contactService.getContact(convertType(contact.getType()), contact.getDn(), APIContact.class);
    	      ContactObject contactObject = contact.getContactObject(apiContact);

              try {    	            
    	            sendMessageByMail(messageToSend, contact, contactObject, true);    	           
    	            // Set renderParamenter for confirm view
    	            model.addAttribute("contactid",contactid);
    	            model.addAttribute("sendConfirm","Ditt meddelande har skickats till "+contactObject.getMail()+".");
    		    	responseView = "writeToUsSuccess";
    	        } catch (Exception e) {
                   
    	            logger.error("Error sending mail - "+e.getMessage());
    	            model.addAttribute("senderror","Tekniskt fel, ditt meddelande kunde inte skickas, var vänlig försök igen senare");
    	            model.addAttribute("name", name);    	
    		    	model.addAttribute("email", email);
    		    	model.addAttribute("contactid",contactid);
    		    	model.addAttribute("phone",phone);
    		    	model.addAttribute("subject",subject);
    		    	model.addAttribute("message",message);
    		    	model.addAttribute("validationErrors",validationErrors);    	 
    		    	model.addAttribute("writetousURL", createRenderActionURL(request, "writetous"));
    	        }    	      
    	}else{    	    	
    		//Validation errors, message will not be sent
	    	model.addAttribute("hasErrors",hasErrors);
	    	model.addAttribute("name", name);    	
	    	model.addAttribute("email", email);
	    	model.addAttribute("contactid",contactid);
	    	model.addAttribute("phone",phone);
	    	model.addAttribute("subject",subject);
	    	model.addAttribute("message",message);
	    	model.addAttribute("validationErrors",validationErrors);
	    	model.addAttribute("writetousURL", createRenderActionURL(request, "writetous"));
    	}

    	return responseView; 
    }
    
    @RequestMapping // default
    public String doView(Model model, RenderRequest request, RenderResponse response, PortletSession session, PortletPreferences prefs) {        

        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        
        model.addAttribute("actionUrl",response.createActionURL());

        ContactBox contactBox;
        if (!model.containsAttribute(MA_CONTACTBOX)) {
            contactBox = loadContactBox(request, prefs);            
            model.addAttribute(MA_CONTACTBOX, contactBox);
        }
        else {
            contactBox = (ContactBox)model.asMap().get(MA_CONTACTBOX);
        }

        if (contactBox.isDistrictSelector())
            model.addAttribute(MA_DISTRICTS, getDistricts());

        // Create list with contacts to display
        List<Contact> contacts = new ArrayList<Contact>();
        Iterator<Contact> i = contactBox.getContacts().values().iterator();
        Map<ContactKey, ContactObject> contactObjectList = new HashMap<ContactKey, ContactObject>();
        
        int count = 0;
        boolean missingContacts = false;
        while (i.hasNext()) {
            Contact contact = i.next();
            contact.setId(count);
            APIContact apiContact = findContact(contact);
            if (apiContact == null){
                missingContacts = true;
                Logger.getLogger(ContactViewController.class).error("No related contact in contact api for id: " + contact.getDn());
                continue;
            }
            ContactObject co = contact.getContactObject(apiContact);
            contactObjectList.put(contact.getKey(), co);
            contacts.add(contact);
            count++;
        }        
        
        model.addAttribute(MA_CONTACTS, contacts);
        model.addAttribute(MA_CONTACT_OBJECT_LIST, contactObjectList);
        model.addAttribute(MA_AREATYPENAME, "stadsområde");                
        model.addAttribute("missingContacts", missingContacts);
        model.addAttribute("renderRequest", request);
        model.addAttribute("renderResponse", response);

        LinkRenderer linkRenderer = utils.getLinkRenderer();
        linkRenderer.setRel("external");
        linkRenderer.setOpenNewWindow(true);
        model.addAttribute("linkRenderer", linkRenderer);
        
        model.addAttribute("writetousURL", createRenderActionURL(request, "writetous"));
        
        if (isUseInContent())
            model.addAttribute("useInContent", Boolean.TRUE);
        
        String mailResponseView = request.getParameter(MAIL_RESPONSE_VIEW);
        if (mailResponseView != null){
        	return mailResponseView;
        }
        return "contactBoxView";
     }   
 
    
    private String createRenderActionURL(RenderRequest request, String action) {
    	
        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        PropertyUtil propertyUtil = utils.getPropertyUtil();
        PortletContextUtil ctxUtil = utils.getPortletContextUtil();
        Node currentPage = ctxUtil.getCurrentPage();
        Node portlet = ctxUtil.getCurrentPortlet();
        
        StringBuilder url = new StringBuilder("/");
        String pathToPortlet = propertyUtil.getString(currentPage, "jcr:uuid");
        url.append(pathToPortlet);
        url.append(".");
        url.append(propertyUtil.getString(portlet, "jcr:uuid"));
        url.append(".portlet?action=");
        url.append(action);
        
        return url.toString();
    }
    
}
