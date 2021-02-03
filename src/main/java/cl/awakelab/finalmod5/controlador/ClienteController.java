package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		logger.info("Ya mostr� los clientes");
		
		return "FormListarclientes";
	}
	
	@RequestMapping(value="/editarCliente/{iduser}", method = RequestMethod.GET)
	public String editarCliente(Model model, @PathVariable int iduser) {
		Cliente clie = clis.obtenerClientePorId(iduser);
		logger.info("Entro a la edici�n del cliente");
		model.addAttribute("us", clie);
		return "FormEditarCliente";
	}

	@RequestMapping(value="/procesareditar", method = RequestMethod.POST)
	public String editarClientesProcesar(Model model,
		@RequestParam ("txtidclieuser") int usuario_idusuario,
		@RequestParam ("txtrutcliente") String RutCliente,
		@RequestParam ("txtnomcliente") String clienombres,
		@RequestParam ("txtapecliente") String cliapellidos,
		@RequestParam ("txttelcliente") String clitelefono,
		@RequestParam ("txtafpcliente") String cliafp,
		@RequestParam ("sisSalud") int clisistemasalud,
		@RequestParam ("txtdirecccliente") String clidireccion,
		@RequestParam ("txtcomcliente") String clicomuna,
		@RequestParam ("txtedadcliente") int CliEdad
		

		) {
		
		logger.info("Proceso la edici�n de clientes");
		Cliente c = new Cliente( usuario_idusuario,RutCliente, clienombres, cliapellidos,clitelefono,cliafp, clisistemasalud, clidireccion, clicomuna, CliEdad);
		boolean result = clis.editarCliente(c);
		String mensaje = "";
		
		if (result) {
			mensaje = "El cliente fue editado sin inconvenientes";
			logger.info("Se edit� el cliente");
		}
		else {
			mensaje = "Ocurri� un error al momento de ejecutar la edici�n";
			logger.error("Fallo al editar el cliente");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}
	
}


