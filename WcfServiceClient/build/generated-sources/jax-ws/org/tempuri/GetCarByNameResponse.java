
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.carrental.ArrayOfcar;


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
 *         &lt;element name="GetCarByNameResult" type="{http://schemas.datacontract.org/2004/07/Carrental}ArrayOfcar" minOccurs="0"/>
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
    "getCarByNameResult"
})
@XmlRootElement(name = "GetCarByNameResponse")
public class GetCarByNameResponse {

    @XmlElementRef(name = "GetCarByNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfcar> getCarByNameResult;

    /**
     * Gets the value of the getCarByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfcar> getGetCarByNameResult() {
        return getCarByNameResult;
    }

    /**
     * Sets the value of the getCarByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}
     *     
     */
    public void setGetCarByNameResult(JAXBElement<ArrayOfcar> value) {
        this.getCarByNameResult = value;
    }

}
