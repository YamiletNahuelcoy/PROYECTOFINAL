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

import cl.awakelab.finalmod5.modelo.Profesional;
import cl.awakelab.finalmod5.modelo.Usuario;
import cl.awakelab.finalmod5.servicio.ProfesionalServicio;
import cl.awakelab.finalmod5.servicio.UsuarioServicio;





@Controller
public class ProfesionalController {
	
	@Autowired
	ProfesionalServicio profes;
	@Autowired
	UsuarioServicio usercli;
	
	private static final Logger logger = LoggerFactory.getLogger(ProfesionalController.class);
	
	
	@RequestMapping(value="/editarProfesional/{iduser}", method = RequestMethod.GET)
	public String editarProfesional(Model model, @PathVariable int iduser) {
		Usuario user = usercli.obtenerUsuarioPorId(iduser);
		Profesional prof= profes.obtenerProfesionalPorId(iduser);
		logger.info("Entro a la edición del profesional");
		model.addAttribute("us", user);
		model.addAttribute("pr", prof);
		return "FormEditarProfesional";
	}
	
	@RequestMapping(value="/ProfesionalEditado", method = RequestMethod.POST)
	public String editarProfesionalProcesar(Model model, 
			@RequestParam ("txtiduser") int usuario_idusuario,
			@RequestParam ("txtidprof") int idProfesional,
			@RequestParam ("txtrutprof") String ProfRun,
			@RequestParam ("txtnomprof") String ProfNombres,
			@RequestParam ("txtapeprof") String ProfApellidos,
			@RequestParam ("txttelprof") String ProfTelefono,
			@RequestParam ("txttitulo") String ProfTitulo,
			@RequestParam ("txtproyecto") String ProfProyecto) {
		
		logger.info("Proceso la edición del Profesional");
		Profesional prof = new Profesional(usuario_idusuario, idProfesional, ProfRun, ProfNombres, ProfApellidos, ProfTelefono, ProfTitulo, ProfProyecto);
		boolean result = profes.editarProfesional(prof);
		String mensaje = "";
		
		if (result) {
			mensaje = "El Profesional fue editado sin inconvenientes";
			logger.info("Se editó el Profesional");
		}
		else {
			mensaje = "Ocurrió un error al momento de editar";
			logger.error("Falló la editación del Profesional");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}	

}
