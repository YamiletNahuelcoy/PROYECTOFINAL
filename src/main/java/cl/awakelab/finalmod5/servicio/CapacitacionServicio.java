package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Capacitacion;


public interface CapacitacionServicio {
	
	public List<Capacitacion> obtenerCapacitaciones();
	
	public boolean crearCapacitacion(Capacitacion cap);

}
