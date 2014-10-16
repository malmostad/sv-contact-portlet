
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCaseInfoBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCaseInfoBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseInfoBasic" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}CaseInfoBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCaseInfoBasic", propOrder = {
    "caseInfoBasic"
})
public class ArrayOfCaseInfoBasic {

    @XmlElement(name = "CaseInfoBasic", nillable = true)
    protected List<CaseInfoBasic> caseInfoBasic;

    /**
     * Gets the value of the caseInfoBasic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseInfoBasic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseInfoBasic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseInfoBasic }
     * 
     * 
     */
    public List<CaseInfoBasic> getCaseInfoBasic() {
        if (caseInfoBasic == null) {
            caseInfoBasic = new ArrayList<CaseInfoBasic>();
        }
        return this.caseInfoBasic;
    }

}
