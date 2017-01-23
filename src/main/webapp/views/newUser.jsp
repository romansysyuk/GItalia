
<%--
  Created by IntelliJ IDEA.
  User: kobeb
  Date: 20.01.2017
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Create new User</title>
</head>
<body>
<form:form method="post" action="/createNewUser" modelAttribute="user">
    <form:label path="firstName">First Name</form:label>
    <form:input path="firstName"/>
    <form:label path="lastName">Last Name</form:label>
    <form:input path="lastName"/>
</form:form>


</body>
</html>
