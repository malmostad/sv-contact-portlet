/**
 * 
 */
package se.malmo.www.skrivtilloss.model;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public class Config {
    private String smtpHost;
    private String mailFrom;
    private String wsdlLocation;
    
    /**
     * @return the smtpHost
     */
    public String getSmtpHost() {
        return smtpHost;
    }
    /**
     * @param smtpHost the smtpHost to set
     */
    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }
    /**
     * @return the mailFrom
     */
    public String getMailFrom() {
        return mailFrom;
    }
    /**
     * @param mailFrom the mailFrom to set
     */
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }
    /**
     * @return the wsdlLocation
     */
    public String getWsdlLocation() {
        return wsdlLocation;
    }
    /**
     * @param wsdlLocation the wsdlLocation to set
     */
    public void setWsdlLocation(String wsdlLocation) {
        this.wsdlLocation = wsdlLocation;
    }
    
    
}
