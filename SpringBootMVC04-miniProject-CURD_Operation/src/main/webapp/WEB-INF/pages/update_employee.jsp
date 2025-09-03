<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update_employee</title>
</head>
<body>

	<h1 style="color: red; text-align: center;">Update Employee</h1>

	<frm:form modelAttribute="emp">
		<table align="center" bgcolor="grey">
			<tr>
				<td>Employee No:</td>
				<td><frm:input path="empno" readonly="true" /></td>
			</tr>
			<tr>
				<td>Employee Name:</td>
				<td><frm:input path="ename" /></td>
			</tr>
			<tr>
				<td>Employee Desg:</td>
				<td><frm:input path="job" /></td>
			</tr>
			<tr>
				<td>Employee Salary:</td>
				<td><frm:input path="sal" /></td>
			</tr>
			<tr>
				<td>Employee Deptno:</td>
				<td><frm:input path="deptno" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update Employee"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>


		</table>
	</frm:form>

	<div style="text-align: center;">
		<a href="./"><img src="images/home.png" width="40" height="50">Home</a>
	</div>

</body>
</html>