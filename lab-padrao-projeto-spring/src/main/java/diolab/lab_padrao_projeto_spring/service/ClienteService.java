package diolab.lab_padrao_projeto_spring.service;

import diolab.lab_padrao_projeto_spring.model.Cliente;
import org.springframework.stereotype.Component;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
