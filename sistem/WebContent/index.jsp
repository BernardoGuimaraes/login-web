<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div>
		<form action="LoginServlet" method="post">
		Usuario: <input name="usuario" type="text" ><br>
  		Senha:<input name="senha" type="password" ><br>
  <button type="submit">Enviar</button>
  <%if(request.getParameter("error")!=null){%>
  <%=request.getAttribute("error") %>
  <%} %> 
  </form>
 </div>
</body>
</html>