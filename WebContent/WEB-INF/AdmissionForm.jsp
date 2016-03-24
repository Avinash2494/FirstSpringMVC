<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission form</title>
</head>
<body>
<h1>Enter ur details</h1>
<form action="/FirstSpringMVC/submitadmissionForm.html" method = "post">
Enter name <input type = "text" name ="studentname"/>
Enter hobby <input type = "text" name ="studenthobby"/>
Enter mobile number <input type="text" name="studentMobile"/>
Enter DOB <input type="text" name="studentDOB"/>
Select Student skill<select name="studentSkills" multiple><option value ="java core">Java core</option>
<option value ="Spring core">Spring core</option>
<option value ="Spring MVC">Spring MVC</option></select>


Enter student address<input type="text" name = "studentAddress.country"/>
<input type="text" name = "studentAddress.city"/>
<input type="text" name = "studentAddress.street"/>
<input type="text" name = "studentAddress.pincode"/>



<input type="submit"/>
</form>
</body>
</html>