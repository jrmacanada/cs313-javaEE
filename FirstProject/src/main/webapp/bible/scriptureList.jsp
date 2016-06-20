<%-- 
    Document   : scriptureList
    Created on : Jun 14, 2016, 8:38:30 PM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Scripture List</title>
    </head>
    <body>
        <h1>Scripture List</h1>  
  
        <% 
        List<String> scriptures = new ArrayList<String>(); 
        scriptures.add("Proverbs 3:5"); 
        scriptures.add("Doc. &amp; Cov. 112:10"); 
        scriptures.add("John 7:17"); 
        %>       

        <div>
        Scriptures:<br /><br />
        <% 
        for (String scripture : scriptures){
        out.println(scripture + "<br />");
        }
        %>
        </div>

<%--    WAS - step 2.2 (Jonny) Page-2 
        <div>
        Scriptures:<br /><br />

        <%
        for (String scripture : (List<String>)request.getAttribute("scriptures")) {
        out.println(scripture + "<br />");
        } 
        %>

        </div>
--%>
<%--    //IS - step 2.4 (Jonny) Page-3 
        <div> 
            Scriptures:<br /><br />
            
            <c:forEach var="scripture" items="${scriptures}">
            ${scripture}<br />
            </c:forEach>
            
        </div>
--%>
    </body>
</html>
