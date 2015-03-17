<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="loginServlet.jsp" method="post">

		login :<input type="text" name="login" value="${user.login}" /><br />
		password :<input type="password" name="password" value="${user.password}" /><br />
		<input type="submit" value=" OK ">

	</form>
	<form action="Profile.jsp" method="post">
	<input type="submit" value="back">
	</form>
</body>
</html>