package rt.solutions.padroesprojetospring.repositorio;

import org.springframework.data.repository.CrudRepository;

import rt.solutions.padroesprojetospring.model.Endereco;

public interface EnderecoRepositorio extends CrudRepository<Endereco, String> {
    
}
