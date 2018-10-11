<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: alois.renggli
  Date: 10/11/18
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:forEach var="item" begin="1" end="30">
    <c:choose>
        <c:when test="${item % 3 == 0 && item % 5 ==0}">
            <p>FizzBuzz</p>
        </c:when>
        <c:when test="${item % 3 == 0}">
            <p>Fizz</p>
        </c:when>
        <c:when test="${ item % 5 == 0}">
            <p>Buzz</p>
        </c:when>
        <c:otherwise>
            <p>${item}</p>
        </c:otherwise>
    </c:choose>
</c:forEach>
