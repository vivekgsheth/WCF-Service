
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.carrental.ArrayOfUserCar;
import org.datacontract.schemas._2004._07.carrental.ArrayOfcar;
import org.datacontract.schemas._2004._07.carrental.User;
import org.datacontract.schemas._2004._07.carrental.UserCar;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetUserCarResponseGetUserCarResult_QNAME = new QName("http://tempuri.org/", "getUserCarResult");
    private final static QName _DeleteUserCarResponseDeleteUserCarResult_QNAME = new QName("http://tempuri.org/", "DeleteUserCarResult");
    private final static QName _AddUserEmail_QNAME = new QName("http://tempuri.org/", "Email");
    private final static QName _AddUserAddress_QNAME = new QName("http://tempuri.org/", "Address");
    private final static QName _AddUserName_QNAME = new QName("http://tempuri.org/", "Name");
    private final static QName _AddUserPassword_QNAME = new QName("http://tempuri.org/", "Password");
    private final static QName _GiveUserResponseGiveUserResult_QNAME = new QName("http://tempuri.org/", "giveUserResult");
    private final static QName _UpdateUserCarUc_QNAME = new QName("http://tempuri.org/", "uc");
    private final static QName _GetCarResponseGetCarResult_QNAME = new QName("http://tempuri.org/", "GetCarResult");
    private final static QName _GetcarsResponseGetcarsResult_QNAME = new QName("http://tempuri.org/", "getcarsResult");
    private final static QName _GetCarByNameResponseGetCarByNameResult_QNAME = new QName("http://tempuri.org/", "GetCarByNameResult");
    private final static QName _CheckUserPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _CheckUserEmail_QNAME = new QName("http://tempuri.org/", "email");
    private final static QName _GetCarBySeatingcapCarcap_QNAME = new QName("http://tempuri.org/", "carcap");
    private final static QName _GetUsercarsResponseGetUsercarsResult_QNAME = new QName("http://tempuri.org/", "getUsercarsResult");
    private final static QName _GetCarByNameCarname_QNAME = new QName("http://tempuri.org/", "carname");
    private final static QName _GetUserByIdResponseGetUserByIdResult_QNAME = new QName("http://tempuri.org/", "GetUserByIdResult");
    private final static QName _GiveUserCarResponseGiveUserCarResult_QNAME = new QName("http://tempuri.org/", "giveUserCarResult");
    private final static QName _GetCarBySeatingcapResponseGetCarBySeatingcapResult_QNAME = new QName("http://tempuri.org/", "GetCarBySeatingcapResult");
    private final static QName _AddUserCarResponseAddUserCarResult_QNAME = new QName("http://tempuri.org/", "AddUserCarResult");
    private final static QName _UpdateUserCarResponseUpdateUserCarResult_QNAME = new QName("http://tempuri.org/", "UpdateUserCarResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GiveUserCar }
     * 
     */
    public GiveUserCar createGiveUserCar() {
        return new GiveUserCar();
    }

    /**
     * Create an instance of {@link AddUserCar }
     * 
     */
    public AddUserCar createAddUserCar() {
        return new AddUserCar();
    }

    /**
     * Create an instance of {@link GiveUserResponse }
     * 
     */
    public GiveUserResponse createGiveUserResponse() {
        return new GiveUserResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetUsercarsResponse }
     * 
     */
    public GetUsercarsResponse createGetUsercarsResponse() {
        return new GetUsercarsResponse();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link AddUserCarResponse }
     * 
     */
    public AddUserCarResponse createAddUserCarResponse() {
        return new AddUserCarResponse();
    }

    /**
     * Create an instance of {@link UpdateUserCar }
     * 
     */
    public UpdateUserCar createUpdateUserCar() {
        return new UpdateUserCar();
    }

    /**
     * Create an instance of {@link GetcarsResponse }
     * 
     */
    public GetcarsResponse createGetcarsResponse() {
        return new GetcarsResponse();
    }

    /**
     * Create an instance of {@link GetCar }
     * 
     */
    public GetCar createGetCar() {
        return new GetCar();
    }

    /**
     * Create an instance of {@link GetUserCar }
     * 
     */
    public GetUserCar createGetUserCar() {
        return new GetUserCar();
    }

    /**
     * Create an instance of {@link GetCarByName }
     * 
     */
    public GetCarByName createGetCarByName() {
        return new GetCarByName();
    }

    /**
     * Create an instance of {@link GetUserByMail }
     * 
     */
    public GetUserByMail createGetUserByMail() {
        return new GetUserByMail();
    }

    /**
     * Create an instance of {@link DeleteUserCar }
     * 
     */
    public DeleteUserCar createDeleteUserCar() {
        return new DeleteUserCar();
    }

    /**
     * Create an instance of {@link GetCarByNameResponse }
     * 
     */
    public GetCarByNameResponse createGetCarByNameResponse() {
        return new GetCarByNameResponse();
    }

    /**
     * Create an instance of {@link GetUsercars }
     * 
     */
    public GetUsercars createGetUsercars() {
        return new GetUsercars();
    }

    /**
     * Create an instance of {@link GetUserCarResponse }
     * 
     */
    public GetUserCarResponse createGetUserCarResponse() {
        return new GetUserCarResponse();
    }

    /**
     * Create an instance of {@link GiveUser }
     * 
     */
    public GiveUser createGiveUser() {
        return new GiveUser();
    }

    /**
     * Create an instance of {@link GiveUserCarResponse }
     * 
     */
    public GiveUserCarResponse createGiveUserCarResponse() {
        return new GiveUserCarResponse();
    }

    /**
     * Create an instance of {@link CheckUser }
     * 
     */
    public CheckUser createCheckUser() {
        return new CheckUser();
    }

    /**
     * Create an instance of {@link GetCarBySeatingcap }
     * 
     */
    public GetCarBySeatingcap createGetCarBySeatingcap() {
        return new GetCarBySeatingcap();
    }

    /**
     * Create an instance of {@link GetUserByMailResponse }
     * 
     */
    public GetUserByMailResponse createGetUserByMailResponse() {
        return new GetUserByMailResponse();
    }

    /**
     * Create an instance of {@link DeleteUserCarResponse }
     * 
     */
    public DeleteUserCarResponse createDeleteUserCarResponse() {
        return new DeleteUserCarResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link UpdateUserCarResponse }
     * 
     */
    public UpdateUserCarResponse createUpdateUserCarResponse() {
        return new UpdateUserCarResponse();
    }

    /**
     * Create an instance of {@link GetCarResponse }
     * 
     */
    public GetCarResponse createGetCarResponse() {
        return new GetCarResponse();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link Getcars }
     * 
     */
    public Getcars createGetcars() {
        return new Getcars();
    }

    /**
     * Create an instance of {@link CheckUserResponse }
     * 
     */
    public CheckUserResponse createCheckUserResponse() {
        return new CheckUserResponse();
    }

    /**
     * Create an instance of {@link GetCarBySeatingcapResponse }
     * 
     */
    public GetCarBySeatingcapResponse createGetCarBySeatingcapResponse() {
        return new GetCarBySeatingcapResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getUserCarResult", scope = GetUserCarResponse.class)
    public JAXBElement<UserCar> createGetUserCarResponseGetUserCarResult(UserCar value) {
        return new JAXBElement<UserCar>(_GetUserCarResponseGetUserCarResult_QNAME, UserCar.class, GetUserCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteUserCarResult", scope = DeleteUserCarResponse.class)
    public JAXBElement<String> createDeleteUserCarResponseDeleteUserCarResult(String value) {
        return new JAXBElement<String>(_DeleteUserCarResponseDeleteUserCarResult_QNAME, String.class, DeleteUserCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Email", scope = AddUser.class)
    public JAXBElement<String> createAddUserEmail(String value) {
        return new JAXBElement<String>(_AddUserEmail_QNAME, String.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Address", scope = AddUser.class)
    public JAXBElement<String> createAddUserAddress(String value) {
        return new JAXBElement<String>(_AddUserAddress_QNAME, String.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Name", scope = AddUser.class)
    public JAXBElement<String> createAddUserName(String value) {
        return new JAXBElement<String>(_AddUserName_QNAME, String.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = AddUser.class)
    public JAXBElement<String> createAddUserPassword(String value) {
        return new JAXBElement<String>(_AddUserPassword_QNAME, String.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giveUserResult", scope = GiveUserResponse.class)
    public JAXBElement<User> createGiveUserResponseGiveUserResult(User value) {
        return new JAXBElement<User>(_GiveUserResponseGiveUserResult_QNAME, User.class, GiveUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "uc", scope = UpdateUserCar.class)
    public JAXBElement<UserCar> createUpdateUserCarUc(UserCar value) {
        return new JAXBElement<UserCar>(_UpdateUserCarUc_QNAME, UserCar.class, UpdateUserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarResult", scope = GetCarResponse.class)
    public JAXBElement<ArrayOfcar> createGetCarResponseGetCarResult(ArrayOfcar value) {
        return new JAXBElement<ArrayOfcar>(_GetCarResponseGetCarResult_QNAME, ArrayOfcar.class, GetCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getcarsResult", scope = GetcarsResponse.class)
    public JAXBElement<ArrayOfcar> createGetcarsResponseGetcarsResult(ArrayOfcar value) {
        return new JAXBElement<ArrayOfcar>(_GetcarsResponseGetcarsResult_QNAME, ArrayOfcar.class, GetcarsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarByNameResult", scope = GetCarByNameResponse.class)
    public JAXBElement<ArrayOfcar> createGetCarByNameResponseGetCarByNameResult(ArrayOfcar value) {
        return new JAXBElement<ArrayOfcar>(_GetCarByNameResponseGetCarByNameResult_QNAME, ArrayOfcar.class, GetCarByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CheckUser.class)
    public JAXBElement<String> createCheckUserPassword(String value) {
        return new JAXBElement<String>(_CheckUserPassword_QNAME, String.class, CheckUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = CheckUser.class)
    public JAXBElement<String> createCheckUserEmail(String value) {
        return new JAXBElement<String>(_CheckUserEmail_QNAME, String.class, CheckUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "carcap", scope = GetCarBySeatingcap.class)
    public JAXBElement<String> createGetCarBySeatingcapCarcap(String value) {
        return new JAXBElement<String>(_GetCarBySeatingcapCarcap_QNAME, String.class, GetCarBySeatingcap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getUsercarsResult", scope = GetUsercarsResponse.class)
    public JAXBElement<ArrayOfUserCar> createGetUsercarsResponseGetUsercarsResult(ArrayOfUserCar value) {
        return new JAXBElement<ArrayOfUserCar>(_GetUsercarsResponseGetUsercarsResult_QNAME, ArrayOfUserCar.class, GetUsercarsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "carname", scope = GetCarByName.class)
    public JAXBElement<String> createGetCarByNameCarname(String value) {
        return new JAXBElement<String>(_GetCarByNameCarname_QNAME, String.class, GetCarByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserByIdResult", scope = GetUserByIdResponse.class)
    public JAXBElement<String> createGetUserByIdResponseGetUserByIdResult(String value) {
        return new JAXBElement<String>(_GetUserByIdResponseGetUserByIdResult_QNAME, String.class, GetUserByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "giveUserCarResult", scope = GiveUserCarResponse.class)
    public JAXBElement<UserCar> createGiveUserCarResponseGiveUserCarResult(UserCar value) {
        return new JAXBElement<UserCar>(_GiveUserCarResponseGiveUserCarResult_QNAME, UserCar.class, GiveUserCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = GetUserByMail.class)
    public JAXBElement<String> createGetUserByMailEmail(String value) {
        return new JAXBElement<String>(_CheckUserEmail_QNAME, String.class, GetUserByMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCarBySeatingcapResult", scope = GetCarBySeatingcapResponse.class)
    public JAXBElement<ArrayOfcar> createGetCarBySeatingcapResponseGetCarBySeatingcapResult(ArrayOfcar value) {
        return new JAXBElement<ArrayOfcar>(_GetCarBySeatingcapResponseGetCarBySeatingcapResult_QNAME, ArrayOfcar.class, GetCarBySeatingcapResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "uc", scope = AddUserCar.class)
    public JAXBElement<UserCar> createAddUserCarUc(UserCar value) {
        return new JAXBElement<UserCar>(_UpdateUserCarUc_QNAME, UserCar.class, AddUserCar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddUserCarResult", scope = AddUserCarResponse.class)
    public JAXBElement<String> createAddUserCarResponseAddUserCarResult(String value) {
        return new JAXBElement<String>(_AddUserCarResponseAddUserCarResult_QNAME, String.class, AddUserCarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateUserCarResult", scope = UpdateUserCarResponse.class)
    public JAXBElement<String> createUpdateUserCarResponseUpdateUserCarResult(String value) {
        return new JAXBElement<String>(_UpdateUserCarResponseUpdateUserCarResult_QNAME, String.class, UpdateUserCarResponse.class, value);
    }

}
