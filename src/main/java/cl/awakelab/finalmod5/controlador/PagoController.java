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
		logger.info("Ya mostr� los pagos");
		
		return "formListarPagos";
	}	 
	
	@RequestMapping(value="/CrearPago", method = RequestMethod.GET)
	public String crearPagos(Model model) {
		logger.info("Ingreso a la creaci�n de capacitaciones");
		return "formCrearPago";
	}
	
	@RequestMapping(value="/procesaPagos", method = RequestMethod.POST)
	public String procesarCrearPagos(Model model, 
			@RequestParam ("idpago") int idPago,
			@RequestParam ("txtfecha") Date pagoFecha,
			@RequestParam ("txtmonto") int pagoMonto, 
			@RequestParam ("txtmes") String pagoMes,
			@RequestParam ("txta�o") int pagoA�o,
			@RequestParam ("rutcliente") String cliente_rutcliente) {
		
		logger.info("Proceso crear pago");
		Pago pa = new Pago(idPago, pagoFecha, pagoMonto, pagoMes, pagoA�o, cliente_rutcliente);
		boolean result = ps.crearPago(pa);
		String mensaje = "";
		
		if (result) {
			mensaje = "El Pago fue creado sin inconvenientes";
			logger.info("Se cre� la capacitaci�n");
		}
		else {
			mensaje = "Ocurri� un error al momento de ejecutar la creaci�n";
			logger.error("Fallo al crear la capacitaci�n");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}	
	
	
}
