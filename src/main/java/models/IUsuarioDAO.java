package models;

public interface IUsuarioDAO {
	
	public void create(Usuario u);	
	public Usuario valida(String usuario, String clave);

}
