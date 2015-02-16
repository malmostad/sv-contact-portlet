
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for Form complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Form">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CaseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfFormField" minOccurs="0"/>
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HiddenGroups" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SignCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TempFormContactDetails" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ContactInfo" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Form", propOrder = {
    "caseTypeId",
    "caseTypeName",
    "fields",
    "formId",
    "formName",
    "hiddenGroups",
    "signCase",
    "signText",
    "tempFormContactDetails",
    "uniqueId"
})
public class Form {

    @XmlElement(name = "CaseTypeId")
    protected Long caseTypeId;
    @XmlElementRef(name = "CaseTypeName", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> caseTypeName;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFormField> fields;
    @XmlElement(name = "FormId")
    protected Long formId;
    @XmlElementRef(name = "FormName", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> formName;
    @XmlElementRef(name = "HiddenGroups", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> hiddenGroups;
    @XmlElement(name = "SignCase")
    protected Boolean signCase;
    @XmlElementRef(name = "SignText", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> signText;
    @XmlElementRef(name = "TempFormContactDetails", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ContactInfo> tempFormContactDetails;
    @XmlElementRef(name = "UniqueId", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> uniqueId;

    /**
     * Gets the value of the caseTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseTypeId() {
        return caseTypeId;
    }

    /**
     * Sets the value of the caseTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseTypeId(Long value) {
        this.caseTypeId = value;
    }

    /**
     * Gets the value of the caseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseTypeName() {
        return caseTypeName;
    }

    /**
     * Sets the value of the caseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseTypeName(JAXBElement<String> value) {
        this.caseTypeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFormField> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfFormField> value) {
        this.fields = ((JAXBElement<ArrayOfFormField> ) value);
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormId(Long value) {
        this.formId = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormName(JAXBElement<String> value) {
        this.formName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hiddenGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getHiddenGroups() {
        return hiddenGroups;
    }

    /**
     * Sets the value of the hiddenGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setHiddenGroups(JAXBElement<ArrayOfstring> value) {
        this.hiddenGroups = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the signCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignCase() {
        return signCase;
    }

    /**
     * Sets the value of the signCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignCase(Boolean value) {
        this.signCase = value;
    }

    /**
     * Gets the value of the signText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignText() {
        return signText;
    }

    /**
     * Sets the value of the signText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignText(JAXBElement<String> value) {
        this.signText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tempFormContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     *     
     */
    public JAXBElement<ContactInfo> getTempFormContactDetails() {
        return tempFormContactDetails;
    }

    /**
     * Sets the value of the tempFormContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     *     
     */
    public void setTempFormContactDetails(JAXBElement<ContactInfo> value) {
        this.tempFormContactDetails = ((JAXBElement<ContactInfo> ) value);
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueId(JAXBElement<String> value) {
        this.uniqueId = ((JAXBElement<String> ) value);
    }

}
