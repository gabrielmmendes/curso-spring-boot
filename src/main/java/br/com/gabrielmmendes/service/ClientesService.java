package br.com.gabrielmmendes.service;

import br.com.gabrielmmendes.model.Cliente;
import br.com.gabrielmmendes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired //não precisa do @Autowired, pois o SpringFramework já entende que esse construtor é uma depêndencia
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {

    }
}
