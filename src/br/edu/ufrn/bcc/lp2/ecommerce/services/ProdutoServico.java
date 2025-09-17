package br.edu.ufrn.bcc.lp2.ecommerce.services;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Produto;
import br.edu.ufrn.bcc.lp2.ecommerce.repositories.ProdutoRepositorio;

public class ProdutoServico {

    public Produto cadastrar(String codigo, String descricao, double valorUnitario) {
        return ProdutoRepositorio.getInstancia().salvar(new Produto(codigo, descricao, valorUnitario));
    }

}
