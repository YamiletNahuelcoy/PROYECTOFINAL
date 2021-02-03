package cl.awakelab.finalmod5.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.finalmod5.modelo.Usuario;
import cl.awakelab.finalmod5.servicio.UsuarioServicio;


@Controller
public class UsuarioController {

	@Autowired
	UsuarioServicio uss;
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@RequestMapping(value="/listaUsuarios", method = RequestMethod.GET)
	public String ListarUsuarios(Model model) {
		
		logger.info("Ingreso al listado de usuarios");
		List<Usuario> listausuarios = uss.obtenerUsuarios();
		model.addAttribute("listauser", listausuarios);
		logger.info("Ya mostré los usuarios");
		
		return "FormListaUsuarios";
	}
	
}
