package cl.awakelab.finalmod5.servicio;

import java.util.List;
import cl.awakelab.finalmod5.modelo.Pago;


public interface PagoServicio {

public List<Pago> obtenerPagos();

public boolean crearPago(Pago pa);
	
}
