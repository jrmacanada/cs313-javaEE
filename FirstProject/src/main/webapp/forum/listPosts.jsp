<%-- 
    Document   : list-posts.jsp
    Created on : Jun 19, 2016, 8:09:57 AM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forum Posts</title>
    </head>
    <body>
        <h2>CS-313 Forum</h2>
        <p><u>List of Posts</u></p>
        
        <pre><c:import url="/forum/thread.txt" /></pre>
        <a href="/FirstProject/forum/welcome.jsp">Post your reply</a>
    </body>
</html>
