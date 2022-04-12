<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<Title>Student Confirmation</Title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Preffered Coding Language: ${student.prefferedCodingLanguage}
	<br><br>
	Operating systems experience:
	<ul>
		<c:forEach var="temp" items="${student.osOptionsSelection}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>

</html>