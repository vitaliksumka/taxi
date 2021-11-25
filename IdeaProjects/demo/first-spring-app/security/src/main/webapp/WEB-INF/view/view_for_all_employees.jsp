<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 38096
  Date: 24.11.2021
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>All Employees</title>
</head>
<body>

<h3>Information for All Employees</h3>

<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href= 'hr_info'">
    Only for HR staff
    <br><br>
</security:authorize>

<%--анотацiя 'security:authorize' дає можливість скрити кнопки від ролей котрі ними не володіють--%>

<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance" onclick="window.location.href= 'manager_info'">
    Only for Managers
    <br><br>
</security:authorize>





</body>
</html>
