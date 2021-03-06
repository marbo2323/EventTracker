<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendee Page</title>
<style type="text/css">
	.error {
		color: #ff0000;
	}
	.errorblock {
		color: #000;
		background-color: #ffeeee;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px
	}
</style>
</head>
<body>

	<a href="?language=en">English</a> |
	<a href="?language=es">Spanish</a>

	<form:form modelAttribute = "attendee">
		<form:errors path="*" cssClass="errorblock" element="div"/>
		<label for = "textinput1"><spring:message code="attendee.name"/>:</label>
		<form:input path="name" cssErrorClass="error"/>
		<form:errors path="name" cssClass="error"/>
		<br/>
		<label for = "textinput2"><spring:message code="attendee.email.address"/>:</label>
		<form:input path="emailAddress" cssErrorClass="error"/>
		<form:errors path="emailAddress" cssClass="error"/>
		<br/>
		<label for = "textinput3"><spring:message code="attendee.phone"/>:</label>
		<form:input path="phone" cssErrorClass="error"/>
		<form:errors path="phone" cssClass="error"/>
		<br/>
		<spring:message code="attendee.enter.attendee" var="enterAttendeeTitle"/>
		<input type="submit" class="btn" value="${enterAttendeeTitle}"/>
	</form:form>

</body>
</html>