<%--
  Created by IntelliJ IDEA.
  User: muger
  Date: 2018/8/1
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>ZDHSPACE</title>
</head>
<body>
    <c:forEach items="${idAndTitle}" var="iat">
          <a href="/blog/${iat.get("b_id")}">${iat.get("b_title")}</a>
    </c:forEach>
</body>
</html>
