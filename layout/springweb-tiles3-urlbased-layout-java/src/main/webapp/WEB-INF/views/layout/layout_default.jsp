<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
	<tiles:insertAttribute name="header" />
	<script src="${ctx}/js/jquery-1.12.4.min.js"></script>
</head>
<body>

	<div>
<%-- 		<tiles:insertAttribute name="topMenu"/> --%>
<%-- 		<tilesx:useAttribute name="topMenu"/> --%>
<%-- 		<tiles:insertAttribute name="topMenu"/> --%>
<%-- 		active Menu is '${topMenu}' --%>
	</div>
	<tiles:insertAttribute name="topMenu"/>
<%-- 	<tiles:insertAttribute name="menu" /> --%>


	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
	

</body>
</html>