<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>블로그</h1>
<ul>
	<li><a href="${ctx}">메인</a></li>
	<li><a href="${ctx}/login">로그인</a></li>
	<li><a href="${ctx}/user">사용자목록</a></li>
</ul>


</body>
</html>