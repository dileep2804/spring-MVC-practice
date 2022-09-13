<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="studdent">
		<!-- here path is a property in Student class -->
		First Name: <form:input path="firstName" />
		<!-- firstName is property of student class -->   
		<br><br>
		
		Last Name: <form:input path="lastName" />
		<!-- lastName is property of student class -->   
		<br><br>
		
		Country:
		<form:select path="country">
			<form:option value="PAK" label="pakistan" />
			<form:options items="${studdent.countryOptions}"/>
		</form:select>
		
		<br><br>
		
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		python <form:radiobutton path="favoriteLanguage" value="python"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		
		<br><br>
		
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		
		
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
	
	
</body>
</html>