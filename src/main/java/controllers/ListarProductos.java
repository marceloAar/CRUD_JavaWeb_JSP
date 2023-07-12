package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Producto;
import models.ProductoDAOImpl;

import java.io.IOException;
import java.util.List;


public class ListarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListarProductos() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductoDAOImpl productos = new ProductoDAOImpl();		
		
		List<Producto> listaProductos = productos.readAll();
		HttpSession sesion = request.getSession();
		request.setAttribute("productos", listaProductos);			
				
		request.setAttribute("usuarioSesion", sesion.getAttribute("user"));	
		
		getServletContext().getRequestDispatcher("/vistas/listarProductos.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
