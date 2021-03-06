
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFormField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFormField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormField" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}FormField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFormField", propOrder = {
    "formField"
})
public class ArrayOfFormField {

    @XmlElement(name = "FormField", nillable = true)
    protected List<FormField> formField;

    /**
     * Gets the value of the formField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormField }
     * 
     * 
     */
    public List<FormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<FormField>();
        }
        return this.formField;
    }

}
