package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Producto;
import models.ProductoDAOImpl;

import java.io.IOException;


public class EditarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditarProducto() {
        super();       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ProductoDAOImpl prods = new ProductoDAOImpl();
		int id =  Integer.parseInt(request.getParameter("id"));		
		Producto productoEncontrado = prods.readOne(id);
				
		request.setAttribute("producto", productoEncontrado);
		
		HttpSession sesion = request.getSession();
		request.setAttribute("usuarioSesion", sesion.getAttribute("user"));	
		
		getServletContext().getRequestDispatcher("/vistas/editarProducto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ProductoDAOImpl prods = new ProductoDAOImpl();
		
		int id =  Integer.parseInt(request.getParameter("id"));	
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		int precio = Integer.parseInt(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		Producto productoEncontrado = prods.readOne(id);
		productoEncontrado.setCodigo(codigo);
		productoEncontrado.setNombre(nombre);
		productoEncontrado.setPrecio(precio);
		productoEncontrado.setStock(stock);
				
		prods.update(productoEncontrado);				
		
		request.getRequestDispatcher("ListarProductos").forward(request, response);	
	}

}
