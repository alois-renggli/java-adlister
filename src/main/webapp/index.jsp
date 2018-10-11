<%--
  Created by IntelliJ IDEA.
  User: alois.renggli
  Date: 10/10/18
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JSP File</title>
</head>
<body>
    <h1> Test</h1>
<jsp:include page="navbar.jsp">
    <jsp:param name="role" value="admin"></jsp:param>
</jsp:include>


<jsp:include page="fizzBuzz.jsp"/>


</body>
</html>
