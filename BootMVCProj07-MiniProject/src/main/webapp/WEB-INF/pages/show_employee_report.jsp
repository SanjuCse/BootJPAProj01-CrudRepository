<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
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
    <c:if test="${!empty resultMsg}">
        <div class="alert alert-success fade show alert-dismissible">
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
            <span>${resultMsg}</span>
        </div>
    </c:if>
    <c:choose>
        <c:when test="${!empty empsList}">
            <h1 class="border text-primary text-center rounded">Employees Report <span class="bi bi-database"></span>
            </h1>
            <table class="table table-bordered table-striped table-hover">
                <thead class="text-center table-primary">
                <th>Employee No</th>
                <th>Employee Name</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Dept. No</th>
                <th>Edit Emp</th>
                <th>Delete Emp</th>
                </thead>

                <c:forEach var="emp" items="${empsList}">
                    <tbody class="text-center">
                    <tr>
                        <td>${emp.empno}</td>
                        <td>${emp.ename}</td>
                        <td>${emp.job}</td>
                        <td>${emp.sal}</td>
                        <td>${emp.deptNo}</td>
                        <td><a href="emp_edit?no=${emp.empno}" class="btn btn-success link-underline-light"><span
                                class="bi bi-pencil"></span> Edit</a></td>
                        <td><a href="emp_delete?no=${emp.empno}"
                               onclick="return confirm('Do you want to Delete the employee?')"
                               class="btn btn-danger"><span
                                class="bi bi-trash"></span> Delete</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h1 class="text-danger text-center border">Employees Not Found</h1>
        </c:otherwise>
    </c:choose>
    <div class="text-center">
        <a class="btn btn-primary" href="emp_add"><span class="bi bi-person-add"></span> Add Employee</a>
        <a class="btn btn-secondary" href="./"><span class="bi bi-house"></span> Home Page</a>
    </div>
</div>
</body>
</html>