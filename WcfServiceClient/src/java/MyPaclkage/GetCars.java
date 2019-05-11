/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPaclkage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.datacontract.schemas._2004._07.carrental.*;

/**
 *
 * @author acer
 */
//@WebServlet(urlPatterns={"/GetCars"})
public class GetCars extends HttpServlet {

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
            out.println("<html  class='no-js' lang='zxx'>");
            out.println("<head>");

            out.println("<title>Servlet GetCars</title></head><body>");   

           
            if(request.getSession(false) == null){
                
                int status = AllMethods.checkUser(request.getParameter("email"),request.getParameter("password") );
                if(status == 1){
                    int uid = AllMethods.getUserByMail(request.getParameter("email"));
                    
                   HttpSession s = request.getSession();
                   s.setAttribute("uid", uid);
                   response.sendRedirect("http://localhost:8080/WcfServiceClient/home.html");
                    
               }
                else{
                    response.sendRedirect("http://localhost:8080/WcfServiceClient/index.html");
                    
                }
                
            }
            
           if(request.getSession(false) != null){                                                                                                                                
            
               HttpSession s = request.getSession();
               
               System.out.println(s.getAttribute("uid"));
            
                                                
            ArrayOfcar ac = AllMethods.getcars();
            
            out.println("<table  class='song_tbl' style='margin-top:10px;'");
           out.println("<tr ><td class='h2'>Car id</td><td class='h2'>Car name</td><td class='h2' >Car Type</td><td class='h2' >Car Num</td><td class='h2' >Seating Cap</td><td class='h2' >Fare</td></tr>");
            
           for(Car c : ac.getCar()){
               
               out.println("<tr><td >"+c.getCarid()+"</td><td >"+c.getCarname().getValue()+"</td><td >"+c.getCartype().getValue()+"</td><td>"+c.getCarnum().getValue()+"</td><td>"+c.getSeatingcap().getValue()+"</td><td>"+c.getFare()+
                         "</tr></br>");
           }
           
           
           
           out.println("</table>");
           
          
           
           out.println("<form  method='post' action='http://localhost:8080/WcfServiceClient/AddRide' >");
           out.println("Enter Carid : <input type='text' name='carid' ><br /><br />" );
           out.println("<input type='submit' value='Add Ride'>");
           out.println("</form>");
           
           
        }  
            out.println(
"</body>");
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
