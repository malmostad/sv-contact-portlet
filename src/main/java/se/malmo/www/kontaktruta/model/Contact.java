/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

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
    
    @Getter @Setter private String cn;
    
    @Getter @Setter private String dn;
    
    @Getter @Setter private int type = 1;
    
    @Getter @Setter private String[] attributes;
    
    @Getter @Setter private String district;
    
    @Getter @Setter private transient int id; 
    
    public boolean isPerson() {
        return (type == PERSON);
    }
    
    public boolean isFunction() {
        return (type == FUNCTION);
    }
    
    /**
     * @return the contactKey
     */
    public ContactKey getKey() {
        return new ContactKey(this.dn, this.district);
    }
    
    /**
     * @param apiContact
     * @return the contactObject
     */
    public ContactObject getContactObject(APIContact apiContact) {
        return new ContactObject(this, apiContact);
    }
}
