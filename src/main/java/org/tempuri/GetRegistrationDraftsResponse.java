
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfTempFormBasic;


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
 *         &lt;element name="GetRegistrationDraftsResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfTempFormBasic" minOccurs="0"/>
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
    "getRegistrationDraftsResult"
})
@XmlRootElement(name = "GetRegistrationDraftsResponse")
public class GetRegistrationDraftsResponse {

    @XmlElementRef(name = "GetRegistrationDraftsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTempFormBasic> getRegistrationDraftsResult;

    /**
     * Gets the value of the getRegistrationDraftsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTempFormBasic }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTempFormBasic> getGetRegistrationDraftsResult() {
        return getRegistrationDraftsResult;
    }

    /**
     * Sets the value of the getRegistrationDraftsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTempFormBasic }{@code >}
     *     
     */
    public void setGetRegistrationDraftsResult(JAXBElement<ArrayOfTempFormBasic> value) {
        this.getRegistrationDraftsResult = ((JAXBElement<ArrayOfTempFormBasic> ) value);
    }

}
