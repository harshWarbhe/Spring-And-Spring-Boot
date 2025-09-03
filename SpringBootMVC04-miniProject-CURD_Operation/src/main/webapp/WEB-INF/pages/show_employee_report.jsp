<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show_employee_report</title>
</head>
<body>

	<c:choose>
		<c:when test="${!empty empList}">
			<h1 style="color: red; text-align: center;">Employee Report</h1>
			<table border="1" align="center" bgcolor="grey">
				<tr style="color: red;">
					<th>emp no</th>
					<th>emp name</th>
					<th>job</th>
					<th>salary</th>
					<th>dept no</th>
					<th>Operation</th>
				</tr>
				<c:forEach var="emp" items="${empList}">
					<tr style="color: blue">
						<td>${emp.empno}</td>
						<td>${emp.ename }</td>
						<td>${emp.job }</td>
						<td>${emp.sal }</td>
						<td>${emp.deptno }</td>
						<td><a href="emp_edit?no=${emp.empno}"><img
								src="images/edit-icon.png" width="30" height="30"></a> <a
							href="emp_delete?no= ${emp.empno}"
							onclick="return confirm('do you want to delete the employe')"><img
								src="images/delete-icon.png" width="30" height="30"></a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h1 style="color: red; text-align: center;">Employee not found</h1>
		</c:otherwise>
	</c:choose>

	<h2 style="color: red; text-align: center;">${resultMsg}</h2>
	
	<div style="text-align: center;">
	<a href="emp_add"><img src="images/add-emp-icon.png" width="40"
		height="50">Add Employee</a> &nbsp;&nbsp;
	<a href="./"><img src="images/home.png" width="40" height="50">Home</a>
	</div>


</body>
</html>