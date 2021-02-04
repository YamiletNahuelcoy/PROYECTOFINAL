package cl.awakelab.finalmod5.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Cliente;
import cl.awakelab.finalmod5.modelo.ClienteRepositorio;


@Service
public class ClienteServicioImpl implements ClienteServicio {

	@Autowired
	ClienteRepositorio clir;
	
	
	@Override
	public boolean editarCliente(Cliente clie) {
		clir.save(clie);
		return true;
	}

	@Override
	public Cliente obtenerClientePorId(int cliente_idusuario) {
		return clir.findOne(cliente_idusuario);
	}

	
	

}
