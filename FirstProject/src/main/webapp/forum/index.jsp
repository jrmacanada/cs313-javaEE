<%-- 
    Document   : index.jsp
    Created on : June 18, 2016
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to Forum</title>
    </head>
    <body>
        <h1>Welcome to Our Forum</h1>
        <h2>Please Log In</h2>
        <p>(for existing members)</p>
        <p>[ Enter <strong>guest/post</strong> (username/password) for access ]</p>
        <form action="/FirstProject/ForumIn" method="POST">
            <label for="txtName">Username:</label>
            <input type="text" name="username"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" name="password"></input>
            <br />
            <input type="submit" value="Login" />
        </form>
        <h2>Please Sign Up</h2>
        <p>(for new members)</p>
        <p>[ Does not generate new username/password ]</p>
        <form action="/FirstProject/ForumUp" method="POST">
            <label for="txtName">Username:</label>
            <input type="text" name="username"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" name="password"></input>
            <br />
            <input type="submit" value="SignUp" />
        </form>
    </body>
</html>
