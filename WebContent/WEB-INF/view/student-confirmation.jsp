<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is Confirmed! ${student.firstName} ${student.lastName}

<br></br>

Country: ${student.country}
<br></br>

Fav Language: ${student.favoriteLanguage}


<br></br>
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li>${temp}</li>
	</c:forEach>
</ul>
<br></br>
</body>
</html>