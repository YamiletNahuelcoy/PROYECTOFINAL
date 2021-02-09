package cl.awakelab.finalmod5.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContactoController {

	
	private static final Logger logger = LoggerFactory.getLogger(ContactoController.class);
	
	@RequestMapping(value = "/Contacto", method = RequestMethod.GET)
	public String FormContacto(Model model) {
		logger.info("Muestra formulario de contacto");
		return "FormContacto";
	}
	
	@RequestMapping(value="/recibiendocontacto", method = RequestMethod.POST)
	public String procesarcrearcontacto(Model model, 
			@RequestParam ("nombre") String nombre,
			@RequestParam ("correo") String correo,
			@RequestParam ("telefono") String telefono,
			@RequestParam ("mensaje") String mensaje) {
		logger.info("muestra los datos");
		System.out.println("Nombre:" + " "+ nombre);
		System.out.println("Correo:" + " "+ correo);
		System.out.println("Teléfono:" + " "+ telefono);
		System.out.println("Mensaje:" + " "+ mensaje);
				
		
		return "FormSesionCliente";
	}
}
