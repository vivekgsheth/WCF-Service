
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.carrental.UserCar;


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
 *         &lt;element name="giveUserCarResult" type="{http://schemas.datacontract.org/2004/07/Carrental}UserCar" minOccurs="0"/>
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
    "giveUserCarResult"
})
@XmlRootElement(name = "giveUserCarResponse")
public class GiveUserCarResponse {

    @XmlElementRef(name = "giveUserCarResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserCar> giveUserCarResult;

    /**
     * Gets the value of the giveUserCarResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserCar }{@code >}
     *     
     */
    public JAXBElement<UserCar> getGiveUserCarResult() {
        return giveUserCarResult;
    }

    /**
     * Sets the value of the giveUserCarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserCar }{@code >}
     *     
     */
    public void setGiveUserCarResult(JAXBElement<UserCar> value) {
        this.giveUserCarResult = value;
    }

}
