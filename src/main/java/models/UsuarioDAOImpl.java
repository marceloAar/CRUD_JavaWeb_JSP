package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.Conexion;

public class UsuarioDAOImpl implements IUsuarioDAO{
	
	private Connection cn = null;
	
	@Override
	public void create(Usuario u) {

		String sql = "INSERT INTO usuario (rut, nombre, edad, email, pass) VALUES (?,?,?,?,?);";
		
		try {
			cn = Conexion.getConn();
			PreparedStatement ppStm = cn.prepareStatement(sql);
			ppStm.setString(1, u.getRut());
			ppStm.setString(2, u.getNombre());
			ppStm.setInt(3, u.getEdad());
			ppStm.setString(4, u.getEmail());	
			ppStm.setString(5, u.getPass());			
			
			if(!ppStm.execute()) {
				System.out.println("Usuario Creado");
			}else {
				System.out.println("Registro de usuario fallo");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}	

	

	@Override
	public Usuario valida(String usuario, String clave) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		String sql = "SELECT * FROM usuario WHERE nombre = ? AND pass = ?;";
		
		try {
			cn = Conexion.getConn();
			PreparedStatement ppStm = cn.prepareStatement(sql);
			ResultSet rs;
			ppStm.setString(1, usuario);
			ppStm.setString(2, clave);
			rs = ppStm.executeQuery();
			
			while(rs.next()) {
				user.setNombre(rs.getString("nombre"));
				user.setPass(rs.getString("pass"));
			}
			
			
		} catch (Exception e) {
			System.out.println("Usuario no validado!!");
		}
		
		return user;
		
	}

}
