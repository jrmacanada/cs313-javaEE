<%-- 
    Document   : index.jsp
    Created on : June 18, 2016
    Author     : mcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Login to Forum</title>
    </head>
    <body>
        <h1>Welcome to Our Forum</h1>
        <h2>Please Log In</h2>
        <p>(for existing members)</p>
        <form action="/FirstProject/ForumIn" method="POST">
            <label for="txtName">Username:</label>
            <input type="text" id="txtUsername" name="txtUsername"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" id="txtPassword" name="txtPassword"></input>
            <br />
            <input type="submit" value="Login" />
        </form>
        <h2>Please Sign Up</h2>
        <p>(for new members)</p>
        <form action="/FirstProject/ForumIn" method="POST">
            <label for="txtName">Username:</label>
            <input type="text" id="txtUsername" name="txtUsername"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" id="txtPassword" name="txtPassword"></input>
            <br />
            <input type="submit" value="SignUp" />
        </form>
    </body>
</html>
