<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>사용자등록</h1>
	<p><spring:message code="greeting" arguments="${user.name}" text="Hi"/></p>

<%--
	<form action="${ctx}/user" method="post">

		이름 : <input type="text" name="name" value="${user.name}"/> <br/>
		이메일 : <input type="text" name="email" value="${user.email}" /> <br/>
		나이 : <input type="text" name="age" value="${user.age}"/> <br/>
		
		<!-- TODO BindingResult에 의해 에러가 발생시 필드 에러메시지 표시 -->
		
		<button type="submit">등록</button>
	</form>
--%>
	<form:form action="${ctx}/user" method="post" modelAttribute="user" autocomplete="off">
		<div>		
			<form:label path="name">이름</form:label>
			<form:input path="name" /><span class="frm_err"><form:errors path="name" /></span>
		</div>
		<div>
			<form:label path="email">이메일</form:label>
			<form:input path="email" />
			<span class="frm_err"><form:errors path="email" /></span>
		</div>
		<div>
			<form:label path="age">나이</form:label>
			<form:input path="age" />
			<span class="frm_err"><form:errors path="age" /></span>
		</div>
		
		<div>
			<!-- path 가 일치해야 하는 듯 -->
			<form:label path="birthday">생일</form:label>
			<form:input path="birthday" />
			<span class="frm_err"><form:errors path="birthday" /></span>
		</div>
		
		<button type="submit">등록</button>
	</form:form>


</body>
</html>