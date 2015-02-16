
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfCaseInfoBasic;


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
 *         &lt;element name="GetCasesForContactResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ArrayOfCaseInfoBasic" minOccurs="0"/>
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
    "getCasesForContactResult"
})
@XmlRootElement(name = "GetCasesForContactResponse")
public class GetCasesForContactResponse {

    @XmlElementRef(name = "GetCasesForContactResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCaseInfoBasic> getCasesForContactResult;

    /**
     * Gets the value of the getCasesForContactResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCaseInfoBasic }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCaseInfoBasic> getGetCasesForContactResult() {
        return getCasesForContactResult;
    }

    /**
     * Sets the value of the getCasesForContactResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCaseInfoBasic }{@code >}
     *     
     */
    public void setGetCasesForContactResult(JAXBElement<ArrayOfCaseInfoBasic> value) {
        this.getCasesForContactResult = ((JAXBElement<ArrayOfCaseInfoBasic> ) value);
    }

}
