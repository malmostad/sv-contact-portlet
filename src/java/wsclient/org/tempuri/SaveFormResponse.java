
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.FormSavedReply;


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
 *         &lt;element name="SaveFormResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}FormSavedReply" minOccurs="0"/>
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
    "saveFormResult"
})
@XmlRootElement(name = "SaveFormResponse")
public class SaveFormResponse {

    @XmlElementRef(name = "SaveFormResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FormSavedReply> saveFormResult;

    /**
     * Gets the value of the saveFormResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FormSavedReply }{@code >}
     *     
     */
    public JAXBElement<FormSavedReply> getSaveFormResult() {
        return saveFormResult;
    }

    /**
     * Sets the value of the saveFormResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FormSavedReply }{@code >}
     *     
     */
    public void setSaveFormResult(JAXBElement<FormSavedReply> value) {
        this.saveFormResult = ((JAXBElement<FormSavedReply> ) value);
    }

}
