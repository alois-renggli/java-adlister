<%--
  Created by IntelliJ IDEA.
  User: alois.renggli
  Date: 10/10/18
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    navbar example
</nav>

<h2>${$param.role}</h2>

<c:if test="${param.role != 'admin'}">
    <h1>Welcome to the site!</h1>
</c:if>

<c:if test="${param.role == 'admin'}">
    <h1>Welcome to the admin dashboard!</h1>
</c:if>