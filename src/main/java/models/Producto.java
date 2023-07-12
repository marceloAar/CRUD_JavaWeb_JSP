package models;

public class Producto {
	
	private int id; 
	private String codigo; 
	private String nombre;  	
	private int precio; 
	private int stock;
	
	public Producto() {
		super();
	}

	public Producto(int id, String codigo, String nombre, int precio, int stock) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock="
				+ stock + "]";
	} 
	
}	
