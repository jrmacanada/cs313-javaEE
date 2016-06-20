<%-- 
    Document   : login.jsp
    Created on : Jun 15, 2016, 7:55:15 AM
    Author     : michaelcavey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Please log in:</h2>
    <form action="/FirstProject/SignIn" method="GET">
        <p><strong>Enter Your Username: </strong>
        <input type="text" name="j_username" size="25">
        <p><p><strong>Enter Your Password: </strong>
        <input type="password" size="15" name="j_password">
        <p><p>
        <input type="submit" value="Submit">
        <input type="reset" value="Clear Inputs">
    </form>
</body>
</html>
