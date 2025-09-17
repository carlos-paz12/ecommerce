package br.edu.ufrn.bcc.lp2.ecommerce.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Cliente;

public class ClienteRepositorio {

    private static ClienteRepositorio instancia;

    private ClienteRepositorio() {
        clientes = new ArrayList<>();
    }

    public static ClienteRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new ClienteRepositorio();
        }
        return instancia;
    }

    private List<Cliente> clientes;
    private static long clientesIDs = 1;

    public Cliente salvar(Cliente cliente) {
        cliente.setId(clientesIDs++);
        cliente.setCriadoEm(LocalDateTime.now());
        cliente.setAtualizadoEm(LocalDateTime.now());
        clientes.add(cliente);
        return cliente;
    }

    public Cliente buscarPeloId(long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarPeloCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cpf.equals(cliente.getCpf())) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> buscarTodos() {
        return new ArrayList<>(clientes);
    }

}
