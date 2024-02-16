package rt.solutions.padroesprojetospring.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rt.solutions.padroesprojetospring.model.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
    
}
