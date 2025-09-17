package br.edu.ufrn.bcc.lp2.ecommerce.models;

import java.time.LocalDateTime;

import br.edu.ufrn.bcc.lp2.ecommerce.utils.GsonUtil;

public class Compra {

    private long id;
    private Pedido pedido;
    private FormaPagamento formaPagamento;
    private StatusCompra statusCompra;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Compra(Pedido pedido, FormaPagamento formaPagamento) {
        this.pedido = pedido;
        this.formaPagamento = formaPagamento;
        this.statusCompra = StatusCompra.ABERTA;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    // public void setPedido(Pedido pedido) {
    // this.pedido = pedido;
    // }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusCompra getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(StatusCompra statusCompra) {
        this.statusCompra = statusCompra;
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

    @Override
    public String toString() {
        return GsonUtil.getGson().toJson(this);
    }

}
