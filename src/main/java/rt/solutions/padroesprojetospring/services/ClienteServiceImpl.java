package rt.solutions.padroesprojetospring.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rt.solutions.padroesprojetospring.model.Cliente;
import rt.solutions.padroesprojetospring.model.Endereco;
import rt.solutions.padroesprojetospring.repositorio.ClienteRepositorio;
import rt.solutions.padroesprojetospring.repositorio.EnderecoRepositorio;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepositorio clienteRepository;
	@Autowired
	private EnderecoRepositorio enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}
	@Override
	public Cliente buscarPorId(Long id) { 
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);

	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> buscarCliente = clienteRepository.findById(id);
		if(buscarCliente.isPresent()) {
			salvarClienteComCep(cliente);
		}

	}

	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();

		Endereco endereco = enderecoRepository.findById(cep).orElseGet(
			() -> {
				Endereco novoEndereco = viaCepService.consultarCep(cep);
				enderecoRepository.save(novoEndereco);
				return novoEndereco;
			});

		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);

	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	
	}


}