<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "java.util.*" %>
<%@ page import = "model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Producto</title>
</head>
<body bgcolor = "#C5DEC9">

<h1 align = "center">Registra Producto</h1>
<form method = "post" action="ControladorProducto">
		<table  align = "center">
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr style = "height: 10px"></tr>
			<tr>
				<td>Precio</td>
				<td><input type="text" name="precio"></td>
			</tr>
				<tr style = "height: 10px"></tr>
			<tr>
				<td>PrecioVen</td>
				<td><input type="text" name="precioven"></td>
			</tr>
						<tr style = "height: 10px"></tr>
			<tr>
				<td>Estado</td>
				<td><select name="estado">
						<option>Activo</option>
						<option>Inactivo</option>
				</select></td>
			</tr>
						<tr style = "height: 10px"></tr>
			<tr>
				<td>Descripcion</td>
				<td><input type="text" name="descripcion"></td>
			</tr>
						<tr style = "height: 10px"></tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="Registrar">
				</td>
			</tr>
		</table>
	</form>
	<br>
<h1 align="center"> Lista de Productos </h1>
<table align="center" border="2">
<tr>
<th>Código</th>
<th>Nombre</th>
<th>PV</th>
<th>PC</th>
<th>Est.</th>
<th>Des</th>
</tr>

<%
//Recuperamos lo que vuelve del controlador
List<TblProductocl2> lista = (List<TblProductocl2>)request.getAttribute("lista");

if (lista!= null)
{
	for(TblProductocl2 tbemp:lista)
	{
		
%>
<tr>
<td><%=tbemp.getIdproductocl2() %></td>
<td><%=tbemp.getNombrecl2() %></td>
<td><%=tbemp.getPrecioventacl2() %></td>
<td><%=tbemp.getPreciocompcl2() %></td>
<td><%=tbemp.getEstadocl2() %></td>
<td><%=tbemp.getDescripcl2() %></td>
</tr>
<%
	}
}
%>

</table>
</body>
</html>