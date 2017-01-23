<%--
  Created by IntelliJ IDEA.
  User: kobeb
  Date: 21.01.2017
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>

</head>
<body>
<div>
    <tiles:insertAttribute name="header"/>
</div>
<div>
    <tiles:insertAttribute name="menu"/>
</div>
<div class="myClass">
    <tiles:insertAttribute name="body"/>
</div>
<div>
    <tiles:insertAttribute name="footer"/>
</div>

</body>
</html>
