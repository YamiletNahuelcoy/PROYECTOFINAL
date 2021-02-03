package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Visita;
import cl.awakelab.finalmod5.modelo.VisitaRepositorio;

@Service
public class VisitaServicioImpl implements VisitaServicio {

	
	@Autowired
	VisitaRepositorio vr;
	
	@Override
	public List<Visita> obtenerVisitas() {
		return (List<Visita>) vr.findAll();
	}

}
