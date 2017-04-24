<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="topMenu">MENU_USER</tiles:putAttribute>
	<tiles:putAttribute name="title">사용자</tiles:putAttribute>
	<tiles:putAttribute name="body">
		<h1>사용자수정</h1>
	
		<form id="updateForm" action="${ctx}/user/${user.id}" method="post">
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${user.name}"/></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email" value="${user.email}"/></td>
				</tr>		
			</table>
		</form>
		
		<div>
			<button type="button" onclick="document.getElementById('updateForm').submit();">저장</button> 
			<button type="button" onclick="location.href='${ctx}/user/${user.id}'">취소</button>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>