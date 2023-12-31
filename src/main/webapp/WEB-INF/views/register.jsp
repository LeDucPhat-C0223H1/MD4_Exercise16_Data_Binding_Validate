
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>

<form:errors cssClass="alert alert-danger" path="*" element="div"/>

<form:form cssClass="p-4" cssStyle="max-width: 30rem;margin: 20px auto; border: 1px solid; border-radius: 10px"
           action="/registerred" method="post"
           modelAttribute="registerForm">

    <div class="mb-3">
        <form:label path="username" cssClass="form-label">Username</form:label>
        <form:input path="username" cssClass="form-control" id="username"/>
        <form:errors cssClass="alert alert-danger" path="username" element="div"/>
    </div>
    <div class="mb-3">
        <form:label path="password" cssClass="form-label">Password</form:label>
        <form:input type="password" path="password" cssClass="form-control" id="username"/>
        <form:errors cssClass="alert alert
        -danger" path="password" element="div"/>
    </div>
    <div class="mb-3">
        <form:label path="rePassword" cssClass="form-label">Cornfirm  Password</form:label>
        <form:input  path="rePassword" cssClass="form-control" id="password"/>
        <form:errors cssClass="alert alert-danger" path="rePassword" element="div"/>
    </div>
    <div class="mb-3">
        <form:label path="id" cssClass="form-label">Id</form:label>
        <form:input  path="id" cssClass="form-control" id="id"/>
        <form:errors cssClass="alert alert-danger" path="id" element="div"/>
    </div>
    <div class="mb-3">
        <form:label path="fullName" cssClass="form-label">fullName</form:label>
        <form:input  path="fullName" cssClass="form-control" id="fullName"/>
        <form:errors cssClass="alert alert-danger" path="fullName" element="div"/>
    </div>
    <div class="mb-3">
        <form:label path="birthday" cssClass="form-label">Birthday</form:label>
        <form:input type="date" path="birthday" cssClass="form-control" id="birthday"/>
        <form:errors cssClass="alert alert-danger" path="birthday" element="div"/>
    </div>
    <form:errors cssClass="alert alert-danger" path="message" element="div"/>
    <button class="btn btn-info" type="submit">Register</button>
</form:form>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
