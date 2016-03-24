<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admission Successful ${msg}</h1>
<form:errors path="studentinfo.*"/>
${studentinfo.studentname}
${studentinfo.studenthobby}
${studentinfo.studentMobile}
${studentinfo.studentDOB}
${studentinfo.studentSkills}
${studentinfo.studentAddress.country}
${studentinfo.studentAddress.city}
${studentinfo.studentAddress.street}
${studentinfo.studentAddress.pincode}

</body>
</html>