<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
    <a href="/add" class="btn btn-success">Add Employee</a>
    <table class="table table-bordered table-striped table-hover">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Department</th>
            <th colspan="2">Setting</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.emp_id}</td>
                <td>${employee.emp_name}</td>
                <td>${employee.gender}</td>
                <td>${employee.email}</td>
                <td>${employee.dept_name}</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
        </c:forEach>
    </table>
</body>
<script src="/static/js/jquery-1.12.4.min.js"></script>
<script src="/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</html>
