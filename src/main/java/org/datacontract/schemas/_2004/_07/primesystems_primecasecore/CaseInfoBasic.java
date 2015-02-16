
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CaseInfoBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseInfoBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CaseCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CaseCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CaseEditableForContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CaseHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseOpened" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CaseTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CaseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseInfoBasic", propOrder = {
    "caseChanged",
    "caseCompleted",
    "caseCreated",
    "caseEditableForContact",
    "caseHeader",
    "caseId",
    "caseNumber",
    "caseOpened",
    "caseTypeId",
    "caseTypeName"
})
public class CaseInfoBasic {

    @XmlElement(name = "CaseChanged")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caseChanged;
    @XmlElementRef(name = "CaseCompleted", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> caseCompleted;
    @XmlElement(name = "CaseCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caseCreated;
    @XmlElement(name = "CaseEditableForContact")
    protected Boolean caseEditableForContact;
    @XmlElementRef(name = "CaseHeader", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> caseHeader;
    @XmlElement(name = "CaseId")
    protected Long caseId;
    @XmlElementRef(name = "CaseNumber", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> caseNumber;
    @XmlElementRef(name = "CaseOpened", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> caseOpened;
    @XmlElement(name = "CaseTypeId")
    protected Long caseTypeId;
    @XmlElementRef(name = "CaseTypeName", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> caseTypeName;

    /**
     * Gets the value of the caseChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseChanged() {
        return caseChanged;
    }

    /**
     * Sets the value of the caseChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseChanged(XMLGregorianCalendar value) {
        this.caseChanged = value;
    }

    /**
     * Gets the value of the caseCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCaseCompleted() {
        return caseCompleted;
    }

    /**
     * Sets the value of the caseCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCaseCompleted(JAXBElement<XMLGregorianCalendar> value) {
        this.caseCompleted = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the caseCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseCreated() {
        return caseCreated;
    }

    /**
     * Sets the value of the caseCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseCreated(XMLGregorianCalendar value) {
        this.caseCreated = value;
    }

    /**
     * Gets the value of the caseEditableForContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseEditableForContact() {
        return caseEditableForContact;
    }

    /**
     * Sets the value of the caseEditableForContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseEditableForContact(Boolean value) {
        this.caseEditableForContact = value;
    }

    /**
     * Gets the value of the caseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseHeader() {
        return caseHeader;
    }

    /**
     * Sets the value of the caseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseHeader(JAXBElement<String> value) {
        this.caseHeader = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseId(Long value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseNumber(JAXBElement<String> value) {
        this.caseNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the caseOpened property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCaseOpened() {
        return caseOpened;
    }

    /**
     * Sets the value of the caseOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCaseOpened(JAXBElement<XMLGregorianCalendar> value) {
        this.caseOpened = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

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

}
