<%-- 
    Document   : index.jsp
    Created on : Nov 11, 2014, 9:43:00 AM
    Author     : sburton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Simple Login App</title>
    </head>
    <body>
        <h1>Please Log In</h1>
        <form action="/FirstProject/Login" method="GET">
            <label for="txtName">Username:</label>
            <input type="text" id="txtUsername" name="txtUsername"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" id="txtPassword" name="txtPassword"></input>
            <br />
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
