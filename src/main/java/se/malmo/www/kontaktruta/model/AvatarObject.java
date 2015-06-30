package se.malmo.www.kontaktruta.model;

import lombok.Getter;

/**
 *
 * @author Henrik Rydstedt
 */
public class AvatarObject {
    @Getter String url;
    @Getter String size;
    
    public AvatarObject(String url, String size) {
        this.url = url;
        this.size = size;
    }
}
