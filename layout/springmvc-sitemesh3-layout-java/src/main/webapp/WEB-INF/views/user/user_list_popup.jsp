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
	<h1>사용자목록 </h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.id}</td>
				<td><a href="${ctx}/user/${user.id}">${user.name}</a></td>
				<td>${user.email}</td>
			</tr>
			</c:forEach>
		</tbody>	
	</table>
</body>
</html>