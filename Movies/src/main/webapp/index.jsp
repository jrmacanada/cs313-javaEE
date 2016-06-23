<%-- 
    Document   : index
    Created on : Jun 22, 2016, 12:16:29 PM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Search</title>
    </head>
    <body>
        <h1>Movie Search</h1>
        <form method="post" action="MovieSearch">
            <label for="searchParam">Search:</label>
            <input type="text" id="searchParam" name="searchParam">
            <br/>
            <br/>
            <input type="submit" value="Search">
        </form>  
        
        <h2>Movie List</h2>
        <c:forEach var="movie" items="${movies}">
            <p>${movie.Title} ${movie.Year}</p>
            <p>${movie.Poster}</p>
        </c:forEach>
        
    </body>
</html>
