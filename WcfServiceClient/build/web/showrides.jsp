<%-- 
    Document   : ShowRides
    Created on : Apr 7, 2019, 5:03:54 PM
    Author     : acer
--%>

<%@page import="org.datacontract.schemas._2004._07.carrental.ArrayOfUserCar"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.Car"%>
<%@page import="java.util.List"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.UserCar"%>
<%@page import="javax.xml.bind.JAXBElement"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.ArrayOfcar"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.ObjectFactory"%>
<%@page import="MyPaclkage.AllMethods"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--=== Favicon ===-->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />

    <title>Cardoor - Car Rental System</title>

    <!--=== Bootstrap CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
    <!--=== Slicknav CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/plugins/slicknav.min.css" rel="stylesheet">
    <!--=== Magnific Popup CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/plugins/magnific-popup.css" rel="stylesheet">
    <!--=== Owl Carousel CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/plugins/owl.carousel.min.css" rel="stylesheet">
    <!--=== Gijgo CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/plugins/gijgo.css" rel="stylesheet">
    <!--=== FontAwesome CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.css" rel="stylesheet">
    <!--=== Theme Reset CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/reset.css" rel="stylesheet">
    <!--=== Main Style CSS ===-->
    <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet">
    <!--=== Responsive CSS ===-->
    <link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet">

    
    </head>
    <body class="loader-active">
        <!--== Preloader Area Start ==-->
    <div class="preloader">
        <div class="preloader-spinner">
            <div class="loader-content">
                <img src="${pageContext.request.contextPath}/assets/img/preloader.gif" alt="JSOFT">
            </div>
        </div>
    </div>
    <!--== Preloader Area End ==-->

    <!--== Header Area Start ==-->
    <header id="header-area" class="fixed-top">


        <!--== Header Bottom Start ==-->
        <div id="header-bottom">
            <div class="container">
                <div class="row">
                    <!--== Logo Start ==-->
                    <div class="col-lg-4">
                        <a href="home.jsp" class="logo">
                            <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="JSOFT">
                        </a>
                    </div>
                    <!--== Logo End ==-->

                    <!--== Main Menu Start ==-->
                    <div class="col-lg-8 d-none d-xl-block">
                        <nav class="mainmenu alignright">
                            <ul>
                                <li><a href="home.jsp">Home</a>
                                   
                                </li>
                                <li><a href="about.html">About</a></li>
                               
                                <li><a href="getcars.jsp">Cars</a>
                                   
                                </li>
                                <li><a >Rides</a>
                                    <ul>
                                        <li><a href="showrides.jsp">Show rides</a></li>
                                        <li><a href="getcars.jsp">Add ride</a></li>
                                        <li><a href="showrides.jsp">Update ride</a></li>
                                        <li><a href="showrides.jsp">Delete ride</a></li>
                                    </ul>                                
                                </li>
                                <li><a href="contact.html">Contact</a></li>
                                <li><a href="logout.jsp">LogOut</a></li>
                            </ul>
                        </nav>
                    </div>
                    <!--== Main Menu End ==-->
                </div>
            </div>
        </div>
        <!--== Header Bottom End ==-->
    </header>
    <!--== Header Area End ==-->

    <!--== Page Title Area Start ==-->
    <section id="page-title-area" class="section-padding overlay">
        <div class="container">
            <div class="row">
                <!-- Page Title Start -->
                <div class="col-lg-12">
                    <div class="section-title  text-center">
                        <h2>Your Active Rides</h2>
                        <span class="title-line"><i class="fa fa-car"></i></span>
                        
                    </div>
                </div>
                <!-- Page Title End -->
            </div>
        </div>
    </section>
    <!--== Page Title Area End ==-->

 <% 
       HttpSession s = request.getSession();
       
                int uid = Integer.parseInt(s.getAttribute("uid").toString());
                System.out.println("user id"+uid);
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
                System.out.println(uc.getCarid());
                uc.setUserid(uid);
                uc.setCarname(c.get(0).getCarname());
                uc.setUsername(name);
                uc.setSource(source);
                uc.setDestination(dest);
                uc.setFare(Integer.parseInt(request.getParameter("fare"))*(c.get(0).getFare()));
                uc.setSeatingcap(c.get(0).getSeatingcap()); 
                uc.setCartype(c.get(0).getCartype());
                uc.setCarnum(c.get(0).getCarnum());
               
                String msg  = AllMethods.addUserCar(uc);
                
            }
 
 
 %>
    
 
 <table border=1 class='song_tbl' style='margin-top:10px'>
           <tr>
               <th>Id</th><th>Car id</th><th>Car Name</th><th>Car Type</th><th>Car Number</th><th>Seating Cap</th><th>Fare</th><th>Source </th><th>Destination</th><th colspan="2">Action</th>
           </tr>
           
           <%
                  ArrayOfUserCar ac = AllMethods.getUsercars(uid);
           
           for(UserCar c : ac.getUserCar()){
                                                  
            %>
    
                 <tr><td ><%= c.getId() %></td><td ><%=c.getCarid() %></td><td ><%= c.getCarname().getValue() %></td><td><%= c.getCartype().getValue()%></td><td><%= c.getCarnum().getValue() %></td><td><%= c.getSeatingcap().getValue() %></td><td><%= c.getFare() %></td><td><%= c.getSource().getValue() %></td><td><%= c.getDestination().getValue() %>
                         </td><td><a href = 'http://localhost:8080/WcfServiceClient/UpdateRide.jsp?Parameter=<%= c.getId() %>' >Update</a></td><td><a href = 'http://localhost:8080/WcfServiceClient/DeleteRide?Parameter=<%= c.getId() %>' >Delete</a></td></tr></br>
           <% } %>
 </table>
 
           
    <!--== Scroll Top Area Start ==-->
    <div class="scroll-top">
        <img src="${pageContext.request.contextPath}/assets/img/scroll-top.png" alt="JSOFT">
    </div>
    <!--== Scroll Top Area End ==-->

    <!--=======================Javascript============================-->
    <!--=== Jquery Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <!--=== Jquery Migrate Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/jquery-migrate.min.js"></script>
    <!--=== Popper Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/popper.min.js"></script>
    <!--=== Bootstrap Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
    <!--=== Gijgo Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/gijgo.js"></script>
    <!--=== Vegas Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/vegas.min.js"></script>
    <!--=== Isotope Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/isotope.min.js"></script>
    <!--=== Owl Caousel Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/owl.carousel.min.js"></script>
    <!--=== Waypoint Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/waypoints.min.js"></script>
    <!--=== CounTotop Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/counterup.min.js"></script>
    <!--=== YtPlayer Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/mb.YTPlayer.js"></script>
    <!--=== Magnific Popup Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/magnific-popup.min.js"></script>
    <!--=== Slicknav Min Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/plugins/slicknav.min.js"></script>

    <!--=== Mian Js ===-->
    <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>

    </body>
</html>
