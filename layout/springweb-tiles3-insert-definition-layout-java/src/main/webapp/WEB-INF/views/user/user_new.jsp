<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<tiles:insertDefinition name="layoutDefault">
	<tiles:putAttribute name="topMenu">MENU_USER</tiles:putAttribute>
	<tiles:putAttribute name="title">사용자</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<h1>사용자등록</h1>

	<form action="${ctx}/user" method="post">

		이름 : <input type="text" name="name" /><br/>
		이메일 : <input type="text" name="email" /><br/>

		<button type="submit">등록</button>
	</form>

	</tiles:putAttribute>
</tiles:insertDefinition>