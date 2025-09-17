package br.edu.ufrn.bcc.lp2.ecommerce.services;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Compra;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Produto;
import br.edu.ufrn.bcc.lp2.ecommerce.models.StatusCompra;

public class CompraServico {

    public void processarCompra(Compra compra) {
        double total = calcularTotal(compra);
        compra.getFormaPagamento().processar(total);
        compra.setStatusCompra(StatusCompra.EFETUADA);
        System.out.printf("Compra no valor de %.2f realizada!\n", total);
        System.out.println(compra.toString());
    }

    public void cancelarCompra(Compra compra) {
        double total = calcularTotal(compra);
        compra.setStatusCompra(StatusCompra.CANCELADA);
        System.out.printf("Compra no valor de %.2f cancelada...\n", total);
    }

    public double calcularSubtotal(Compra compra) {
        return compra.getPedido().getProdutos().stream().mapToDouble(Produto::getValorUnitario).sum();
    }

    public double calcularFrete(Compra compra) {
        double subtotal = calcularSubtotal(compra);
        double frete = compra.getFormaPagamento().calcularFrete(subtotal);
        return frete;
    }

    public double calcularTotal(Compra compra) {
        double subtotal = calcularSubtotal(compra);
        double frete = calcularFrete(compra);
        return subtotal + frete;
    }
}
