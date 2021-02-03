package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Usuario;



public interface UsuarioServicio {
	
	public List<Usuario> obtenerUsuarios();
	
	public boolean creaUsuario(Usuario us);

}
