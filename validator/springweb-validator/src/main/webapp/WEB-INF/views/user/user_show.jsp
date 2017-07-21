<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자정보</h1>

	<form id="deleteForm" action="${ctx}/user/${user.id}/delete" method="post">
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
		<button type="button" onclick="location.href='${ctx}/user/${user.id}/edit'">수정</button> 
		<button type="button" onclick="document.getElementById('deleteForm').submit();">삭제</button>
	</div>

</body>
</html>