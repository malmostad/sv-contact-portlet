
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewCaseReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewCaseReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationForm" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}ActivityInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewCaseReply", propOrder = {
    "caseId",
    "caseNumber",
    "message",
    "registrationForm"
})
public class NewCaseReply {

    @XmlElement(name = "CaseId")
    protected int caseId;
    @XmlElement(name = "CaseNumber", required = true, nillable = true)
    protected String caseNumber;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "RegistrationForm", required = true, nillable = true)
    protected ActivityInfo registrationForm;

    /**
     * Gets the value of the caseId property.
     * 
     */
    public int getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     */
    public void setCaseId(int value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the registrationForm property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInfo }
     *     
     */
    public ActivityInfo getRegistrationForm() {
        return registrationForm;
    }

    /**
     * Sets the value of the registrationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInfo }
     *     
     */
    public void setRegistrationForm(ActivityInfo value) {
        this.registrationForm = value;
    }

}
