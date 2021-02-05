package cl.awakelab.finalmod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.finalmod5.modelo.Chequeo;
import cl.awakelab.finalmod5.modelo.ChequeoRepositorio;


@Service
public class ChequeoServicioImpl implements ChequeoServicio {

	
	@Autowired
	ChequeoRepositorio chr;
	
	@Override
	public List<Chequeo> obtenerChequeo() {
		return (List<Chequeo>) chr.findAll();
	}

	@Override
	public boolean creaChequeo(Chequeo chs) {
		chr.save(chs);
		return true;

	}

}
