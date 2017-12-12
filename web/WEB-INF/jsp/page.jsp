<%-- 
    Document   : page
    Created on : Dec 12, 2017, 1:19:28 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <title>Annotation</title>
    </head>
    
    <body>
       
        <jsp:include page="head.jsp"/>
        <div class="container">
        <h1>${message}</h1>
        <br/>
        <h1>${message1}</h1>
        </div>
        
        <a href="register">Please Register</a>

    </body>

</html>
