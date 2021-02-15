<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form' %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Form</title>
</head>
<body>
<%--<form:form action="createStudent" method="POST" modelAttribute="student">--%>
<form:form action="studentCreated" method="POST" modelAttribute="student">
    <label for="firstNameInput">First Name : </label>
    <form:input path="firstName" id="firstNameInput"/>
    <br><br>
    <label for="lastName">Last Name: </label>
    <form:input path="lastName" id="lastNameInput"/>
    <br><br>
    <label for="ageInput">Age: </label>
    <form:input path="age" id="ageInput"/>
    <br><br>
    <label for="phoneNumberInput">Phone Number: </label>
    <form:input path="phoneNumber" id="phoneNumberInput"/>
    <br><br>
    <label for="addressInput">Address : </label>
    <form:input path="address" id="addressInput"/>
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
