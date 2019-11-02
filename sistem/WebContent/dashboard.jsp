<%@page import="br.ucsal.sistem.model.Usuario" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
 <div>
 <%Usuario usuario= (Usuario) request.getAttribute("usuario"); %>
 <%="Bem Vindo"+usuario.getLogin()+"!" %>
 </div>
</body>
</html>
