
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBlockedAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBlockedAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockedAttachment" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}BlockedAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBlockedAttachment", propOrder = {
    "blockedAttachment"
})
public class ArrayOfBlockedAttachment {

    @XmlElement(name = "BlockedAttachment", nillable = true)
    protected List<BlockedAttachment> blockedAttachment;

    /**
     * Gets the value of the blockedAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockedAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockedAttachment }
     * 
     * 
     */
    public List<BlockedAttachment> getBlockedAttachment() {
        if (blockedAttachment == null) {
            blockedAttachment = new ArrayList<BlockedAttachment>();
        }
        return this.blockedAttachment;
    }

}
