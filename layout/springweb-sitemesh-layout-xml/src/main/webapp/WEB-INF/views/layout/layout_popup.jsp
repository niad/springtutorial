<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title><sitemesh:write property="title" /></title>
	<script src="${ctx}/js/jquery-1.12.4.min.js"></script>
	<sitemesh:write property="head" />
	
</head>
<body>

	<div>Popup Layout</div>

	<sitemesh:write property="body" />
	

</body>
</html>