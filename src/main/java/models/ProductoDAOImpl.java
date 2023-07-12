package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;

public class ProductoDAOImpl implements IProductoDAO{
	
	private Connection cn = null;

	@Override
	public void create(Producto p) {
		
		String sql = "INSERT INTO producto (codigo, nombre, precio, stock) VALUES (?,?,?,?);";
		
		try {
			cn = Conexion.getConn();
			PreparedStatement ppStm = cn.prepareStatement(sql);
			ppStm.setString(1, p.getCodigo());
			ppStm.setString(2, p.getNombre());
			ppStm.setInt(3, p.getPrecio());
			ppStm.setInt(4, p.getStock());			
			
			if(!ppStm.execute()) {
				System.out.println("Registro Creado");
			}else {
				System.out.println("Registro fallo");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public Producto readOne(int id) {
	
		String sql = "SELECT id, codigo, nombre, precio, stock FROM producto WHERE id = "+id;
		Producto p = null;
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				p = new Producto(rs.getInt("id"),
						rs.getString("codigo"),
						rs.getString("nombre"),
						rs.getInt("precio"),
						rs.getInt("stock"));
			}
			
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;	
		
	}
	

	@Override
	public List<Producto> readAll() {
		
		String sql = "SELECT id, codigo, nombre, precio, stock FROM producto;";
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				productos.add(new Producto(rs.getInt("id"), 
						rs.getString("codigo"),
						rs.getString("nombre"),
						rs.getInt("precio"),
						rs.getInt("stock")));
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}

	@Override
	public void update(Producto p) {
		
		String sql = "UPDATE producto SET codigo= ?, nombre = ?, precio = ?, stock = ? WHERE id = ?;";
		try {
			cn=Conexion.getConn();
			
			PreparedStatement stm = cn.prepareStatement(sql);
			stm.setString(1, p.getCodigo());
			stm.setString(2, p.getNombre());
			stm.setInt(3, p.getPrecio());
			stm.setInt(4, p.getStock());
			stm.setInt(5, p.getId());
			int fila = stm.executeUpdate();
			
			if (fila > 0) {
				System.out.println("Registro Actualizado con exito");
			}else {
				System.out.println("Problema al actualizar el registro");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		
	}

	@Override
	public void deleteById(int id) {
		
		String sql = "DELETE FROM producto WHERE id =" +id;
		
		try {
			cn=Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			System.out.println("Producto id "+id+" eliminado correctamente...");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}
