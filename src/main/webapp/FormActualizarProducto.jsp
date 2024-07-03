<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="model.TblProductocl3" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Cliente</title>
</head>
<body  bgcolor="#c5dec9">
	<h1 align="center">Actualizar Cliente</h1>
	
	<form  method="post" action="ServletProductocl3">
	
		<%
			
			 String cod=request.getAttribute("id").toString();
			 String nom=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
			 String ape=(request.getAttribute("apellido")!=null)?request.getAttribute("apellido").toString():"";
			 String dni=(request.getAttribute("dni")!=null)?request.getAttribute("dni").toString():"";
			 String email=(request.getAttribute("email")!=null)?request.getAttribute("email").toString():"";
			 String telf=(request.getAttribute("telefono")!=null)?request.getAttribute("telefono").toString():"";
			 String sexo=(request.getAttribute("sexo")!=null)?request.getAttribute("sexo").toString():"";
			 String naci=(request.getAttribute("nacionalidad")!=null)?request.getAttribute("nacionalidad").toString():"";  
		%>
		<table align="center"  borde="2">
			<tr>
				<td>
				<input type="text" name="codigo"  value="">
				</td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td>
				<input type="text" name="nombre" value="">
				</td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><input type="text" name="apellido" value=""></td>
			</tr>
			<tr>
				<td>Dni</td>
				<td><input type="text" name="dni" value=""></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value=""></td>
			</tr>
			<tr>
				<td>Telefono</td>
				<td><input type="text" name="telefono" value=""></td>
			</tr>
			<tr>
				<td>Sexo</td>
				<td><input type="text" name="sexo" value=""></td>
			</tr>
			<tr>
				<td>Nacionalidad</td>
				<td><input type="text" name="nacionalidad"  value=""></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Actulizar Cliente"></td>
			</tr>
		
		</table>
	
	
	
	</form>

</body>
</html>