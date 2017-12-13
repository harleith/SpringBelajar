<%-- 
    Document   : customer
    Created on : Dec 13, 2017, 10:03:53 AM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/SpringApp/welcome">Harry Oktavianus Darmawan</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/SpringApp/welcome">Home</a></li>
                    <li><a href="/SpringApp/customers/all">Customer</a></li>
                    <li><a href="/SpringApp/product/all">Product</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/SpringApp/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>
        <!--        <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#">Harry Oktavianus</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="/SpringApp/welcome">Home</a></li>
                            <li><a href="/SpringApp/customers/all">Customer</a></li>
                            <li><a href="/SpringApp/product/all">Product</a></li>
                        </ul>
                        <form class="navbar-form navbar-left" action="/action_page.php">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search" name="search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    </div>
                </nav>-->

        <div class="panel panel-primary">
            <div class="panel-heading">Tabel Customer</div>
            <!--            <div class="panel-body">-->

            <table class="table">

                <tr class="success">
                    <th>Customer Id</th>
                    <th>Nama</th>
                    <th>Kota</th>
                    <th> </th>
                </tr>

                <c:forEach var="c" items="${customers}">
                    <tr class="warning">
                    
                        <td>${c.customerId}</td>
                        <td> ${c.name}</td>
                        <td> ${c.city} </td>
                        
                        <td> <div>
                                <a href="#" class="btn btn-info" role="button">update</a>
                                <a href="#" class="btn btn-info" role="button">delete</a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
