
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.Form;


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
 *         &lt;element name="form" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}Form" minOccurs="0"/>
 *         &lt;element name="signText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "form",
    "signText"
})
@XmlRootElement(name = "SaveRegistrationDraft")
public class SaveRegistrationDraft {

    @XmlElementRef(name = "authenticationInfo", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ContactAuthenticationInfo> authenticationInfo;
    @XmlElementRef(name = "form", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Form> form;
    @XmlElementRef(name = "signText", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> signText;

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
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Form }{@code >}
     *     
     */
    public JAXBElement<Form> getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Form }{@code >}
     *     
     */
    public void setForm(JAXBElement<Form> value) {
        this.form = ((JAXBElement<Form> ) value);
    }

    /**
     * Gets the value of the signText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignText() {
        return signText;
    }

    /**
     * Sets the value of the signText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignText(JAXBElement<String> value) {
        this.signText = ((JAXBElement<String> ) value);
    }

}
