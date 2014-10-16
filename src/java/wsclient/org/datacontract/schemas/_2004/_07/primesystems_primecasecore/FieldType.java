
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TextBox"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="DropDown"/>
 *     &lt;enumeration value="DateInput"/>
 *     &lt;enumeration value="CheckBox"/>
 *     &lt;enumeration value="RadioButton"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Header"/>
 *     &lt;enumeration value="MultiCheckBox"/>
 *     &lt;enumeration value="PageBreak"/>
 *     &lt;enumeration value="UnKnown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("TextBox")
    TEXT_BOX("TextBox"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("DropDown")
    DROP_DOWN("DropDown"),
    @XmlEnumValue("DateInput")
    DATE_INPUT("DateInput"),
    @XmlEnumValue("CheckBox")
    CHECK_BOX("CheckBox"),
    @XmlEnumValue("RadioButton")
    RADIO_BUTTON("RadioButton"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Header")
    HEADER("Header"),
    @XmlEnumValue("MultiCheckBox")
    MULTI_CHECK_BOX("MultiCheckBox"),
    @XmlEnumValue("PageBreak")
    PAGE_BREAK("PageBreak"),
    @XmlEnumValue("UnKnown")
    UN_KNOWN("UnKnown");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
