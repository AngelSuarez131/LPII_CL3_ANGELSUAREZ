<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl3" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Productos</title>
</head>
<body bgcolor="#00cc99">
	<h1 align="center">Registrar Producto</h1>
	<form action="ControladorProdcl2" method="post"> <!-- Form apunta a controlador -->
		<table border="2" align="center" >
			<tr>
				<td>Descripcion</td>
				<td> <input type="text" name="desc"> </td>
			</tr>
			
			<tr>
				<td>Estado</td>
				<td> <input type="text" name="estado"> </td>
			</tr>
			
			<tr>
				<td>Precio compra</td>
				<td> <input type="text" name="preciocomp"> </td>
			</tr>
			
			<tr>
				<td>Precio Venta</td>
				<td> <input type="text" name="preciovent"> </td>
			</tr>
			
			<tr>
				<td>Nombre</td>
				<td> <input type="text" name="nom"> </td>
			</tr>
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Registrar Producto">
				</td>
			</tr>
		</table>
	
	
	</form>
	
	
	<h1 align="center">Listado de Productos test</h1>
	<table border="2" align="center">
		<tr>	
			<td>Descripcion</td>
			<td>Estado</td>
			<td>Precio Compra</td>
			<td>Precio Venta</td>
			<td>Nombre</td>
		</tr>
	
	<%
	List<TblProductocl3> listadoproducto=(List<TblProductocl3>)request.getAttribute("listadoprodcl3");

		//Condicion
		if(listadoproducto != null){
			//Bucle
			for(TblProductocl3 lis:listadoproducto){
				%>
				<tr>
					<td><%=lis.getDescripcl3()%></td>
				
					<td><%=lis.getEstadocl3() %></td>
				
					<td><%=lis.getPreciocompcl3() %></td>
				
					<td><%=lis.getPrecioventacl3()%></td>
				
					<td><%=lis.getNombrecl3() %></td>
				</tr>
				
				<%
			}//FIn del bucle
			%>
			<% 
		}//Fin de condicion
	%>
	</table>
</body>
</html>