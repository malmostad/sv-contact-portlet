
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.UploadConstraints;


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
 *         &lt;element name="GetUploadConstraintsResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}UploadConstraints" minOccurs="0"/>
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
    "getUploadConstraintsResult"
})
@XmlRootElement(name = "GetUploadConstraintsResponse")
public class GetUploadConstraintsResponse {

    @XmlElementRef(name = "GetUploadConstraintsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<UploadConstraints> getUploadConstraintsResult;

    /**
     * Gets the value of the getUploadConstraintsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UploadConstraints }{@code >}
     *     
     */
    public JAXBElement<UploadConstraints> getGetUploadConstraintsResult() {
        return getUploadConstraintsResult;
    }

    /**
     * Sets the value of the getUploadConstraintsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UploadConstraints }{@code >}
     *     
     */
    public void setGetUploadConstraintsResult(JAXBElement<UploadConstraints> value) {
        this.getUploadConstraintsResult = ((JAXBElement<UploadConstraints> ) value);
    }

}
