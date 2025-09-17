package br.edu.ufrn.bcc.lp2.ecommerce.models;

public abstract class FormaPagamento {
    private final String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void processar(double valor);

    public abstract double calcularFrete(double subtotal);

}
