
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldControls" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfFieldControl" minOccurs="0"/>
 *         &lt;element name="FieldType" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}FieldType" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimeCaseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RenderAsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormField", propOrder = {
    "fieldControls",
    "fieldType",
    "group",
    "helpText",
    "hidden",
    "label",
    "primeCaseId",
    "renderAsHidden"
})
public class FormField {

    @XmlElementRef(name = "FieldControls", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFieldControl> fieldControls;
    @XmlElement(name = "FieldType")
    protected FieldType fieldType;
    @XmlElementRef(name = "Group", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> group;
    @XmlElementRef(name = "HelpText", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> helpText;
    @XmlElement(name = "Hidden")
    protected Boolean hidden;
    @XmlElementRef(name = "Label", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> label;
    @XmlElement(name = "PrimeCaseId")
    protected Integer primeCaseId;
    @XmlElement(name = "RenderAsHidden")
    protected Boolean renderAsHidden;

    /**
     * Gets the value of the fieldControls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldControl }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFieldControl> getFieldControls() {
        return fieldControls;
    }

    /**
     * Sets the value of the fieldControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldControl }{@code >}
     *     
     */
    public void setFieldControls(JAXBElement<ArrayOfFieldControl> value) {
        this.fieldControls = ((JAXBElement<ArrayOfFieldControl> ) value);
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setFieldType(FieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroup(JAXBElement<String> value) {
        this.group = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHelpText(JAXBElement<String> value) {
        this.helpText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primeCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimeCaseId() {
        return primeCaseId;
    }

    /**
     * Sets the value of the primeCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimeCaseId(Integer value) {
        this.primeCaseId = value;
    }

    /**
     * Gets the value of the renderAsHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenderAsHidden() {
        return renderAsHidden;
    }

    /**
     * Sets the value of the renderAsHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderAsHidden(Boolean value) {
        this.renderAsHidden = value;
    }

}
