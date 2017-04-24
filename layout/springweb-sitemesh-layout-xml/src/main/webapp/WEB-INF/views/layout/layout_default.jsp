<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title><decorator:title default="사이트메시레이아웃" /></title>
	<decorator:head />
</head>
<body>

	<div>Header</div>
	<div>Menu</div>

	<decorator:body/>
	
	<div>Footer</div>

</body>
</html>