<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Customer Registation Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>

<body>

<i>Fill out the form. Asteric(*) mean required.</i>
<br><br>

	<form:form action="processForm" modelAttribute="message1">
		
		First Name (*): <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		
		<br><br>
		
		Free passes (*): <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		
		<br><br>
		
		Course code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"></form:errors>
		
		<br><br>
		
		<input type="submit" value="Submit"/>
	
	
	</form:form> 




</body>
</html>