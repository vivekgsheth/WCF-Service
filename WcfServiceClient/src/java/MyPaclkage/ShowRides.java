/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPaclkage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.carrental.*;
import org.datacontract.schemas._2004._07.carrental.ObjectFactory;
       
/**
 *
 * @author acer
 */
public class ShowRides extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowRides</title>");     
            //out.println("<script> function UpdateRide(){ document.getElementById('b1')}</script>");
            out.println("</head>");
            out.println("<body>");
            
            HttpSession s = request.getSession();
                int uid = Integer.parseInt(s.getAttribute("uid").toString());
                String name1 = AllMethods.getUserById(uid);
            if(request.getParameter("carid") != null){
                
                        
                ArrayOfcar ac = AllMethods.getCar(Integer.parseInt(request.getParameter("carid")));
                ObjectFactory o = new ObjectFactory();
                JAXBElement<String> source = o.createUserCarSource(request.getParameter("source"));
                JAXBElement<String> dest = o.createUserCarDestination(request.getParameter("dest"));
                //JAXBElement<String> fare = o.createUserCarSource(request.getParameter("fare"));
                JAXBElement<String> name = o.createUserCarUsername(name1);
                UserCar uc = new UserCar();
                List<Car> c = ac.getCar();
                uc.setCarid(c.get(0).getCarid());
                System.out.println(uid);
                System.out.println(uc.getCarid());
                uc.setUserid(uid);
                
                uc.setCarname(c.get(0).getCarname());
                uc.setUsername(name);
                uc.setSource(source);
                uc.setDestination(dest);
                uc.setFare(Integer.parseInt(request.getParameter("fare")));
                uc.setSeatingcap(c.get(0).getSeatingcap());
                uc.setCartype(c.get(0).getCartype());
                uc.setCarnum(c.get(0).getCarnum());
               
                String msg  = AllMethods.addUserCar(uc);
                
            }
            
            out.println("<table border=1 class='song_tbl' style='margin-top:10px;'");
           out.println("<tr><td class='h2'>Id</td><td class='h2'>Car id</td><td class='h2' >Car Name</td><td class='h2' >Car Type</td><td class='h2' >Car Num </td><td class='h2' >Seating Cap </td><td class='h2' >Fare</td><td class='h2' >Source </td><td class='h2' >Destination</td><td class='h2' >Action</td></tr>");
            
           ArrayOfUserCar ac = AllMethods.getUsercars(uid);
           
           for(UserCar c : ac.getUserCar()){
               
               out.println("<tr><td >"+c.getId()+"</td><td >"+c.getCarid()+"</td><td >"+c.getCarname().getValue()+"</td><td>"+c.getCartype().getValue()+"</td><td>"+c.getCarnum().getValue()+"</td><td>"+c.getSeatingcap().getValue()+"</td><td>"+c.getFare()+"</td><td>"+c.getSource().getValue()+"</td><td>"+c.getDestination().getValue()+
                         "</td><td><a href = 'http://localhost:8080/WcfServiceClient/UpdateRide?Parameter="+c.getId()+"' >Update</a></td><td><a href = 'http://localhost:8080/WcfServiceClient/DeleteRide?Parameter="+c.getId()+"' >Delete</a></td></tr></br>");
               
           }
           //<button id='b1' name='"+c.getId().toString()+"'  onclick='UpdateRide()'>Update</button>
           
           
           out.println("</table>");
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
