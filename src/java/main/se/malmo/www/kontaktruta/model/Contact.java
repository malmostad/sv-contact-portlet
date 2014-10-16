/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.io.Serializable;

import senselogic.sitevision.api.security.DirectoryUtil;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
/**
 * @author HEKA
 *
 */
public class Contact implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -334210778003761394L;

    private static final int PERSON = 1;
    private static final int FUNCTION = 2;
    
    private String cn;
    private String dn;
    private int type = 1;
    private String[] attributes;
    private String district;
    private transient int id; 
    
    /**
     * @return the cn
     */
    public String getCn() {
        return cn;
    }
    /**
     * @param cn the cn to set
     */
    public void setCn(String cn) {
        this.cn = cn;
    }
    
    /**
     * @return
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * @return the dn
     */
    public String getDn() {
        return dn;
    }
    /**
     * @param dn the dn to set
     */
    public void setDn(String dn) {
        this.dn = dn;
    }
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    
    public boolean isPerson() {
        return (type == PERSON);
    }
    
    public boolean isFunction() {
        return (type == FUNCTION);
    }
    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
    }
    /**
     * @return the attributes
     */
    public String[] getAttributes() {
        return attributes;
    }
    
    /**
     * @return the contactKey
     */
    public ContactKey getKey() {
        return new ContactKey(this.dn, this.district);
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param directoryUtil
     * @return the contactObject
     */
    public ContactObject getContactObject(DirectoryUtil directoryUtil) {
        return new ContactObject(this, directoryUtil);
    }
}
