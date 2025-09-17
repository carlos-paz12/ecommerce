package br.edu.ufrn.bcc.lp2.ecommerce.services;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Compra;
import br.edu.ufrn.bcc.lp2.ecommerce.models.FormaPagamento;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Pedido;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Produto;
import br.edu.ufrn.bcc.lp2.ecommerce.repositories.CompraRepositorio;
import br.edu.ufrn.bcc.lp2.ecommerce.repositories.PedidoRepositorio;

public class PedidoServico {

    public Pedido cadastrar(long clienteId, Produto primeiroProduto) {
        return PedidoRepositorio.getInstancia().salvar(new Pedido(clienteId, primeiroProduto));
    }

    public Compra finalizarPedido(Pedido pedido, FormaPagamento pagamento) {
        pedido.setFinalizado(true);
        return CompraRepositorio.getInstancia().salvar(new Compra(pedido, pagamento));
    }

}
