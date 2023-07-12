<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Bienvenidos</title>     
    
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet" 
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous"/>

    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" />    
  
  	
  </head>
  <body style="background-color: SlateGrey;"> 
  	
  	<div class="text-center">
  		<div style="color:green;">${ mensajeUsuarioCreado }</div> 
  	</div>  	
  				 	 
  	<div class="container text-center justify-content-center mt-5">
  		
  		<div class="row">
		<div class="col-6">
			<h1 class="display-1">Bienvenidos<strong><span style="color: blue;">/</span></strong></h1>
		</div>
		
		<div class="col-6">		
			
			 <form action="Inicio" method="POST" class="form-control">
			 
			 	<h2 class="display-2 text-info mb-5">Login</h2>
			 	
			 	<img src="https://www.padelboadilla.com/ranking/img/login.jpg" 
			 		alt="Imagen Login" width="100px" height="100px">
                  
                  <div class="form-group">                     
                     <input type="text" class="form-control mb-3" 
                     	placeholder="Nombre de Usuario" name="usuario">
                  </div>
                  
                  <div class="form-group">                    
                     <input type="password" class="form-control mb-3" 
                     	placeholder="Password" name="clave">
                  </div>    
                  
                  <div style="color:red;">${ mensajeError }</div>              
                  
                  <button type="submit" class="btn btn-success mb-3 mt-3">Ingresar</button>                 
                  <div class="register">
                        <p>No tienes una cuenta? <a href="RegistrarUsuario">Registrate!</a></p>
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