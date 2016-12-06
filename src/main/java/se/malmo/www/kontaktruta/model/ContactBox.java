/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public class ContactBox implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 39522676807335737L;
    
    @Getter @Setter private boolean inheritance;
    @Getter @Setter private boolean districtSelector;
    @Getter @Setter private String text;
    @Getter @Setter private Map<ContactKey, Contact> contacts = new LinkedHashMap<ContactKey, Contact>();
}
