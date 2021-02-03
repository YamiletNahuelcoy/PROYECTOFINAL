package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.finalmod5.modelo.Pago;
import cl.awakelab.finalmod5.servicio.PagoServicio;



@Controller
public class PagoController {
	
@Autowired
PagoServicio ps;

	private static final Logger logger = LoggerFactory.getLogger(PagoController.class);
	
	@RequestMapping(value="/listaPagos", method = RequestMethod.GET)
	public String ListarPagos(Model model) {
		
		logger.info("Ingreso al listado de Pagos");
		List<Pago> listapagos = ps.obtenerPagos();
		model.addAttribute("listapag", listapagos);
		logger.info("Ya mostré los pagos");
		
		return "formListarPagos";
	}	
}
