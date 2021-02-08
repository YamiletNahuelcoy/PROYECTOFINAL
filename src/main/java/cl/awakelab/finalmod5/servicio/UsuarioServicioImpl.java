package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Usuario;
import cl.awakelab.finalmod5.modelo.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	
	@Autowired
	UsuarioRepositorio ur;
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		return (List<Usuario>) ur.findAll();
	}

	@Override
	public boolean creaUsuario(Usuario us) {
		ur.save(us);
		return true;

	}
	
	@Override
	public Usuario obtenerUsuarioPorId(int idusuario) {
		return ur.findOne(idusuario);
	}


	
}
