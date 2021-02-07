package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Administrativo;
import cl.awakelab.finalmod5.modelo.AdministrativoRepositorio;

@Service
public class AdministrativoServicioImpl implements AdministrativoServicio{

	@Autowired
	AdministrativoRepositorio admrep;
	
	@Override
	public boolean editarAdministrativo(Administrativo admin) {
		admrep.save(admin);
		return true;
	}

	@Override
	public Administrativo obtenerAdminPorId(int admin_idusuario) {
		return admrep.findOne(admin_idusuario);
	}

	@Override
	public List<Administrativo> obtenerAdministrativo() {
		
		return (List<Administrativo>) admrep.findAll();
	}

}
