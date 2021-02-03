package cl.awakelab.finalmod5.controlador;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.finalmod5.modelo.Usuario;
import cl.awakelab.finalmod5.servicio.UsuarioServicio;

//controlador usuario
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
	
	@RequestMapping(value="/crearUsuario", method = RequestMethod.GET)
	public String crearUsuario(Model model) {
		logger.info("Ingresó a la creación de usuarios");
		return "FormCrearUsuario";
	}
	
	@RequestMapping(value="/procesausuario", method = RequestMethod.POST)
	public String procesarcrearusuario(Model model, 
			@RequestParam ("txtid") int idUsuario,
			@RequestParam ("txtrut") String Userrun,
			@RequestParam ("txtnombre") String Usernombre,
			@RequestParam ("txtapellidos") String Userapellidos,
			@RequestParam ("txtfnac") Date UserFechaNacimiento,
			@RequestParam ("txttipouser") String UserTipo,
			@RequestParam ("txtlogin") String Login,
			@RequestParam ("password") String Clave) {
		
		logger.info("Procesó a crear un Usuario");
		Usuario us = new Usuario(idUsuario, Userrun, Usernombre, Userapellidos, UserFechaNacimiento, UserTipo, Login, Clave);
		boolean result = uss.creaUsuario(us);
		String mensaje = "";
		
		if (result) {
			mensaje = "El Usuario fue creada sin inconvenientes";
			logger.info("Se creó el Usuario");
		}
		else {
			mensaje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Fallo al crear el Usuario");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}

	
}
