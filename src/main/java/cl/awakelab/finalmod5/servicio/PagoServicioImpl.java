package cl.awakelab.finalmod5.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.awakelab.finalmod5.modelo.Pago;
import cl.awakelab.finalmod5.modelo.PagoRepositorio;

@Service
public class PagoServicioImpl implements PagoServicio {
	
@Autowired
PagoRepositorio pr;

	@Override
	public List<Pago> obtenerPagos() {
		return (List<Pago>)pr.findAll();
		
	}
	
}
