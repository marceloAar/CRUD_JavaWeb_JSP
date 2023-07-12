package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.ProductoDAOImpl;

import java.io.IOException;


public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EliminarProducto() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		ProductoDAOImpl productos = new ProductoDAOImpl();	
		
		productos.deleteById(id);
		
		String mensajeUsuarioEliminado = "Producto " +id+ " eliminado de la Base de Datos!!";
		request.setAttribute("mensajeUsuarioEliminado", mensajeUsuarioEliminado);
		
		request.getRequestDispatcher("ListarProductos").forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
