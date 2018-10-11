<%--
  Created by IntelliJ IDEA.
  User: alois.renggli
  Date: 10/11/18
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--When a user visits /login.jsp, they should see a form for logging in--%>
<form method="GET" action="/login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" placeholder="test1" />
    <br/>
    <label for="password">Password:</label>
    <input type="text" id="password" name="password" placeholder="test2" />
    <br/>
    Submit<input type="submit" value="submit">
    <br/>
</form>


<% request.getParameter("username"); %>
<% request.getParameter("password"); %>

<%--<h1>This is the username: ${param.username}</h1>--%>
<%--<h1>This is the password: ${param.password}</h1>--%>

<c:choose>
<c:when test = "${param.username == 'admin' && param.password == 'password'}">
<c:redirect url="profile.jsp"/>
</c:when>
    <c:when test = "${param.username == '' || param.password == ''}">
        <c:redirect url="login.jsp"/>
    </c:when>
    <c:otherwise>
        <h1>INVALID ENTRY OF: Username: ${param.username}, Password: ${param.password} </h1>
    </c:otherwise>
</c:choose>

<%--This form should have a 'username' and 'password' field.--%>

<%--This form should submit a POST request to /login.jsp--%>

<%--Inside of login.jsp write some code to check the submmitted values. --%>
<%--If the username submitted is "admin", and the password is "password", --%>
<%--redirect the user to the profile page, otherwise, redirect back to the login form.--%>




</body>
</html>
