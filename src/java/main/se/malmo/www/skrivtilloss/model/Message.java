/**
 * 
 */
package se.malmo.www.skrivtilloss.model;

import java.util.HashMap;
import java.util.Map;

import org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public class Message {
    private Map<String, String> field = new HashMap<String, String>();
    private NewCaseReply reply;
    
    public final static String NAME_PCID = "465";
    public final static String EMAIL_PCID = "467";
    public final static String CONTACTBYEMAIL_PCID = "464";
    public final static String TELEPHONE_PCID = "466";
    public final static String TYPE_PCID = "382";
    public final static String MESSAGE_PCID = "326";
    public final static String SOURCEURL_PCID = "574";
    public final static String USERIP_PCID = "575";
    
    
    /**
     * @return the name
     */
    public String getName() {
        return field.get(NAME_PCID);
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return field.get(EMAIL_PCID);
    }

    /**
     * @return the contactByEmail
     */
    public boolean isContactByEmail() {
        String contactByEmail = field.get(CONTACTBYEMAIL_PCID);
        return (contactByEmail != null && Boolean.parseBoolean(contactByEmail));
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return field.get(TELEPHONE_PCID);
    }
    
    /**
     * @return the type
     */
    public String getType() {
        return field.get(TYPE_PCID);
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return field.get(MESSAGE_PCID);
    }
    
    /**
     * @return the userIP
     */
    public String getUserIP() {
        return field.get(USERIP_PCID);
    }

    /**
     * @param userIP the userIP to set
     */
    public void setUserIP(String userIP) {
        this.field.put(USERIP_PCID, userIP);
    }
    
    /**
     * @return the sourceUrl
     */
    public String getSourceUrl() {
        return field.get(SOURCEURL_PCID);
    }
    
    /**
     * @param sourceUrl the sourceUrl to set
     */
    public void setSourceUrl(String sourceUrl) {
        this.field.put(SOURCEURL_PCID, sourceUrl);
    }
    
    /**
     * @return the field
     */
    public Map<String, String> getField() {
        return field;
    }
    /**
     * @param field the field to set
     */
    public void setField(Map<String, String> field) {
        this.field = field;
    }
    /**
     * @return the reply
     */
    public NewCaseReply getReply() {
        return reply;
    }
    /**
     * @param reply the reply to set
     */
    public void setReply(NewCaseReply reply) {
        this.reply = reply;
    }

}
