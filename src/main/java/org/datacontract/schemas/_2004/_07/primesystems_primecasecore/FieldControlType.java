
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TextBox"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="Label"/>
 *     &lt;enumeration value="DropDown"/>
 *     &lt;enumeration value="RadioButton"/>
 *     &lt;enumeration value="CheckBox"/>
 *     &lt;enumeration value="DateInput"/>
 *     &lt;enumeration value="MultiCheckBox"/>
 *     &lt;enumeration value="Header"/>
 *     &lt;enumeration value="InfoText"/>
 *     &lt;enumeration value="PageBreak"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldControlType")
@XmlEnum
public enum FieldControlType {

    @XmlEnumValue("TextBox")
    TEXT_BOX("TextBox"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Label")
    LABEL("Label"),
    @XmlEnumValue("DropDown")
    DROP_DOWN("DropDown"),
    @XmlEnumValue("RadioButton")
    RADIO_BUTTON("RadioButton"),
    @XmlEnumValue("CheckBox")
    CHECK_BOX("CheckBox"),
    @XmlEnumValue("DateInput")
    DATE_INPUT("DateInput"),
    @XmlEnumValue("MultiCheckBox")
    MULTI_CHECK_BOX("MultiCheckBox"),
    @XmlEnumValue("Header")
    HEADER("Header"),
    @XmlEnumValue("InfoText")
    INFO_TEXT("InfoText"),
    @XmlEnumValue("PageBreak")
    PAGE_BREAK("PageBreak");
    private final String value;

    FieldControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldControlType fromValue(String v) {
        for (FieldControlType c: FieldControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
