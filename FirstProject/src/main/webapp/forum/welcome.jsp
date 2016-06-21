<%-- 
    Document   : welcome.jsp
    Created on : June 18, 2016
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post to Thread</title>
    </head>
    
    <body>
        <h2>Hello ${sessionScope.username}!</h2>
        
        <script>
            function clearContents(element) {
                element.value = '';
            }
        </script>
        
        <form action="/FirstProject/PostToThread" method="POST">
            <input type="hidden" name="username" value="${sessionScope.username}">
            <textarea onfocus="clearContents(this);" name="newpost" cols="80" rows="20">Add your comments here</textarea><br /><br />
            <input type="submit" value="Submit Comments">
        </form><br />
        
        <a href="/FirstProject/forum/listPosts.jsp">Display Thread</a>
        <br />
        <br />
        <a href="/FirstProject/ForumOut">Click here to log out</a>
    </body>
</html>
