package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Cliente;


public interface ClienteServicio {
	
	public List<Cliente> obtenerCliente();
	
	public boolean editarCliente(Cliente clie);
	public Cliente obtenerClientePorId(int cliente_idusuario);

}
