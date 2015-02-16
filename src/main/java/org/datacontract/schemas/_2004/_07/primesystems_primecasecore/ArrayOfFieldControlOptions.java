
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldControlOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldControlOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldControlOptions" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}FieldControlOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldControlOptions", propOrder = {
    "fieldControlOptions"
})
public class ArrayOfFieldControlOptions {

    @XmlElement(name = "FieldControlOptions", nillable = true)
    protected List<FieldControlOptions> fieldControlOptions;

    /**
     * Gets the value of the fieldControlOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldControlOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldControlOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldControlOptions }
     * 
     * 
     */
    public List<FieldControlOptions> getFieldControlOptions() {
        if (fieldControlOptions == null) {
            fieldControlOptions = new ArrayList<FieldControlOptions>();
        }
        return this.fieldControlOptions;
    }

}
