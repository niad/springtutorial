<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="topMenu">MENU_USER</tiles:putAttribute>
	<tiles:putAttribute name="title">사용자</tiles:putAttribute>
	<tiles:putAttribute name="body">
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
	</tiles:putAttribute>
</tiles:insertDefinition>