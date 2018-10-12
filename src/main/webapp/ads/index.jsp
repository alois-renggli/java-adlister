<%--
  Created by IntelliJ IDEA.
  User: alois.renggli
  Date: 10/12/18
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/partials/head.jsp"/>
<style>
    .ads{
        margin: 5px;
        border: 1px solid black;
        background-color: lightgrey;
        height: 250px;
        width: 250px;
        float: left;
    }

</style>
<body class="m-3 border">

<jsp:include page="/partials/navbar.jsp"/>

<h1 class="text-center">Here are all the ads:</h1>
<div class="container">
    <div class="text-center row">
        <c:forEach var="ad" varStatus="status" items="${ads}">
            <div class="ads col-xs-6 col-md-4 col-lg-3">
                <h2 class="text-center">${ad.title}</h2>
                <h4 class="text-center">User: ${ad.userId}</h4>
                <p class="text-center">Description: ${ad.description}</p>
            </div>
        </c:forEach>
    </div>
</div>

<jsp:include page="/partials/scripts.jsp"/>

</body>

</html>