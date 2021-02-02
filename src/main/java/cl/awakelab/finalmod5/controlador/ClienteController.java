package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.finalmod5.modelo.Cliente;
import cl.awakelab.finalmod5.servicio.ClienteServicio;



@Controller
public class ClienteController {

	
	@Autowired
	ClienteServicio clis;
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
	@RequestMapping(value="/listaClientes", method = RequestMethod.GET)
	public String ListarClientes(Model model) {
		
		logger.info("Ingreso al listado de clientes");
		List<Cliente> listaclientes = clis.obtenerCliente();
		model.addAttribute("lcli", listaclientes);
		logger.info("Ya mostré los clientes");
		
		return "FormListarclientes";
	}
}
