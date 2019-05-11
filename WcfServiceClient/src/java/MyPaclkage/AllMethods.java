/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPaclkage;

import org.datacontract.schemas._2004._07.carrental.ArrayOfUserCar;
import org.datacontract.schemas._2004._07.carrental.ArrayOfcar;
import org.datacontract.schemas._2004._07.carrental.UserCar;

/**
 *
 * @author acer
 */
public class AllMethods {

    public static String addUserCar(org.datacontract.schemas._2004._07.carrental.UserCar uc) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.addUserCar(uc);
    }

    public static int addUser(java.lang.String name, java.lang.String email, java.lang.String address, java.lang.String password) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.addUser(name, email, address, password);
    }

    public static String deleteUserCar(java.lang.Integer id) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.deleteUserCar(id);
    }

    public static ArrayOfcar getCar(java.lang.Integer id) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getCar(id);
    }

    public static ArrayOfcar getCarByName(java.lang.String carname) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getCarByName(carname);
    }

    public static ArrayOfcar getCarBySeatingcap(java.lang.String carcap) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getCarBySeatingcap(carcap);
    }

    public static UserCar getUserCar(java.lang.Integer id) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getUserCar(id);
    }

    public static ArrayOfUserCar getUsercars(java.lang.Integer uid) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getUsercars(uid);
    }

    public static ArrayOfcar getcars() {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getcars();
    }

    public static String updateUserCar(org.datacontract.schemas._2004._07.carrental.UserCar uc) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.updateUserCar(uc);
    }

    public static Integer checkUser(java.lang.String email, java.lang.String password) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.checkUser(email, password);
    }

    public static String getUserById(java.lang.Integer uid) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getUserById(uid);
    }

    public static Integer getUserByMail(java.lang.String email) {
        org.tempuri.Carservice service = new org.tempuri.Carservice();
        org.tempuri.Icarservice port = service.getBasicHttpBindingIcarservice();
        return port.getUserByMail(email);
    }
    
    
    
    
    
    
    
    
}
