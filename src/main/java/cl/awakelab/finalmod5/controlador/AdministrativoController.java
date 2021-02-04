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

import cl.awakelab.finalmod5.modelo.Administrativo;
import cl.awakelab.finalmod5.servicio.AdministrativoServicio;

@Controller
public class AdministrativoController {

	@Autowired
	AdministrativoServicio admser;
	
	private static final Logger logger = LoggerFactory.getLogger(AdministrativoController.class);
	
	
	@RequestMapping(value="/editarAdministrativo/{iduser}", method = RequestMethod.GET)
	public String editarAdministrativo(Model model, @PathVariable int iduser) {
		Administrativo admin = admser.obtenerAdminPorId(iduser);
		logger.info("Entro a la edición del administrativo");
		model.addAttribute("ad", admin);
		return "FormEditarAdministrativo";
	}

	@RequestMapping(value="/procesaeditar", method = RequestMethod.POST)
	public String editarAdminProcesar(Model model,
		@RequestParam ("txtiduseradmin") int usuario_idusuario,
		@RequestParam ("txtidadmin") int idadministrativo,
		@RequestParam ("txtrutadmin") String AdminRun,
		@RequestParam ("txtnomadmin") String AdmiNombres,
		@RequestParam ("txtapeadmin") String AdminApellidos,
		@RequestParam ("txtemailadmin") String AdminCorreo,
		@RequestParam ("txtarea") String AdminArea			

		) {
		
		logger.info("Proceso la edición de clientes");
		Administrativo ad = new Administrativo( usuario_idusuario,idadministrativo, AdminRun, AdmiNombres,AdminApellidos,AdminCorreo, AdminArea);
		boolean result = admser.editarAdministrativo(ad);
		String mensaje = "";
		
		if (result) {
			mensaje = "El administrativo fue editado";
			logger.info("Se editó el usuario administrativo");
		}
		else {
			mensaje = "Ocurrió un error al momento de ejecutar la edición";
			logger.error("Fallo al editar al usuario administrativo");
		}

		model.addAttribute("mensajes", mensaje);
		return "msgcreacion";
	}
	
}
