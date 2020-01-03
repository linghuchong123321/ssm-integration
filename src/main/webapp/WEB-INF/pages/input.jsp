<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
<form action="/add" method="post">
    <%--<input type="hidden" name="_method" value="PUT">--%>
    <div class="form-group">
        <label for="exampleInputName">EmployeeName</label>
        <input type="text" name="empName" class="form-control" id="exampleInputName" placeholder="用户名">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail">Email</label>
        <input type="email" name="email" class="form-control" id="exampleInputEmail" placeholder="邮箱">
    </div>
    <div class="form-group">
        <label class="radio-inline">
            <input type="radio" checked name="gender" id="inlineRadio1" value="男"> 男
        </label>
        <label class="radio-inline">
            <input type="radio" name="gender" id="inlineRadio2" value="女"> 女
        </label>
    </div>
    <div class="checkbox">
        <select class="form-control" name="dId">
            <c:forEach items="${departments}" var="department">
                <option value="${department.deptId}">${department.deptName}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
<script src="/static/js/jquery-1.12.4.min.js"></script>
<script src="/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</html>
