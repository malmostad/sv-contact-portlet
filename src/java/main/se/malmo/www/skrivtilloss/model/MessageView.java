/**
 * 
 */
package se.malmo.www.skrivtilloss.model;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
public enum MessageView {
    FORM("writetousForm"),
    CONFIRM("writetousConfirm"),
    ERROR("writetousError");
    
    private final String name;
    
    MessageView(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
