/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPaclkage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.datacontract.schemas._2004._07.carrental.*;
import org.datacontract.schemas._2004._07.carrental.ObjectFactory;

/**
 *
 * @author acer
 */
public class UpdateRide extends HttpServlet {

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
            out.println("<title>Servlet UpdateRide</title>");            
            out.println("</head>");
            out.println("<body>");
              System.out.println("hi");
              int id = Integer.parseInt(request.getParameter("Parameter").toString());
              
              UserCar uc = AllMethods.getUserCar(id);
              //request.setAttribute("id", id);
            //int id = Integer.parseInt(request.getParameterValues("Parameter").toString());
            //.out.println(id);
             //out.println("<input type='text' value='"+id+"'>");
            
              out.println("<form method='post' action='http://localhost:8080/WcfServiceClient/UpdateRideValues' >");
              
              out.println("Car name : <input type='text' name='carname' value='"+uc.getCarname().getValue() +"'>");
              out.println("Source : <input type='text' name='source' value='"+uc.getSource().getValue() +"'>");
              out.println("Destination : <input type='text' name='dest' value='"+uc.getDestination().getValue() +"'>");
              out.println("Fare : <input type='text' name='fare'  value='"+uc.getFare()+"'>");
              out.println("<input type='hidden' name='id1' value='"+id+"'>");
              out.println("<input type='submit' value='Update' >");
              
              out.println("</form>");
              //out.println("<")
            
            
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
