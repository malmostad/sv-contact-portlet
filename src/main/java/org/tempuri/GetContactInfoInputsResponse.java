
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfoInputs;


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
 *         &lt;element name="GetContactInfoInputsResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ContactInfoInputs" minOccurs="0"/>
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
    "getContactInfoInputsResult"
})
@XmlRootElement(name = "GetContactInfoInputsResponse")
public class GetContactInfoInputsResponse {

    @XmlElementRef(name = "GetContactInfoInputsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ContactInfoInputs> getContactInfoInputsResult;

    /**
     * Gets the value of the getContactInfoInputsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactInfoInputs }{@code >}
     *     
     */
    public JAXBElement<ContactInfoInputs> getGetContactInfoInputsResult() {
        return getContactInfoInputsResult;
    }

    /**
     * Sets the value of the getContactInfoInputsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactInfoInputs }{@code >}
     *     
     */
    public void setGetContactInfoInputsResult(JAXBElement<ContactInfoInputs> value) {
        this.getContactInfoInputsResult = ((JAXBElement<ContactInfoInputs> ) value);
    }

}
