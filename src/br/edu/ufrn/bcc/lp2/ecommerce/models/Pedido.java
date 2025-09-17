package br.edu.ufrn.bcc.lp2.ecommerce.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufrn.bcc.lp2.ecommerce.utils.GsonUtil;

public class Pedido {

    private long id;
    private long clienteId;
    private List<Produto> produtos;
    private boolean finalizado;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Pedido(long clienteId, Produto primeiroProduto) {
        this.clienteId = clienteId;
        produtos = new ArrayList<>();
        produtos.add(primeiroProduto);
        finalizado = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClienteId() {
        return clienteId;
    }

    // public void setClienteId(long clienteId) {
    // this.clienteId = clienteId;
    // }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // public void setProdutos(List<Produto> produtos) {
    // this.produtos = produtos;
    // }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            produtos.add(produto);
        }
    }

    @Override
    public String toString() {
        return GsonUtil.getGson().toJson(this);
    }

}
