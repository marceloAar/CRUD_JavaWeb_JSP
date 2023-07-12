<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Modificar Producto</title>    
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous" />

    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" />
  
  </head>
  <body style="background-color: SlateGrey;">  
  	 <%@ include file="navbar.jsp" %>   
  	 
  	 <h6>Usuario: ${ usuarioSesion }</h6> 	 
  	 
  	 <div class="container d-flex justify-content-center align-items-center mt-2">	
		
		<div class="card col-md-8 mt-3">
			<div class="card-header">
				<h3>Modificar Producto</h3>
			</div>
			
			<div class="card-body">
				<form action="EditarProducto" method="POST">
				
					<input name="id" type="hidden" value="${ producto.id }">

					<div class="form-group">
						<label for="codigo">Codigo:</label> 
						<input type="text" class="form-control" name="codigo"
							value= "${ producto.codigo }" />
					</div>

					<div class="form-group">
						<label for="nombre">Nombre:</label> 
						<input type="text" class="form-control" name="nombre"
							value= "${ producto.nombre }" />
					</div>

					<div class="form-group">
						<label for="precio">Precio:</label> 
						<input type="text" class="form-control" name="precio"
							value= "${ producto.precio }" />
					</div>

					<div class="form-group mb-5">
						<label for="stock">Stock:</label> 
						<input type="text" class="form-control" name="stock"
							value= "${ producto.stock }" />
					</div>
					
					<div class="text-end mt-2">
					<button type="submit" class="btn btn-primary">Actualizar</button>
					<a href="ListarProductos" class="btn btn-dark ml-3">Cancelar</a>
					</div>
				</form>

			</div>
									
			</div>
		</div>
  		
  		<%@ include file="footer.jsp" %> 
  	
	<script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
      crossorigin="anonymous">
	</script>
  </body>
</html>