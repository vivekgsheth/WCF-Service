<%@page import="java.util.List"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.ArrayOfcar"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.Car"%>
<%@page import="MyPaclkage.AllMethods"%>
<%@page import="org.datacontract.schemas._2004._07.carrental.UserCar"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
     
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--=== Favicon ===-->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />

    <title>Cardoor - Car Rental System</title>

    <!--=== Bootstrap CSS ===-->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <!--=== Slicknav CSS ===-->
    <link href="assets/css/plugins/slicknav.min.css" rel="stylesheet">
    <!--=== Magnific Popup CSS ===-->
    <link href="assets/css/plugins/magnific-popup.css" rel="stylesheet">
    <!--=== Owl Carousel CSS ===-->
    <link href="assets/css/plugins/owl.carousel.min.css" rel="stylesheet">
    <!--=== Gijgo CSS ===-->
    <link href="assets/css/plugins/gijgo.css" rel="stylesheet">
    <!--=== FontAwesome CSS ===-->
    <link href="assets/css/font-awesome.css" rel="stylesheet">
    <!--=== Theme Reset CSS ===-->
    <link href="assets/css/reset.css" rel="stylesheet">
    <!--=== Main Style CSS ===-->
    <link href="style.css" rel="stylesheet">
    <!--=== Responsive CSS ===-->
    <link href="assets/css/responsive.css" rel="stylesheet">


    <!--[if lt IE 9]>
        <script src="//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="//oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="loader-active">

    <!--== Preloader Area Start ==-->
    <div class="preloader">
        <div class="preloader-spinner">
            <div class="loader-content">
                <img src="assets/img/preloader.gif" alt="JSOFT">
            </div>
        </div>
    </div>
    <!--== Preloader Area End ==-->

    <!--== Header Area Start ==-->
    <header id="header-area" class="fixed-top">
        <!--== Header Top Start ==-->
 
        <!--== Header Top End ==-->

        <!--== Header Bottom Start ==-->
        <div id="header-bottom">
            <div class="container">
                <div class="row">
                    <!--== Logo Start ==-->
                    <div class="col-lg-4">
                        <a href="home.jsp" class="logo">
                            <img src="assets/img/logo.png" alt="JSOFT">
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
                                <li><a >Rides</a>
                                    <ul>
                                        <li><a href="showrides.jsp">Show rides</a></li>
                                        <li><a href="showrides.jsp">Update rides</a></li>
                                        <li><a href="showrides.jsp">Delete rides</a></li>
                                        <li><a href="getcars.jsp">Add ride</a></li>
                                        
                                    </ul>                                
                                </li>
                           <li><a href="http://localhost:8080/WcfServiceClient/getcars.jsp">Cars</a>
                                   
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
                        <h2>Update Ride</h2>
                        <span class="title-line"><i class="fa fa-car"></i></span>
                       
                    </div>
                </div>
                <!-- Page Title End -->
            </div>
        </div>
    </section>
    <!--== Page Title Area End ==-->
<% 

         int id = Integer.parseInt(request.getParameter("Parameter").toString());
              
              UserCar uc = AllMethods.getUserCar(id);

                           ArrayOfcar ac = AllMethods.getCarByName(uc.getCarname().getValue());
                           List<Car> c = ac.getCar();

%>
    <!--== Login Page Content Start ==-->
    <section id="lgoin-page-wrap" class="section-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-8 m-auto">
                	<div class="login-page-content">
                		<div class="login-form">
                			<h3>Update Ride details</h3>
							<form method="post" action="http://localhost:8080/WcfServiceClient/UpdateRideValues">
								<div class="username">
									<input type="text" placeholder="Car Name" name="carname" value='<%= uc.getCarname().getValue() %>'>
								</div>
								<div class="password">
									<input type="text" placeholder="Source" name="source" value='<%= uc.getSource().getValue() %>'>
								</div>
                                                                <div class="password">
									<input type="text" placeholder="Destination" name="dest" value='<%= uc.getDestination().getValue() %>'>
								</div>
                                                                <div class="password">
									<input type="text" placeholder="Fare" name="fare" value='<%= (uc.getFare())/(c.get(0).getFare()) %>'>
								</div>
                                                                
                                                                
                                                                <input type='hidden' name='id1' value='<%= id %>' >
								<div class="log-btn">
									<button type="submit"><i class="fa fa-sign-in"></i> Update</button>
								</div>
							</form>
                		</div>
                		
                		
                		
                	</div>
                </div>
        	</div>
        </div>
    </section>
    <!--== Login Page Content End ==-->

  
    <!--== Footer Area End ==-->

    <!--== Scroll Top Area Start ==-->
    <div class="scroll-top">
        <img src="assets/img/scroll-top.png" alt="JSOFT">
    </div>
    <!--== Scroll Top Area End ==-->

    <!--=======================Javascript============================-->
    <!--=== Jquery Min Js ===-->
    <script src="assets/js/jquery-3.2.1.min.js"></script>
    <!--=== Jquery Migrate Min Js ===-->
    <script src="assets/js/jquery-migrate.min.js"></script>
    <!--=== Popper Min Js ===-->
    <script src="assets/js/popper.min.js"></script>
    <!--=== Bootstrap Min Js ===-->
    <script src="assets/js/bootstrap.min.js"></script>
    <!--=== Gijgo Min Js ===-->
    <script src="assets/js/plugins/gijgo.js"></script>
    <!--=== Vegas Min Js ===-->
    <script src="assets/js/plugins/vegas.min.js"></script>
    <!--=== Isotope Min Js ===-->
    <script src="assets/js/plugins/isotope.min.js"></script>
    <!--=== Owl Caousel Min Js ===-->
    <script src="assets/js/plugins/owl.carousel.min.js"></script>
    <!--=== Waypoint Min Js ===-->
    <script src="assets/js/plugins/waypoints.min.js"></script>
    <!--=== CounTotop Min Js ===-->
    <script src="assets/js/plugins/counterup.min.js"></script>
    <!--=== YtPlayer Min Js ===-->
    <script src="assets/js/plugins/mb.YTPlayer.js"></script>
    <!--=== Magnific Popup Min Js ===-->
    <script src="assets/js/plugins/magnific-popup.min.js"></script>
    <!--=== Slicknav Min Js ===-->
    <script src="assets/js/plugins/slicknav.min.js"></script>

    <!--=== Mian Js ===-->
    <script src="assets/js/main.js"></script>

</body>

</html>