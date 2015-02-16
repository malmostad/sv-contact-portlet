
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply;


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
 *         &lt;element name="RegisterCaseWithHandlerAndContactDetailsResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}NewCaseReply" minOccurs="0"/>
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
    "registerCaseWithHandlerAndContactDetailsResult"
})
@XmlRootElement(name = "RegisterCaseWithHandlerAndContactDetailsResponse")
public class RegisterCaseWithHandlerAndContactDetailsResponse {

    @XmlElementRef(name = "RegisterCaseWithHandlerAndContactDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<NewCaseReply> registerCaseWithHandlerAndContactDetailsResult;

    /**
     * Gets the value of the registerCaseWithHandlerAndContactDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}
     *     
     */
    public JAXBElement<NewCaseReply> getRegisterCaseWithHandlerAndContactDetailsResult() {
        return registerCaseWithHandlerAndContactDetailsResult;
    }

    /**
     * Sets the value of the registerCaseWithHandlerAndContactDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}
     *     
     */
    public void setRegisterCaseWithHandlerAndContactDetailsResult(JAXBElement<NewCaseReply> value) {
        this.registerCaseWithHandlerAndContactDetailsResult = ((JAXBElement<NewCaseReply> ) value);
    }

}
