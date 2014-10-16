/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.util.LinkedList;
import java.util.List;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Value;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import senselogic.sitevision.api.security.DirectoryUtil;

/**
 * @author HEKA
 *
 */
public class ContactObject {
    private final Log logger = LogFactory.getLog(this.getClass());

    private final Contact contact;
    private final DirectoryUtil directoryUtil;
    private Node node;
    private String name;
    private String title;
    private String mail;
    private String telephone;
    private String mobile;
    private String fax;
    private List<String> telephoneHours;
    private String postalAddress;
    private String postalCode;
    private String visitingAddress;
    private String homepage;
    private List<String> visitingHours; 
    private Boolean primecase;
    private String cn;
    private String guid;

    
    
    public ContactObject(Contact contact, DirectoryUtil directoryUtil) {
        super();
        this.contact = contact;
        this.directoryUtil = directoryUtil;

        try {
            node = directoryUtil.getNodeByDN(contact.getDn());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }                
    }
    
    private String getValue(String attribute) {
        if (node != null) {
            try {         
                Property property = directoryUtil.getAttributeAsProperty(node, attribute);
                if (property != null) {
                    if (property.getDefinition().isMultiple()) {
                        return property.getValues()[0].getString();
                    }
                    else {
                        return property.getString();
                    }
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    private Boolean getBoolean(String attribute) {
        if (node != null) {
            try {         
                Property property = directoryUtil.getAttributeAsProperty(node, attribute);
                if (property != null) {
                    if (property.getDefinition().isMultiple()) {
                        return property.getValues()[0].getBoolean();
                    }
                    else {
                        return property.getBoolean();
                    }
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    private List<String> getValues(String attribute) {
        if (node != null) {
            try {
                Property property = directoryUtil.getAttributeAsProperty(node, attribute);
                if (property != null) {
                    List<String> list = new LinkedList<String>();
                    if (property.getDefinition().isMultiple()) {
                        Value[] values = property.getValues();
                        for (int i=0; i<values.length; i++) {
                            list.add(values[i].getString());
                        }
                    }
                    else {
                        list.add(property.getString());
                    }
                    return list;
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }
    
    public String getName() {
        if (name == null) {
            if (contact.isPerson()) {
                name = getValue("fullname");
            }
            else {
                name = getValue("cn");
            }
        }
        return name;
    }
    
    public String getTitle() {
        if (title == null) {
            if (contact.isPerson()) {
                title = getValue("MalmoBefattning");
            }
            else {
                title = null;
            }
        }
        return title;            
    }
    
    public String getMail() {
        if (mail == null) {
            if (contact.isPerson()) {
                mail = getValue("mail");
            }
            if (mail == null) {
                mail = getValue("MalmoKonEpost");
            }
        }
        return mail;            
    }

    public String getTelephone() {
        if (telephone == null) {
            if (contact.isPerson()) {
                telephone = getValue("telephoneNumber");
            }
            if (telephone == null) {
                telephone = getValue("MalmoKonTelefonnr");
            }
        }
        return telephone;            
    }

    public String getFax() {
        if (fax == null) {
            if (contact.isPerson()) {
                fax = getValue("facsimileTelephoneNumber");
            }
            else {
                fax = getValue("MalmoKonFaxnr");
            }
        }
        return fax;            
    }

    public String getMobile() {
        if (mobile == null) {
            if (contact.isPerson()) {
                mobile = getValue("mobile");
            }
            if (mobile == null) {
                mobile = getValue("MalmoKonMobil");
            }
        }
        return mobile;            
    }

    public List<String> getTelephoneHours() {
        if (telephoneHours == null) {
            telephoneHours = getValues("MalmoKonTeletid");
        }
        return telephoneHours;            
    }

    public String getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = getValue("MalmoKonPostadr");
        }
        return postalAddress;            
    }
    
    public String getPostalCode() {
        if (postalCode == null) {
            postalCode = getValue("MalmoKonPostnr");                
        }
        return postalCode;            
    }

    public String getVisitingAddress() {
        if (visitingAddress == null) {
            visitingAddress = getValue("MalmoKonBesokadr");
        }
        return visitingAddress;            
    }

    public List<String> getVisitingHours() {
        if (visitingHours == null) {
            visitingHours = getValues("MalmoKonBesoktid");
        }
        return visitingHours;            
    }

    public String getHomepage() {
        if (homepage == null) {
            homepage = getValue("MalmoKonHemsida");            
        }
        return homepage;            
    }
    
    public boolean isPrimeCase() {
        if (primecase == null) {
            primecase = getBoolean("MalmoPrimecase");
        }
        if (primecase != null)
            return primecase.booleanValue();
        else
            return false;
    }

    public String getCn() {
        if (cn == null) {
            cn = getValue("cn");            
        }
        return cn;            
    }
    
    public String getGuid() {
        if (guid == null) {
            try {
                guid = node.getProperty("uid").getValue().toString();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return guid;
    }
}
