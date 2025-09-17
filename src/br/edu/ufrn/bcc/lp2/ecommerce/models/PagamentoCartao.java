package br.edu.ufrn.bcc.lp2.ecommerce.models;

public class PagamentoCartao extends FormaPagamento {

    public PagamentoCartao() {
        super("CARTAO");
    }

    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$%.2f efetuada com sucesso no cartão.\n", valor);
    }

    @Override
    public double calcularFrete(double subtotal) {
        return subtotal * 0.2;
    }

}
