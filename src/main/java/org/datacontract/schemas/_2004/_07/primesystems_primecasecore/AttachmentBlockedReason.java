
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentBlockedReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentBlockedReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DeniedExtension"/>
 *     &lt;enumeration value="ExceedsFileSizeLimit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentBlockedReason")
@XmlEnum
public enum AttachmentBlockedReason {

    @XmlEnumValue("DeniedExtension")
    DENIED_EXTENSION("DeniedExtension"),
    @XmlEnumValue("ExceedsFileSizeLimit")
    EXCEEDS_FILE_SIZE_LIMIT("ExceedsFileSizeLimit");
    private final String value;

    AttachmentBlockedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentBlockedReason fromValue(String v) {
        for (AttachmentBlockedReason c: AttachmentBlockedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
