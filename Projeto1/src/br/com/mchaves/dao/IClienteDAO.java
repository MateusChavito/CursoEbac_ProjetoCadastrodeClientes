package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    boolean cadastrar(Cliente cliente);

    void excluir(Long cpf);

    void alterar(Cliente cliente);

    Cliente consultar(Long cpf);

    Collection<Cliente> buscarTodos();
}
