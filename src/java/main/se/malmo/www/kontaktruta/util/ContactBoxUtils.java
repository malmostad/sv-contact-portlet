/**
 * 
 */
package se.malmo.www.kontaktruta.util;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.jcr.Node;
import javax.portlet.PortletRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import se.malmo.www.kontaktruta.model.Contact;
import se.malmo.www.kontaktruta.model.ContactKey;
import se.malmo.www.kontaktruta.portlet.ContactController;
import senselogic.sitevision.api.Utils;
import senselogic.sitevision.api.context.PortletContextUtil;
import senselogic.sitevision.api.property.PropertyUtil;

/**
 * @author HEKA
 *
 */
public class ContactBoxUtils {
    protected final static Gson gson = new Gson();
    
    private final static Type contactsType =  new TypeToken<LinkedList<Contact>>() {}.getType();
    
    public static Map<ContactKey, Contact> getContacts(PortletRequest request) {
        Utils utils = (Utils)request.getAttribute("sitevision.utils");
        PortletContextUtil pcUtil = utils.getPortletContextUtil();
        PropertyUtil propertyUtil = utils.getPropertyUtil();
        
        Node currentPage = pcUtil.getCurrentPage();        
        
        // Get contacts from metadata
        String contactsJSON = propertyUtil.getString(currentPage, ContactController.CONTACTS_CITYAREAS_METADATA);
        if (contactsJSON != null && contactsJSON.trim().length() > 0) {
            try {
                List<Contact> contactsList = gson.fromJson(contactsJSON, contactsType);
                Map<ContactKey, Contact> contacts = new LinkedHashMap<ContactKey, Contact>();
                Iterator<Contact> i = contactsList.iterator();
                while (i.hasNext()) {
                    Contact contact = i.next();
                    contacts.put(contact.getKey(), contact);
                }
                return contacts;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
