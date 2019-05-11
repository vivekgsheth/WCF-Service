
package org.datacontract.schemas._2004._07.carrental;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.carrental package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "user");
    private final static QName _Car_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "car");
    private final static QName _ArrayOfUserCar_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "ArrayOfUserCar");
    private final static QName _UserCar_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "UserCar");
    private final static QName _ArrayOfcar_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "ArrayOfcar");
    private final static QName _CarCartype_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "cartype");
    private final static QName _CarCarname_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "carname");
    private final static QName _CarSeatingcap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "seatingcap");
    private final static QName _CarCarnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "carnum");
    private final static QName _UserEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "Email");
    private final static QName _UserAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "Address");
    private final static QName _UserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "Name");
    private final static QName _UserPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "Password");
    private final static QName _UserCarSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "source");
    private final static QName _UserCarDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "destination");
    private final static QName _UserCarUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Carrental", "username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.carrental
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserCar }
     * 
     */
    public UserCar createUserCar() {
        return new UserCar();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ArrayOfUserCar }
     * 
     */
    public ArrayOfUserCar createArrayOfUserCar() {
        return new ArrayOfUserCar();
    }

    /**
     * Create an instance of {@link ArrayOfcar }
     * 
     */
    public ArrayOfcar createArrayOfcar() {
        return new ArrayOfcar();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Car }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "car")
    public JAXBElement<Car> createCar(Car value) {
        return new JAXBElement<Car>(_Car_QNAME, Car.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "ArrayOfUserCar")
    public JAXBElement<ArrayOfUserCar> createArrayOfUserCar(ArrayOfUserCar value) {
        return new JAXBElement<ArrayOfUserCar>(_ArrayOfUserCar_QNAME, ArrayOfUserCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "UserCar")
    public JAXBElement<UserCar> createUserCar(UserCar value) {
        return new JAXBElement<UserCar>(_UserCar_QNAME, UserCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "ArrayOfcar")
    public JAXBElement<ArrayOfcar> createArrayOfcar(ArrayOfcar value) {
        return new JAXBElement<ArrayOfcar>(_ArrayOfcar_QNAME, ArrayOfcar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "cartype", scope = Car.class)
    public JAXBElement<String> createCarCartype(String value) {
        return new JAXBElement<String>(_CarCartype_QNAME, String.class, Car.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "carname", scope = Car.class)
    public JAXBElement<String> createCarCarname(String value) {
        return new JAXBElement<String>(_CarCarname_QNAME, String.class, Car.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "seatingcap", scope = Car.class)
    public JAXBElement<String> createCarSeatingcap(String value) {
        return new JAXBElement<String>(_CarSeatingcap_QNAME, String.class, Car.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "carnum", scope = Car.class)
    public JAXBElement<String> createCarCarnum(String value) {
        return new JAXBElement<String>(_CarCarnum_QNAME, String.class, Car.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "Email", scope = User.class)
    public JAXBElement<String> createUserEmail(String value) {
        return new JAXBElement<String>(_UserEmail_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "Address", scope = User.class)
    public JAXBElement<String> createUserAddress(String value) {
        return new JAXBElement<String>(_UserAddress_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "Name", scope = User.class)
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "Password", scope = User.class)
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "cartype", scope = UserCar.class)
    public JAXBElement<String> createUserCarCartype(String value) {
        return new JAXBElement<String>(_CarCartype_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "carname", scope = UserCar.class)
    public JAXBElement<String> createUserCarCarname(String value) {
        return new JAXBElement<String>(_CarCarname_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "source", scope = UserCar.class)
    public JAXBElement<String> createUserCarSource(String value) {
        return new JAXBElement<String>(_UserCarSource_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "destination", scope = UserCar.class)
    public JAXBElement<String> createUserCarDestination(String value) {
        return new JAXBElement<String>(_UserCarDestination_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "seatingcap", scope = UserCar.class)
    public JAXBElement<String> createUserCarSeatingcap(String value) {
        return new JAXBElement<String>(_CarSeatingcap_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "username", scope = UserCar.class)
    public JAXBElement<String> createUserCarUsername(String value) {
        return new JAXBElement<String>(_UserCarUsername_QNAME, String.class, UserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Carrental", name = "carnum", scope = UserCar.class)
    public JAXBElement<String> createUserCarCarnum(String value) {
        return new JAXBElement<String>(_CarCarnum_QNAME, String.class, UserCar.class, value);
    }

}
