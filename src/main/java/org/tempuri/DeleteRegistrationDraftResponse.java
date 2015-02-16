
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.DeleteTempFormReply;


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
 *         &lt;element name="DeleteRegistrationDraftResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}DeleteTempFormReply" minOccurs="0"/>
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
    "deleteRegistrationDraftResult"
})
@XmlRootElement(name = "DeleteRegistrationDraftResponse")
public class DeleteRegistrationDraftResponse {

    @XmlElementRef(name = "DeleteRegistrationDraftResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<DeleteTempFormReply> deleteRegistrationDraftResult;

    /**
     * Gets the value of the deleteRegistrationDraftResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeleteTempFormReply }{@code >}
     *     
     */
    public JAXBElement<DeleteTempFormReply> getDeleteRegistrationDraftResult() {
        return deleteRegistrationDraftResult;
    }

    /**
     * Sets the value of the deleteRegistrationDraftResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeleteTempFormReply }{@code >}
     *     
     */
    public void setDeleteRegistrationDraftResult(JAXBElement<DeleteTempFormReply> value) {
        this.deleteRegistrationDraftResult = ((JAXBElement<DeleteTempFormReply> ) value);
    }

}
