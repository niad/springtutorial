<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="topMenu"><sitemesh:write property="meta.topMenu"/></c:set>
<c:set var="subMenu"><sitemesh:write property="meta.subMenu"/></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title><sitemesh:write property="title" /></title>
	<script src="${ctx}/js/jquery-1.12.4.min.js"></script>
	<sitemesh:write property="head" />
	
</head>
<body>

	<div>Header</div>
	<div>Menu ${topMenu}, ${subMenu}</div>

	<sitemesh:write property="body" />
	
	<div>Footer</div>

</body>
</html>