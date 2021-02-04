package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.finalmod5.modelo.Capacitacion;
import cl.awakelab.finalmod5.modelo.Cliente;
import cl.awakelab.finalmod5.servicio.CapacitacionServicio;
import cl.awakelab.finalmod5.servicio.ClienteServicio;


@RestController
public class ServicioControlador {
	
	@Autowired
	ClienteServicio cli;
	@Autowired
	CapacitacionServicio capser;
	
	
	@RequestMapping(value = "/caplist", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCapacitacion(@RequestBody Capacitacion Capacitacion) {
	capser.crearCapacitacion(Capacitacion);
	}

	
	@RequestMapping(value = "/caplist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Capacitacion> getCapacitaciones() {
	List<Capacitacion> listacapacitaciones =  capser.obtenerCapacitaciones();
	return listacapacitaciones;
	}


}
