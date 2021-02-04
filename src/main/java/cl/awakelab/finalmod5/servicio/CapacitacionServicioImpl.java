package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Capacitacion;
import cl.awakelab.finalmod5.modelo.CapacitacionRepositorio;


@Service
public class CapacitacionServicioImpl implements CapacitacionServicio{

	@Autowired
	CapacitacionRepositorio cr;
	
	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		return (List<Capacitacion>) cr.findAll();
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		cr.save(cap);
		return true;
	}

}
