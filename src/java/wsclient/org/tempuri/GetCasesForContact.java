
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo;


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
 *         &lt;element name="authenticationInfo" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ContactAuthenticationInfo" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activeCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="completedCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "authenticationInfo",
    "fromDate",
    "activeCases",
    "completedCases"
})
@XmlRootElement(name = "GetCasesForContact")
public class GetCasesForContact {

    @XmlElementRef(name = "authenticationInfo", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ContactAuthenticationInfo> authenticationInfo;
    @XmlElementRef(name = "fromDate", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fromDate;
    protected Boolean activeCases;
    protected Boolean completedCases;

    /**
     * Gets the value of the authenticationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}
     *     
     */
    public JAXBElement<ContactAuthenticationInfo> getAuthenticationInfo() {
        return authenticationInfo;
    }

    /**
     * Sets the value of the authenticationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}
     *     
     */
    public void setAuthenticationInfo(JAXBElement<ContactAuthenticationInfo> value) {
        this.authenticationInfo = ((JAXBElement<ContactAuthenticationInfo> ) value);
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFromDate(JAXBElement<XMLGregorianCalendar> value) {
        this.fromDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the activeCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveCases() {
        return activeCases;
    }

    /**
     * Sets the value of the activeCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveCases(Boolean value) {
        this.activeCases = value;
    }

    /**
     * Gets the value of the completedCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletedCases() {
        return completedCases;
    }

    /**
     * Sets the value of the completedCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletedCases(Boolean value) {
        this.completedCases = value;
    }

}
