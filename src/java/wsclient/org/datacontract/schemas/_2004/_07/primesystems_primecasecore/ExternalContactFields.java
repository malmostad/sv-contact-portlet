
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalContactFields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalContactFields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstName"/>
 *     &lt;enumeration value="LastName"/>
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="CelluarPhone"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="PostalCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExternalContactFields")
@XmlEnum
public enum ExternalContactFields {

    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),
    @XmlEnumValue("CelluarPhone")
    CELLUAR_PHONE("CelluarPhone"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS("PostalAddress"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode");
    private final String value;

    ExternalContactFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalContactFields fromValue(String v) {
        for (ExternalContactFields c: ExternalContactFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
