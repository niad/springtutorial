<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>사용자등록</h1>

	<form action="${ctx}/user" method="post">

		이름 : <input type="text" name="name" /><br/>
		이메일 : <input type="text" name="email" /><br/>

		<button type="submit">등록</button>
	</form>

</body>
</html>