package cl.awakelab.finalmod5.controlador;

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
import cl.awakelab.finalmod5.modelo.Usuario;
import cl.awakelab.finalmod5.servicio.ClienteServicio;
import cl.awakelab.finalmod5.servicio.UsuarioServicio;

@Controller
public class ClienteController {

	
	@Autowired
	ClienteServicio clis;
	@Autowired
	UsuarioServicio usercli;
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
		
	@RequestMapping(value="/editarCliente/{iduser}", method = RequestMethod.GET)
	public String editarCliente(Model model, @PathVariable int iduser) {
		Usuario user = usercli.obtenerUsuarioPorId(iduser);
		Cliente cli = clis.obtenerClientePorId(iduser);
		logger.info("Entro a la edición del cliente");
		model.addAttribute("us", user);
		model.addAttribute("cl", cli);
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
		
		logger.info("Proceso la edición de clientes");
		Cliente c = new Cliente( usuario_idusuario,RutCliente, clienombres, cliapellidos,clitelefono,cliafp, clisistemasalud, clidireccion, clicomuna, CliEdad);
		boolean result = clis.editarCliente(c);
		String mensaje = "";
		
		if (result) {
			mensaje = "El cliente fue editado sin inconvenientes";
			logger.info("Se editó el cliente");
		}
		else {
			mensaje = "Ocurrió un error al momento de ejecutar la edición";
			logger.error("Fallo al editar el cliente");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}
	
	
	
}


