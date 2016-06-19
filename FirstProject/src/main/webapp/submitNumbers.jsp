<%-- 
    Document   : submitNumbers
    Created on : Jun 14, 2016, 5:21:48 PM
    Author     : michaelcavey
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Submission</title>
    </head>
    <body>
        <h1>Number Submission - Simple JSP</h1>
        <form action="ComputeSum" method="GET">
            First Number: <input type="text" name="first" /><br />
            Second Number: <input type="text" name="second" /><br />
            <input type="submit" value="Compute Sum" />
        </form>
    </body>
</html>
