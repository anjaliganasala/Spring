<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi welcome ${name}</h1>

<form action="signup" method="post"><br>
   Email: <input type="text" name="email"><br><br>
   Password: <input type="password" name="password"> 
   <input type="submit" value="submit">
</form>

</body>
</html>