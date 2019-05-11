/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPaclkage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
public class UpdateRideValues extends HttpServlet {

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
            out.println("<title>Servlet UpdateRideValues</title>");            
            out.println("</head>");
            out.println("<body>");
   
             HttpSession s = request.getSession();
                int uid = Integer.parseInt(s.getAttribute("uid").toString());
                String name1 = AllMethods.getUserById(uid);
            
            
             ObjectFactory o = new ObjectFactory();
            JAXBElement<String> source = o.createUserCarSource(request.getParameter("source"));
            JAXBElement<String> dest = o.createUserCarDestination(request.getParameter("dest"));
            JAXBElement<String> carname = o.createUserCarCarname(request.getParameter("carname"));
            JAXBElement<String> usernm = o.createUserCarUsername(name1);
            System.out.println(request.getParameter("id1"));
            int id = Integer.parseInt(request.getParameter("id1"));
            
            UserCar uc = new UserCar();
            ArrayOfcar ac = AllMethods.getCarByName(request.getParameter("carname"));
             List<Car> c = ac.getCar();
            uc.setCarid(c.get(0).getCarid());
            uc.setCarname(c.get(0).getCarname());
            uc.setSeatingcap(c.get(0).getSeatingcap());
            uc.setCartype(c.get(0).getCartype());
            uc.setCarnum(c.get(0).getCarnum());
            uc.setUsername(usernm);
            uc.setUserid(uid);
            uc.setId(id);
            
            
            //UserCar uc = (UserCar)request.getAttribute("usercar");
            System.out.println(request.getParameter("source"));
            System.out.println(request.getParameter("dest"));
            System.out.println(request.getParameter("carname"));
         //   System.out.println(uc.getCarid());
           
             
            System.out.println(source + "hi " + dest + " "+ carname);
            //uc.setCarname(carname);
            uc.setSource(source);
            uc.setDestination(dest);
            uc.setFare(Integer.parseInt(request.getParameter("fare")) * (c.get(0).getFare()));
            
            String msg = AllMethods.updateUserCar(uc);
            System.out.println(msg);
            if(msg.equals("successfully")){
                RequestDispatcher rd = request.getRequestDispatcher("/showrides.jsp");
                    rd.forward(request, response);
                    
            }
            
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
