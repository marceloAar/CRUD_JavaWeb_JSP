package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Usuario;
import models.UsuarioDAOImpl;

import java.io.IOException;


public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegistrarUsuario() {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/vistas/registrarUsuario.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAOImpl usersDAO = new UsuarioDAOImpl();	
		Usuario user = new Usuario();
		
		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		user.setRut(rut);
		user.setNombre(nombre);
		user.setEdad(edad);
		user.setEmail(email);
		user.setPass(pass);
		
		usersDAO.create(user);
		
		String mensajeUsuarioCreado = "Nuevo usuario creado correctamente !!";
		request.setAttribute("mensajeUsuarioCreado", mensajeUsuarioCreado);
		
		
		getServletContext().getRequestDispatcher("/vistas/index.jsp").forward(request, response);	
		
	}

}
