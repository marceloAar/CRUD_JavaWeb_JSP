<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<nav
      class="navbar navbar-expand-lg navbar-dark"
      style="background-color: black">
      <div class="container-fluid justify-content-between mx-3">
                
        <button
          class="navbar-toggler position-absolute end-0"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNavAltMarkup"
          aria-controls="navbarNavAltMarkup"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav container justify-content-center">            
            
            <a class="nav-link" href="CrearProducto">Agregar Producto</a>                      
            <a class="nav-link" href="ListarProductos">Listar Productos</a>  
            
          </div>
        </div>
        <div>	            	
        
        <a class="navbar-brand" href="Logout">        	      	
        	Cerrar Sesion <i class="bi bi-box-arrow-right fs-3 contactIcons"></i>
        </a>
        
        </div>
      </div>
</nav> 
