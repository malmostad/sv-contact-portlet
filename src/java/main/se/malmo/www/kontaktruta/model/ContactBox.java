/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public class ContactBox implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 39522676807335737L;
    
    private boolean inheritance;
    private boolean districtSelector;
    private String text;
    private Map<ContactKey, Contact> contacts = new LinkedHashMap<ContactKey, Contact>();
    /**
     * @return the inheritance
     */
    public boolean isInheritance() {
        return inheritance;
    }
    /**
     * @param inheritance the inheritance to set
     */
    public void setInheritance(boolean inheritance) {
        this.inheritance = inheritance;
    }
    /**
     * @return the districtSelector
     */
    public boolean isDistrictSelector() {
        return districtSelector;
    }
    /**
     * @param districtSelector the districtSelector to set
     */
    public void setDistrictSelector(boolean districtSelector) {
        this.districtSelector = districtSelector;
    }
    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * @return the contacts
     */
    public Map<ContactKey, Contact> getContacts() {
        return contacts;
    }
    /**
     * @param contacts the contacts to set
     */
    public void setContacts(Map<ContactKey, Contact> contacts) {
        this.contacts = contacts;
    }
    
}
