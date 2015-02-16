
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.CaseInfo;


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
 *         &lt;element name="GetCaseResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}CaseInfo" minOccurs="0"/>
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
    "getCaseResult"
})
@XmlRootElement(name = "GetCaseResponse")
public class GetCaseResponse {

    @XmlElementRef(name = "GetCaseResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CaseInfo> getCaseResult;

    /**
     * Gets the value of the getCaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CaseInfo }{@code >}
     *     
     */
    public JAXBElement<CaseInfo> getGetCaseResult() {
        return getCaseResult;
    }

    /**
     * Sets the value of the getCaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CaseInfo }{@code >}
     *     
     */
    public void setGetCaseResult(JAXBElement<CaseInfo> value) {
        this.getCaseResult = ((JAXBElement<CaseInfo> ) value);
    }

}
