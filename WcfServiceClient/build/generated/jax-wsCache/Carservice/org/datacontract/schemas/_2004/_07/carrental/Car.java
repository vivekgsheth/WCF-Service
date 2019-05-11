
package org.datacontract.schemas._2004._07.carrental;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for car complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="car">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cartype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fare" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seatingcap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
    "carid",
    "carname",
    "carnum",
    "cartype",
    "fare",
    "seatingcap"
})
public class Car {

    protected Integer carid;
    @XmlElementRef(name = "carname", namespace = "http://schemas.datacontract.org/2004/07/Carrental", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carname;
    @XmlElementRef(name = "carnum", namespace = "http://schemas.datacontract.org/2004/07/Carrental", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carnum;
    @XmlElementRef(name = "cartype", namespace = "http://schemas.datacontract.org/2004/07/Carrental", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cartype;
    protected Integer fare;
    @XmlElementRef(name = "seatingcap", namespace = "http://schemas.datacontract.org/2004/07/Carrental", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatingcap;

    /**
     * Gets the value of the carid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarid() {
        return carid;
    }

    /**
     * Sets the value of the carid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarid(Integer value) {
        this.carid = value;
    }

    /**
     * Gets the value of the carname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarname() {
        return carname;
    }

    /**
     * Sets the value of the carname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarname(JAXBElement<String> value) {
        this.carname = value;
    }

    /**
     * Gets the value of the carnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarnum() {
        return carnum;
    }

    /**
     * Sets the value of the carnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarnum(JAXBElement<String> value) {
        this.carnum = value;
    }

    /**
     * Gets the value of the cartype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCartype() {
        return cartype;
    }

    /**
     * Sets the value of the cartype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCartype(JAXBElement<String> value) {
        this.cartype = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFare(Integer value) {
        this.fare = value;
    }

    /**
     * Gets the value of the seatingcap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatingcap() {
        return seatingcap;
    }

    /**
     * Sets the value of the seatingcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatingcap(JAXBElement<String> value) {
        this.seatingcap = value;
    }

}
