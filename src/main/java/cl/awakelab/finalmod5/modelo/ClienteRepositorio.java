package cl.awakelab.finalmod5.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

}
