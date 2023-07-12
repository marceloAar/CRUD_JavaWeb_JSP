package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Producto;
import models.ProductoDAOImpl;

import java.io.IOException;

public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CrearProducto() {
        super();       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		request.setAttribute("usuarioSesion", sesion.getAttribute("user"));	
		getServletContext().getRequestDispatcher("/vistas/crearProducto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductoDAOImpl productos = new ProductoDAOImpl();	
		Producto p = new Producto();
		
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		int precio = Integer.parseInt(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		p.setCodigo(codigo);
		p.setNombre(nombre);
		p.setPrecio(precio);
		p.setStock(stock);
		
		productos.create(p);
		
		request.getRequestDispatcher("ListarProductos").forward(request, response);	
		
	}

}
