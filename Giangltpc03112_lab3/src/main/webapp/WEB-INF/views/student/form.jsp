<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h2>Student Form</h2>
	<h3>${message}</h3>
	<form:form action="/student/save" modelAttribute="sv" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			<tr>
				<td>Marks:</td>
				<td><form:input path="marks" /></td>
				<td><form:errors path="marks" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobuttons items="${genders}" path="gender" /></td>
				<td><form:errors path="gender" /></td>
			</tr>
			<tr>
				<td>Faculty:</td>
				<td><form:select path="faculty">
						<form:option value="" label="-- Select Faculty --" />
						<form:options items="${faculties}" />
					</form:select></td>
				<td><form:errors path="faculty" /></td>
			</tr>
			<tr>
				<td>Hobbies:</td>
				<td><form:checkboxes items="${hobbies}" path="hobbies" /></td>
				<td><form:errors path="hobbies" /></td>
			</tr>
		</table>
		<input type="submit" value="Save" />
	</form:form>
</body>
</html>
