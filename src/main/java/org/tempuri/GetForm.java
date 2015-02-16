
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactInfo" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ContactInfo" minOccurs="0"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactInfo",
    "caseId"
})
@XmlRootElement(name = "GetForm")
public class GetForm {

    @XmlElementRef(name = "contactInfo", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ContactInfo> contactInfo;
    protected Integer caseId;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     *     
     */
    public JAXBElement<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     *     
     */
    public void setContactInfo(JAXBElement<ContactInfo> value) {
        this.contactInfo = ((JAXBElement<ContactInfo> ) value);
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseId(Integer value) {
        this.caseId = value;
    }

}
