
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldControlOptions" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfFieldControlOptions" minOccurs="0"/>
 *         &lt;element name="FieldControlType" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}FieldControlType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidationExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldControl", propOrder = {
    "fieldControlOptions",
    "fieldControlType",
    "required",
    "validationExpression",
    "value"
})
public class FieldControl {

    @XmlElementRef(name = "FieldControlOptions", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFieldControlOptions> fieldControlOptions;
    @XmlElement(name = "FieldControlType")
    protected FieldControlType fieldControlType;
    @XmlElement(name = "Required")
    protected Boolean required;
    @XmlElementRef(name = "ValidationExpression", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> validationExpression;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> value;

    /**
     * Gets the value of the fieldControlOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldControlOptions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFieldControlOptions> getFieldControlOptions() {
        return fieldControlOptions;
    }

    /**
     * Sets the value of the fieldControlOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldControlOptions }{@code >}
     *     
     */
    public void setFieldControlOptions(JAXBElement<ArrayOfFieldControlOptions> value) {
        this.fieldControlOptions = ((JAXBElement<ArrayOfFieldControlOptions> ) value);
    }

    /**
     * Gets the value of the fieldControlType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldControlType }
     *     
     */
    public FieldControlType getFieldControlType() {
        return fieldControlType;
    }

    /**
     * Sets the value of the fieldControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldControlType }
     *     
     */
    public void setFieldControlType(FieldControlType value) {
        this.fieldControlType = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the validationExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationExpression() {
        return validationExpression;
    }

    /**
     * Sets the value of the validationExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationExpression(JAXBElement<String> value) {
        this.validationExpression = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = ((JAXBElement<String> ) value);
    }

}
