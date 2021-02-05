package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.finalmod5.modelo.Chequeo;
import cl.awakelab.finalmod5.servicio.ChequeoServicio;



@Controller
public class ChequeoController {

	@Autowired
	ChequeoServicio ches;
	private static final Logger logger = LoggerFactory.getLogger(ChequeoController.class);
	
	@RequestMapping(value="/Checklist", method = RequestMethod.GET)
	public String MostrarChequeo(Model model) {
		
		logger.info("Ingreso al Checklist");
		List<Chequeo> checklist = ches.obtenerChequeo();
		model.addAttribute("verchecklist", checklist);
		logger.info("Ya mostré el checklist");
		
		return "ResponderChecklist";
	}
	
	/*
	 * @RequestMapping(value="/responderChequeo", method = RequestMethod.GET) public
	 * String responderChequeo(Model model) {
	 * logger.info("Ingresó a responder cheqcklist"); return "ResponderChecklist"; }
	 */
	
	@RequestMapping(value="/procesachecklist", method = RequestMethod.POST)
	public String procesarchequeo(Model model, 
			@RequestParam ("txtid") int idchequeo,
			@RequestParam ("chek9") String cheqnombre) {
		
		logger.info("Procesó Checklist");
		Chequeo chs = new Chequeo(idchequeo, cheqnombre);
		boolean result = ches.creaChequeo(chs);
		String mensaje = "";
		
		if (result) {
			mensaje = "El Checklist fue procesado sin inconvenientes";
			logger.info("Checklist respondido");
		}
		else {
			mensaje = "Ocurrió un error al momento de procesar el Checklist";
			logger.error("Fallo al procesar Checklist");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}

	
}
