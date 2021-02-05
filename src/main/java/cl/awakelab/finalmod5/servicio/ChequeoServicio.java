package cl.awakelab.finalmod5.servicio;

import java.util.List;

import cl.awakelab.finalmod5.modelo.Chequeo;


public interface ChequeoServicio {
	
	public List<Chequeo> obtenerChequeo();
	
	public boolean creaChequeo(Chequeo chs);

}
