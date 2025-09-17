package br.edu.ufrn.bcc.lp2.ecommerce.services;

import java.time.LocalDate;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Cliente;
import br.edu.ufrn.bcc.lp2.ecommerce.repositories.ClienteRepositorio;

public class ClienteServico {

    public Cliente cadastrar(String cpf, String nome, String celular, String email, LocalDate dataNascimento, String senha) {
        return ClienteRepositorio.getInstancia().salvar(new Cliente(cpf, nome, celular, email, dataNascimento, senha));
    }

}
