<%-- 
    Document   : view_family
    Created on : Jun 30, 2016, 11:03:09 PM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- include the jstl library? -->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <h1>Family Tree</h1>
            <c:forEach var="person" items="${people}">
                <a href="person_info?id=${person.p_id}&first_name=${person.first_name}&last_name=${person.last_name}&birthday=${person.birthday}"> ${person.first_name} ${person.last_name}</a> <br /><br />
<!--                ${person.first_name} ${person.last_name} ${person.birthday}<br /><br />                 -->
            </c:forEach>  
        </form>
    </body>
</html>
