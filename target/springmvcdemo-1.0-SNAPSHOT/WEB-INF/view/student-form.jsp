<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<Title>Student Registration Form</Title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>	
		Country: 
		<form:select path="country">
			<form:options items="${theCountryOptions}"/>
		</form:select>
		<br><br>
		Favorite Language:
		
		<form:radiobuttons path="prefferedCodingLanguage" items="${student.codingLanguageOptions }"/>
		<br><br>
		
		Operating systems experience:
		<form:checkboxes path="osOptionsSelection" items="${student.osOptions}"/>
		
		<br><BR>
		<input type="submit" value="Submit"/>

	</form:form>

</body>

</html>