package cl.awakelab.finalmod5.servicio;


import cl.awakelab.finalmod5.modelo.Cliente;


public interface ClienteServicio {
	
	public boolean editarCliente(Cliente clie);
	public Cliente obtenerClientePorId(int cliente_idusuario);

}
