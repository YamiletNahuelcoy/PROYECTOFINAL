package cl.awakelab.finalmod5.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepositorio extends CrudRepository <Pago, Integer>  {

}
