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
<jsp:include page="partials/head.jsp"/>

<title>Login</title>

<body>
<%--Navbar imports--%>
<jsp:include page="partials/navbar.jsp"/>
<h1 class="font-weight-bold font-italic text-center">LOGIN PAGE</h1>

<form class="p-4 col-4 offset-4 border" method="POST" action="/login.jsp">
    <div class="form-group">
        <label for="username">Username:</label>
        <input type="username" class="form-control" id="username" placeholder="Username" name="username">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" placeholder="Password" name="password">
    </div>
    <div class="form-check">
        <input type="checkbox" class="form-check-input" id="dropdownCheck">
        <label class="form-check-label" for="dropdownCheck">
            Remember me
        </label>
    </div>
    <button type="submit" class="btn btn-primary w-100">Sign in</button>
</form>


<% request.getParameter("username"); %>
<% request.getParameter("password"); %>

<c:choose>
    <c:when test = "${param.username == 'admin' && param.password == 'password'}">
        <c:redirect url="profile.jsp"/>
    </c:when>
    <c:otherwise>
        <h6>INVALID ENTRY OF: Username: ${param.username}, Password: ${param.password} </h6>
    </c:otherwise>
</c:choose>

<%--This form should have a 'username' and 'password' field.--%>

<%--This form should submit a POST request to /login.jsp--%>

<%--Inside of login.jsp write some code to check the submmitted values. --%>
<%--If the username submitted is "admin", and the password is "password", --%>
<%--redirect the user to the profile page, otherwise, redirect back to the login form.--%>

<%--JavaScript imports--%>
<jsp:include page="partials/scripts.jsp"/>
</body>
</html>
