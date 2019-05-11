<%-- 
    Document   : AddRide
    Created on : Apr 7, 2019, 5:03:54 PM
    Author     : acer
--%>

<%@page import="java.util.List"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.Car"%>
<%@page import="MyPaclkage.AllMethods"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.ArrayOfcar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
    <head>
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
                                <li><a>Rides</a>
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
                        <h2>Our Cars</h2>
                        <span class="title-line"><i class="fa fa-car"></i></span>
                        
                    </div>
                </div>
                <!-- Page Title End -->
            </div>
        </div>
    </section>
        <%                    
            System.out.println("before");
            
                 if(session.getAttribute("uid") == null){
                System.out.println("Afer");
                int status = AllMethods.checkUser(request.getParameter("email"),request.getParameter("password") );
                if(status == 1){
                    int uid = AllMethods.getUserByMail(request.getParameter("email"));
                    System.out.println("User id " +uid);
                   //HttpSession s = request.getSession();
                   session.setAttribute("uid", uid);
                   response.sendRedirect("http://localhost:8080/WcfServiceClient/home.jsp");
                    
               }
                else{
                    response.sendRedirect("http://localhost:8080/WcfServiceClient/index.html");
                    
                }
                 
             }
                                                                                                                              
            
             
               
               System.out.println(session.getAttribute("uid"));
                                                               
         ArrayOfcar ac = AllMethods.getcars();
         List<Car> c1 = ac.getCar();
         
        %>
    <!--== Page Title Area End ==-->
<div class="row">
    <!-- Single Driver Start-->
                <div class="col-lg-4 col-md-6">
                    <div class="single-driver-member">
                        <img src="assets/img/car/alto.jpg" alt="Alto">
                        <div class="driver-mem-info">
                            
                            <h4><%= c1.get(0).getCarname().getValue() %>
                                <span>Seating Capacity : <%= c1.get(0).getSeatingcap().getValue() %></span>
                                <span>Fare : <%= c1.get(0).getFare()  %></span>
                                <span>Car Id : <%= c1.get(0).getCarid() %></span>
                                <span>Type : <%= c1.get(0).getCartype().getValue() %> </span>
                                <span>Number : <%= c1.get(0).getCarnum().getValue() %></span>
                            
                            </h4>
                        </div>
                    </div>
                </div>
                <!-- Single Driver End -->

               
     <!-- Single Driver Start-->
                <div class="col-lg-4 col-md-6">
                    <div class="single-driver-member">
                        <img src="assets/img/car/santro.jpg" alt="SAntro">
                        <div class="driver-mem-info">
                            
                            <h4><%= c1.get(1).getCarname().getValue() %>
                                <span>Seating Capacity : <%= c1.get(1).getSeatingcap().getValue() %></span>
                                <span>Fare : <%= c1.get(1).getFare()  %></span>
                                <span>Car Id : <%= c1.get(1).getCarid() %></span>
                                <span>Type : <%= c1.get(1).getCartype().getValue() %> </span>
                                <span>Number : <%= c1.get(1).getCarnum().getValue() %></span>
                            
                            </h4>
                        </div>
                    </div>
                </div>
                <!-- Single Driver End -->
 <!-- Single Driver Start-->
                <div class="col-lg-4 col-md-6">
                    <div class="single-driver-member">
                        <img src="assets/img/car/tavera.jpg" alt="Tavera">
                        <div class="driver-mem-info">
                            
                            <h4><%= c1.get(3).getCarname().getValue() %>
                                <span>Seating Capacity : <%= c1.get(3).getSeatingcap().getValue() %></span>
                                <span>Fare : <%= c1.get(3).getFare()  %></span>
                                <span>Car Id : <%= c1.get(3).getCarid() %></span>
                                <span>Type : <%= c1.get(3).getCartype().getValue() %> </span>
                                <span>Number : <%= c1.get(3).getCarnum().getValue() %></span>
                            
                            </h4>
                        </div>
                    </div>
                </div>
                <!-- Single Driver End -->
                 <!-- Single Driver Start-->
                <div class="col-lg-4 col-md-6">
                    <div class="single-driver-member">
                        <img src="assets/img/car/audi.jpg" alt="Audi">
                        <div class="driver-mem-info">
                            
                            <h4><%= c1.get(2).getCarname().getValue() %>
                                <span>Seating Capacity : <%= c1.get(2).getSeatingcap().getValue() %></span>
                                <span>Fare : <%= c1.get(2).getFare()  %></span>
                                <span>Car Id : <%= c1.get(2).getCarid() %></span>
                                <span>Type : <%= c1.get(2).getCartype().getValue() %> </span>
                                <span>Number : <%= c1.get(2).getCarnum().getValue() %></span>
                            
                            </h4>
                        </div>
                    </div>
                </div>
                <!-- Single Driver End -->
                <!-- Single Driver Start-->
                <div class="col-lg-4 col-md-6">
                    <div class="single-driver-member">
                        <img src="assets/img/car/innova.jpg" alt="Innova">
                        <div class="driver-mem-info">
                            
                           <h4><%= c1.get(4).getCarname().getValue() %>
                                <span>Seating Capacity : <%= c1.get(4).getSeatingcap().getValue() %></span>
                                <span>Fare : <%= c1.get(4).getFare()  %></span>
                                <span>Car Id : <%= c1.get(4).getCarid() %></span>
                                <span>Type : <%= c1.get(4).getCartype().getValue() %> </span>
                                <span>Number : <%= c1.get(4).getCarnum().getValue() %></span>
                            
                            </h4>
                        </div>
                    </div>
                </div>
                <!-- Single Driver End -->
</div>             
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


   
<!--      <table  class='song_tbl' style='margin-top:10px;'
           <tr ><td >Car id</td><td >Car name</td><td  >Car Type</td><td  >Car Num</td><td  >Seating Cap</td><td  >Fare</td></tr>
    
                  
      </table>-->
            <!--== Login Page Content Start ==-->
    <section id="lgoin-page-wrap" class="section-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-md-8 m-auto">
                	<div class="login-page-content">
                		<div class="login-form">
                			<h3>Add Ride</h3>

           <form action="http://localhost:8080/WcfServiceClient/AddRide.jsp" method="post">
								
                                                            <div class="username">
									<input type="text" placeholder="Car id" name="carid">
								</div>
								
								<div class="log-btn">
									<button type="submit" ><i class="fa fa-check-square"></i> Add Ride</button>
								</div>
							</form>
                                </div>
                        </div>
                </div>
            </div>
        </div>
    </section>
            
           
           
           
           
    </body>
</html>
