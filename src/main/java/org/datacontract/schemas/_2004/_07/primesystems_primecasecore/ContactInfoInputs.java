
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoInputs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoInputs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfContactInfoField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoInputs", propOrder = {
    "fields"
})
public class ContactInfoInputs {

    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContactInfoField> fields;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactInfoField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContactInfoField> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactInfoField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfContactInfoField> value) {
        this.fields = ((JAXBElement<ArrayOfContactInfoField> ) value);
    }

}
