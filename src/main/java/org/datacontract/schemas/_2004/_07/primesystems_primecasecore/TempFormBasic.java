
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
 * <p>Java class for TempFormBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TempFormBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PcFormId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TempFormId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TempFormBasic", propOrder = {
    "caseType",
    "caseTypeId",
    "created",
    "pcFormId",
    "tempFormId",
    "title",
    "uniqueId",
    "updated"
})
public class TempFormBasic {

    @XmlElementRef(name = "CaseType", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> caseType;
    @XmlElement(name = "CaseTypeId")
    protected Long caseTypeId;
    @XmlElement(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "PcFormId")
    protected Long pcFormId;
    @XmlElement(name = "TempFormId")
    protected Long tempFormId;
    @XmlElementRef(name = "Title", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "UniqueId", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<String> uniqueId;
    @XmlElementRef(name = "Updated", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> updated;

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseType(JAXBElement<String> value) {
        this.caseType = ((JAXBElement<String> ) value);
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the pcFormId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPcFormId() {
        return pcFormId;
    }

    /**
     * Sets the value of the pcFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPcFormId(Long value) {
        this.pcFormId = value;
    }

    /**
     * Gets the value of the tempFormId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTempFormId() {
        return tempFormId;
    }

    /**
     * Sets the value of the tempFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTempFormId(Long value) {
        this.tempFormId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.updated = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
