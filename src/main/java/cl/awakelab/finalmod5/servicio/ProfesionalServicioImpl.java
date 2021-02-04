package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Profesional;
import cl.awakelab.finalmod5.modelo.ProfesionalRepositorio;




@Service
public class ProfesionalServicioImpl implements ProfesionalServicio {

	@Autowired
	ProfesionalRepositorio pror;
	
	@Override
	public List<Profesional> obtenerProfesional() {
		
		return (List<Profesional>) pror.findAll();
	}

	@Override
	public boolean editarProfesional(Profesional pr) {
		pror.save(pr);
		return true;
	}

	@Override
	public Profesional obtenerProfesionalPorId(int usuario_idusuario) {
		return pror.findOne(usuario_idusuario);
	}

	
	

}
