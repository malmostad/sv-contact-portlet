package se.malmo.www.kontaktruta.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Henrik Rydstedt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Avatars {
    @Getter @Setter String xlarge;
    @Getter @Setter String large;
    @Getter @Setter String medium;
    @Getter @Setter String small;
}
