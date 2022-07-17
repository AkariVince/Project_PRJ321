<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "css/login.css">

<title>Login</title>
</head>
<body>

<div class = "loginBox">

	<img src="images/user.png" class ="admin">
	<h2>Administrator</h2>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<div>
		<p id= "message">${error}</p>
			<p>Username:</p> <input type="text" name="username" placeholder="Enter Username"/>
		</div>
		<div>
			<p>Password:</p> <input type="password" name="password" placeholder="**********"/>
		</div>
		<div>
			<p id = "remember">Remember me:</p> <input type="checkbox" name="remember"/>
		</div>
		<div>
			<input type="submit" value="Login"/>
		</div>
	</form>
</div>
</body>
</html>