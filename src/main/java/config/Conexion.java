package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static Connection conn = null;
	
	String driverMySQL = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/productos";
	String user = "root";
	String pass = "12345678";
	
	private Conexion() {
		
		try {
			Class.forName(driverMySQL);
			
			conn = DriverManager.getConnection(url, user, pass);
			
			if (conn != null) {
				System.out.println("Conexion exitosa");
			} else {
				System.out.println("Conexion fallida");
			}
		
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}
	
	
	public static Connection getConn() {
		
		if (conn == null) {
			new Conexion();
		}		
		return conn;
	}		

}
