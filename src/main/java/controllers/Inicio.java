package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Usuario;
import models.UsuarioDAOImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import config.Conexion;

public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Inicio() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {			
			Connection cn = Conexion.getConn();
			
			if(cn.isValid(1)) {
				System.out.println("Conexion establecida");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/vistas/index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");	
		
		UsuarioDAOImpl users = new UsuarioDAOImpl();
				
		Usuario usuarioEncontrado = users.valida(usuario, clave);		
		
		if( usuarioEncontrado.getNombre() != null) {
			HttpSession sesion = request.getSession();			
			sesion.setAttribute("user", usuario);			
			request.setAttribute("usuarioSesion", sesion.getAttribute("user"));	
			
			request.getRequestDispatcher("ListarProductos").forward(request, response);	
		}else {
			String mensajeError = "Usuario y/o contraseña incorrecta...";
			request.setAttribute("mensajeError", mensajeError);
			
			request.getRequestDispatcher("/vistas/index.jsp").forward(request, response);
		}	
				
	}

}
