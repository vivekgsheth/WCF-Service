
package org.datacontract.schemas._2004._07.carrental;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserCar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserCar" type="{http://schemas.datacontract.org/2004/07/Carrental}UserCar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserCar", propOrder = {
    "userCar"
})
public class ArrayOfUserCar {

    @XmlElement(name = "UserCar", nillable = true)
    protected List<UserCar> userCar;

    /**
     * Gets the value of the userCar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userCar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserCar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserCar }
     * 
     * 
     */
    public List<UserCar> getUserCar() {
        if (userCar == null) {
            userCar = new ArrayList<UserCar>();
        }
        return this.userCar;
    }

}
