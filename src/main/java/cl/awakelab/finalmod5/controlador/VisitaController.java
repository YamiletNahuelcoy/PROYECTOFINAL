package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.finalmod5.modelo.Visita;
import cl.awakelab.finalmod5.servicio.VisitaServicio;

@Controller
public class VisitaController {

	@Autowired
	VisitaServicio vs;
	private static final Logger logger = LoggerFactory.getLogger(VisitaController.class);
	
	@RequestMapping(value="/listaVisitas", method = RequestMethod.GET)
	public String ListarVisitass(Model model) {
		
		logger.info("Ingreso al listado de visitas");
		List<Visita> listavisitas = vs.obtenerVisitas();
		model.addAttribute("listavis", listavisitas);
		logger.info("Ya mostré las visitas");
		
		return "FormListaVisitas";
	}
	
}
