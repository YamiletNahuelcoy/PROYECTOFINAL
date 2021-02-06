package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Administrativo;


public interface AdministrativoServicio {
	
	public List<Administrativo> obtenerAdministrativo();
	public boolean editarAdministrativo(Administrativo admin);
	public Administrativo obtenerAdminPorId(int admin_idusuario);

}
