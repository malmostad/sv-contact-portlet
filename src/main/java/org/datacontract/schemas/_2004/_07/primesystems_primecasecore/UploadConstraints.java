
package org.datacontract.schemas._2004._07.primesystems_primecasecore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for UploadConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockedExtensions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MaxUploadFileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadConstraints", propOrder = {
    "blockedExtensions",
    "maxUploadFileSize"
})
public class UploadConstraints {

    @XmlElementRef(name = "BlockedExtensions", namespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> blockedExtensions;
    @XmlElement(name = "MaxUploadFileSize")
    protected Integer maxUploadFileSize;

    /**
     * Gets the value of the blockedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getBlockedExtensions() {
        return blockedExtensions;
    }

    /**
     * Sets the value of the blockedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setBlockedExtensions(JAXBElement<ArrayOfstring> value) {
        this.blockedExtensions = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the maxUploadFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUploadFileSize() {
        return maxUploadFileSize;
    }

    /**
     * Sets the value of the maxUploadFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUploadFileSize(Integer value) {
        this.maxUploadFileSize = value;
    }

}
