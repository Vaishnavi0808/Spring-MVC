 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login Here</h1>
<form action="submitlogin" method="post" name="loginForm" modelAttribute="login">
<table>
<tr><td>UserName</td><td><input type="text" name="userName" id="userName"></td></tr>
<tr><td>Password</td><td><input type="password" name="password" id="password"></td></tr>
<tr><td><input type="submit" value="Login" name="submit"></td></tr>
<tr><td><input type="reset" value="Cancel" name="cancel"></td></tr>
</table>
</form>
</center>
</body>
</html>