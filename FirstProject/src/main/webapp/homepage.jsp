<%-- 
    Document   : homepage
    Created on : Jun 15, 2016, 3:49:35 PM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome Page</h1>
        <p>Hello ${param.j_username}, glad you made it!</p>
        
        <form action="LogOut" method="get">
            <input type="submit" value="Good-bye">
        </form>
    </body>
</html>
