package br.edu.ufrn.bcc.lp2.ecommerce.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Produto;

public class ProdutoRepositorio {

    private static ProdutoRepositorio instancia;

    private ProdutoRepositorio() {
        produtos = new ArrayList<>();
    }

    public static ProdutoRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new ProdutoRepositorio();
        }
        return instancia;
    }

    private List<Produto> produtos;
    private static long produtosIDs = 1;

    public Produto salvar(Produto produto) {
        produto.setId(produtosIDs++);
        produto.setCriadoEm(LocalDateTime.now());
        produto.setAtualizadoEm(LocalDateTime.now());
        produtos.add(produto);
        return produto;
    }

    public Produto buscarPeloId(long id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarPeloCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (codigo.equals(produto.getCodigo())) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> buscarTodos() {
        return new ArrayList<>(produtos);
    }

}
