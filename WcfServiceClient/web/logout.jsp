<%-- 
    Document   : logout
    Created on : Apr 7, 2019, 9:48:14 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% session.invalidate();
        response.sendRedirect("index.html");
        
        %>
        
    </body>
</html>
