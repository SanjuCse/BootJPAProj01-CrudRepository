<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link
            href="../../css/bootstrap.min.css"
            rel="stylesheet"></link>
    <script
            src="../../js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center text-success border rounded">Update Employee</h1>
    <frm:form modelAttribute="emp" cssClass="form-control">
        <table class="table">
            <tbody class="col">
            <tr>
                <td class="col-4">Employee ID</td>
                <td class="col-8"><frm:input cssClass="form-control" path="empno" readonly="true"/></td>
            </tr>
            <tr>
                <td class="col-4">Employee Name</td>
                <td class="col-8"><frm:input cssClass="form-control" path="ename"/></td>
            </tr>
            <tr>
                <td class="col-4">Employee Designation</td>
                <td class="col-8"><frm:input path="job" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td class="col-4">Employee Salary</td>
                <td class="col-8"><frm:input path="sal" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td class="col-4">Dept. No</td>
                <td class="col-8"><frm:input path="deptNo" cssClass="form-control"/></td>
            </tr>
            <tr class="text-center">
                <td><input type="submit" value="Update Employee" class="btn btn-primary"></td>
                <td><input type="reset" value="cancel" class="btn btn-danger"></td>
            </tr>
            </tbody>
        </table>
    </frm:form>
    <div class="text-center mt-2">
        <a class="btn btn-primary" href="emp_report"><span class="bi bi-database"></span> Report Page</a>
        <a class="btn btn-secondary" href="./"><span class="bi bi-house"></span> Home Page</a>
    </div>
</div>
</body>
</html>