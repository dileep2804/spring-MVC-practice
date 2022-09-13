<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title> Customer Confirmation Page</title>
</head>

<body>

<!-- using jsp expression language -->
The customer is confirmed: ${message1.firstName} ${message1.lastName }

<br><br>

Free passes: ${message1.freePasses}

<br><br>

Postal Code: ${message1.postalCode}

<br><br>

Course code: ${message1.courseCode}



</body>




</html>