package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Profesional;


public interface ProfesionalServicio {
	
	public List<Profesional> obtenerProfesional();
	
	public boolean editarProfesional(Profesional prof);
	public Profesional obtenerProfesionalPorId(int usuario_idusuario);

}
