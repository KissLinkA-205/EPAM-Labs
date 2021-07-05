<%--
  Created by IntelliJ IDEA.
  User: Angelika
  Date: 21.06.2021
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <jsp:include page="../fragments/header.jsp"/>
<body>
<c:if test="${requestScope.status}">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Device group</th>
            <th>Name</th>
            <th>Origin</th>
            <th>Price</th>
            <th>Peripheral</th>
            <th>Energy consumption</th>
            <th>Cooler</th>
            <th>COM</th>
            <th>USB</th>
            <th>LPT</th>
            <th>Critical</th>
        </tr>
        </thead>
        <c:forEach var="device" items="${devices}">
            <tbody>
            <tr>
                <td><c:out value="${device.id}"/></td>
                <td><c:out value="${device.deviceGroup.getGroup()}"/></td>
                <td><c:out value="${device.name}"/></td>
                <td><c:out value="${device.origin}"/></td>
                <td><c:out value="${device.price}"/></td>
                <td><c:out value="${device.deviceType.peripheral}"/></td>
                <td><c:out value="${device.deviceType.energyConsumption}"/></td>
                <td><c:out value="${device.deviceType.cooler}"/></td>
                <td><c:out value="${device.deviceType.COM}"/></td>
                <td><c:out value="${device.deviceType.USB}"/></td>
                <td><c:out value="${device.deviceType.LPT}"/></td>
                <td><c:out value="${device.critical}"/></td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</c:if>
<c:if test="${!requestScope.status}">
    <h1 align="center" style="color:red">ERROR</h1>
    <hr align="center" width="70%">
    <h4 align="center">This file is not valid!</h4>
    <h4 align="center">Press Home to return</h4>
</c:if>
<jsp:include page="../fragments/footer.jsp" />
</body>
</html>