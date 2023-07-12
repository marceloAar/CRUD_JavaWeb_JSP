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
  
  </head>
  <body style="background-color: SlateGrey;">  

	<div class="container d-flex justify-content-center align-items-center mt-2">	
		
		<div class="card col-md-8">
			<div class="card-header">
			<h3>Registro de Usuario</h3></div>
			<div class="card-body">
				<form action="RegistrarUsuario" method="POST">

					<div class="form-group">
						<label for="rut">Rut:</label> 
						<input type="text" class="form-control mb-3" name="rut" placeholder="Ingrese Rut">
					</div>

					<div class="form-group">
						<label for="nombre">Nombre:</label> 
						<input type="text" class="form-control mb-3" name="nombre" placeholder="Ingrese Nombre">
					</div>

					<div class="form-group">
						<label for="edad">Edad:</label> 
						<input type="text" class="form-control mb-3" name="edad" placeholder="Ingrese Edad">
					</div>

					<div class="form-group">
						<label for="email">E-Mail:</label> 
						<input type="text" class="form-control mb-3" name="email" placeholder="Ingrese E-Mail">
					</div>

					<div class="form-group">
						<label for="pass">Password:</label> 
						<input type="password" class="form-control mb-3" name="pass" placeholder="Ingrese Password">
					</div>
					
					<div class="text-end">
						<button type="submit" class="btn btn-primary">Crear	Usuario</button>
						<a href="Inicio" class="btn btn-dark ml-3">Cancelar</a>
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