<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	
	<br></br>
	
	Last Name: <form:input path="lastName" />
	
	<br></br>
	Country:
	
	<form:select path="country">
	
	<form:options items="${student.countryOptions}"/>

	
	</form:select>
	
	<br></br>
	
	Fav Language:
	
	Java<form:radiobutton path="favoriteLanguage" value="Java"/>
	PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
	C#<form:radiobutton path="favoriteLanguage" value="C#"/>
	Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
	
		<br></br>
		Operating Systems
		Linux:<form:checkbox path="operatingSystems" value="Linux"/>
		Android:<form:checkbox path="operatingSystems" value="Android"/>
		Windows:<form:checkbox path="operatingSystems" value="Windows"/>
		
		<br></br>
	<input type="submit" value="submit"/>
	</form:form>
	




</body>
</html>