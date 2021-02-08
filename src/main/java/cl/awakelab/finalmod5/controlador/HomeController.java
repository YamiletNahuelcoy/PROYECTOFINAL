package cl.awakelab.finalmod5.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicio(Model model) {
		logger.info("Bienvenido!!!");		
	return "Index";
	}
	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("Dentro del login");
        return "login";
    }
   
    @RequestMapping("/ValidarSesion")
    public String validarsesion(Model model,
    		@RequestParam ("username") String nombre    		
    		) {
    	
    	if(nombre.equalsIgnoreCase("fernando")) {
    		
    		logger.info("Entra al perfil del cliente");
    		return "FormSesionCliente";    		
    		
    	}else if (nombre.equalsIgnoreCase("daniela")) {
    		
    		return "FormSesionAdministrativo";  
    	}
    	else if (nombre.equalsIgnoreCase("juanpablo")){    		
    		return "FormSesionProfesional"; 
    	}else {
    		
    		 model.addAttribute("error", "true");
           return "login";
    		
    	}
    	
    }
       
    @RequestMapping("/logout")
    public String logout()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "redirect:/login?logout"; 
    }

	
}
