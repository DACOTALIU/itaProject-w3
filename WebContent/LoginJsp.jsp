<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login" method="post">
		<div class="login_user">
			<label for="password">User name: </label> 
		<input type="text" id="username" name="username"><br>
		</div>
		<div class="login_user">
			<label for="password">Password: </label> 
			<input type="password"
				 id="password" name="password" /><br>
		</div>
		
		<div class="login_user">
			<input type="submit" id="submit" name="submit" value="Login" />
			<input type="button" id="back" name="back" value="Back" />
		</div>
	</form>
	<a href="http://10.222.232.152:8082/itaProject-w3/register.html">register</a>
</body>
</html>