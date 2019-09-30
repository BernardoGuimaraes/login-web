<%@page import="br.ucsal.sistem.model.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div>
 <%Usuario usuario= (Usuario) request.getAttribute("usuario"); %>
 <%="Bem Vindo"+usuario.getLogin()+"!" %>
 </div>
</body>
</html>
