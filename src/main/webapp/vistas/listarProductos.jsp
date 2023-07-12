<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Lista de Productos</title>    
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous" />

    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" />
      
      <link href="https://cdn.datatables.net/v/dt/dt-1.13.5/datatables.min.css" rel="stylesheet"/>
  
  </head>
  <body style="background-color: SlateGrey;">  	
  	  
	<%@ include file="navbar.jsp" %>  
  	
  	<h6>Usuario: ${ usuarioSesion }</h6>  
  	
  	<div class="text-center">
  		<div style="color:red;">${ mensajeUsuarioEliminado }</div> 
  	</div> 
  		
  	<div class="container mt-2">  
  	  	  	
	<table class="table table-sm table-active" id="tabla-prod">
		<thead style="backgoud-color: black;">
		<tr>
			<th>CODIGO</th>
			<th>NOMBRE</th>
			<th>PRECIO</th>
			<th>STOCK</th>
			<th>ACCIONES</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${ productos }" var="prod">
			<tr>
				<td>${ prod.codigo }</td>
				<td>${ prod.nombre }</td>
				<td>$ ${ prod.precio }</td>
				<td>${ prod.stock }</td>
				<td>
					<a href="EditarProducto?id=${ prod.id }"><i class="bi bi-pencil-square fs-3"></i></a> 
           		 	
           		 	<a href="EliminarProducto?id=${ prod.id }"><i class="bi bi-trash fs-3"
           		 	onclick="return confirm('Estás seguro que deseas eliminar este producto?')"></i></a>
           		</td>           		 		 
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
		
	<script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
      crossorigin="anonymous">
	</script>
	
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> 
 	<script src="https://cdn.datatables.net/v/dt/dt-1.13.5/datatables.min.js"></script>

	<script> 
 		$(document).ready(function() {
     		$('#tabla-prod').DataTable();
 		});
 	</script> 
	 	
  </body>
</html>
