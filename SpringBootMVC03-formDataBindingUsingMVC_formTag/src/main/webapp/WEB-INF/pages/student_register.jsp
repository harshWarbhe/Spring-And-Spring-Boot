<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@page language="java"%>

	<h1 style="color: red; text-align: center;">Student Registration
		Form</h1>

	<frm:form action="register" method="post"  modelAttribute="stud">
		<table align="center">

			<tr>
				<td>Student NO :</td>
				<td><input type="text" name="sno"></td>
			</tr>
			<tr>
				<td>Student Name :</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student Address :</td>
				<td><input type="text" name="saddrs"></td>
			</tr>
			<tr>
				<td>Student avg :</td>
				<td><input type="text" name="avg"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>
	</frm:form>
</body>
</html>