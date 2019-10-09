<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success page</title>
</head>
<body>
	<h5>login was successful</h5>
	<table border="0">
		<tr>
			<td>name:</td>
			<td>${user.username}</td>
		</tr>

		<tr>
			<td>password:</td>
			<td>${user.password}</td>
		</tr>

		<tr>
			<td>age:</td>
			<td>${user.age}</td>
		</tr>

		<tr>
			<td>email:</td>
			<td>${user.email}</td>
		</tr>

	</table>
</body>
</html>
