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
<title>Listado de Clientes</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Listado de Clientes registrados en BD</h1>
	<table border="2" align="center">
		<tr>	
			<td>Descripcion</td>
			<td>Estado</td>
			<td>Precio compra</td>
			<td>Precio venta</td>
			<td>Nombre</td>
		</tr>
	
	<%
	List<TblProductocl3> listadoprod=(List<TblProductocl3>)request.getAttribute("listadoprodcl3");

		//Condicion
		if(listadoprod != null){
			//Bucle
			for(TblProductocl3 lis:listadoprod){
				%>
				<tr>
					<td><%=lis.getDescripcl3()%></td>
				
					<td><%=lis.getEstadocl3() %></td>
				
					<td><%=lis.getPreciocompcl3() %></td>
				
					<td><%=lis.getPrecioventacl3()%></td>
				
					<td><%=lis.getNombrecl3() %></td>
					
					<td><a href="ServletProductocl3?accion=Modificar&cod=<%=lis.getIsproductoscl3()%>">Actualizar</a></td>
					<td><a href="ServletProductocl3?accion=Eliminar&cod=<%=lis.getIsproductoscl3()%>">Eliminar</a></td>
					
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