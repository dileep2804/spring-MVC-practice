<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation</title>
</head>

<body>

	The Student is Confirmed: ${studdent.firstName }	${studdent.lastName }
	<br>
	
	Country: ${studdent.country} <!-- will call Student.getCountry -->
	<br>
	
	Favorite Language; ${studdent.favoriteLanguage}
	<br>
	
	Experienced in following operating systems:
	<%-- Using jstl for looping over operatingSystems --%>
	<ul> <!-- using bullet list -->
		<c:forEach var="temp" items="${studdent.operatingSystems}">
			<li> ${temp }</li>
		</c:forEach>
	
	</ul>
	
	
	
</body>
</html>