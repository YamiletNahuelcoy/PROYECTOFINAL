package cl.awakelab.finalmod5.servicio;

import cl.awakelab.finalmod5.modelo.Administrativo;

public interface AdministrativoServicio {
	
	public boolean editarAdministrativo(Administrativo admin);
	public Administrativo obtenerAdminPorId(int admin_idusuario);

}
