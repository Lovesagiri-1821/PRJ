<%-- 
    Document   : error
    Created on : Jun 6, 2025, 7:50:22 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String msg = request.getAttribute("message")+""; %>
        <h1><%=msg%></h1>
    </body>
</html>
