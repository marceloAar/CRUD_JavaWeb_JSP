package models;

public class Usuario {
	
	private int id; 
	private String rut; 
	private String nombre; 
	private int edad; 
	private String email; 
	private String pass;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String rut, String nombre, int edad, String email, String pass) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email
				+ ", pass=" + pass + "]";
	}	

}