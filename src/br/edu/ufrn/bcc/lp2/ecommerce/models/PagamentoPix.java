package br.edu.ufrn.bcc.lp2.ecommerce.models;

public class PagamentoPix extends FormaPagamento {

    public PagamentoPix() {
        super("PIX");
    }

    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$%.2f efetuada com sucesso no PIX.\n", valor);
    }

    @Override
    public double calcularFrete(double subtotal) {
        return subtotal <= 20.0 ? 2.0 : 0.0;
    }

}
