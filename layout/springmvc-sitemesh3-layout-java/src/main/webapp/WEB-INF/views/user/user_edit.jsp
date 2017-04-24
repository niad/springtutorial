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
	<h1>사용자수정</h1>

	<form id="updateForm" action="${ctx}/user/${user.id}" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td>${user.name}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${user.email}</td>
			</tr>		
		</table>
	</form>
	
	<div>
		<button type="button" onclick="document.getElementById('updateForm').submit();">저장</button> 
		<button type="button" onclick="location.href='${ctx}/user/${user.id}'">취소</button>
	</div>

</body>
</html>