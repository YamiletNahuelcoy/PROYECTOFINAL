package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Cliente;
import cl.awakelab.finalmod5.modelo.ClienteRepositorio;



@Service
public class ClienteServicioImpl implements ClienteServicio {

	@Autowired
	ClienteRepositorio clir;
	
	@Override
	public List<Cliente> obtenerCliente() {
		
		return (List<Cliente>) clir.findAll();
	}

}
