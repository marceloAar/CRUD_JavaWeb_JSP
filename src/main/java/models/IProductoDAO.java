package models;

import java.util.List;

public interface IProductoDAO {
	
	public void create(Producto p);
	public Producto readOne(int id);
	public List<Producto> readAll();
	public void update(Producto p);
	public void deleteById(int id);
	

}
