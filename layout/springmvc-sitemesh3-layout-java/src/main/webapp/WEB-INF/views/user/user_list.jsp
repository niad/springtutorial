<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="topMenu" content="MENU_USER">
<meta name="subMenu" content="MENU_USER_LIST"> <!-- 테스트용 서브메뉴 -->
<title>사용자</title>
</head>
<body>
	<h1>사용자목록</h1>

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
	<a href="${ctx}/user/new">등록</a>
	<a href="javascript:;" onclick="open('${ctx}/user/popup', '', '');">팝업</a>
</body>
</html>