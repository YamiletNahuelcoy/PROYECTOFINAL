package cl.awakelab.finalmod5.controlador;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.finalmod5.modelo.Capacitacion;
import cl.awakelab.finalmod5.servicio.CapacitacionServicio;


// Hola chicos!

@Controller
public class CapacitacionController {
	
	@Autowired
	CapacitacionServicio cs;
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionController.class);
	
	@RequestMapping(value="/listaCapacitaciones", method = RequestMethod.GET)
	public String ListarCapacitaciones(Model model) {
		
		logger.info("Ingreso al listado de capacitaciones");
		List<Capacitacion> listacapacitaciones = cs.obtenerCapacitaciones();
		model.addAttribute("listacap", listacapacitaciones);
		logger.info("Ya mostré las capacitaciones");
		
		return "FormListarCapacitaciones";
	}	
	
	@RequestMapping(value="/CrearCapacitacion", method = RequestMethod.GET)
	public String crearCapacitacion(Model model) {
		logger.info("Ingreso a la creación de capacitaciones");
		return "FormCrearCapacitacion";
	}
	
	@RequestMapping(value="/procesacapacitacion", method = RequestMethod.POST)
	public String procesarcrearcapacitacion(Model model, 
			@RequestParam ("txtid") int idcapacitacion,
			@RequestParam ("txtfecha") Date capfecha,
			@RequestParam ("txthora") Time caphora,
			@RequestParam ("txtlugar") String caplugar,
			@RequestParam ("txtduracion") int capduracion,
			@RequestParam ("rutcliente") String cliente_rutcliente) {
		
		logger.info("Proceso crear una capacitación");
		Capacitacion cap = new Capacitacion(idcapacitacion, capfecha, caphora, caplugar, capduracion, cliente_rutcliente);
		boolean result = cs.crearCapacitacion(cap);
		String mensaje = "";
		
		if (result) {
			mensaje = "La capacitación fue creada sin inconvenientes";
			logger.info("Se creó la capacitación");
		}
		else {
			mensaje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Fallo al crear la capacitación");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}	

}
