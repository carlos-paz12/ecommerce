package br.edu.ufrn.bcc.lp2.ecommerce;

import java.time.LocalDate;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Cliente;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Compra;
import br.edu.ufrn.bcc.lp2.ecommerce.models.PagamentoCartao;
import br.edu.ufrn.bcc.lp2.ecommerce.models.PagamentoPix;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Pedido;
import br.edu.ufrn.bcc.lp2.ecommerce.models.Produto;
import br.edu.ufrn.bcc.lp2.ecommerce.services.ClienteServico;
import br.edu.ufrn.bcc.lp2.ecommerce.services.CompraServico;
import br.edu.ufrn.bcc.lp2.ecommerce.services.PedidoServico;
import br.edu.ufrn.bcc.lp2.ecommerce.services.ProdutoServico;

public class Main {

    public static void main(String[] args) {

        ClienteServico clienteServico = new ClienteServico();

        Cliente cliente1 = clienteServico.cadastrar("cpf1", "nome1", "celular1", "email1", LocalDate.now(), "senha1");
        Cliente cliente2 = clienteServico.cadastrar("cpf2", "nome2", "celular2", "email2", LocalDate.now(), "senha2");
        Cliente cliente3 = clienteServico.cadastrar("cpf3", "nome3", "celular3", "email3", LocalDate.now(), "senha3");

        ProdutoServico produtoServico = new ProdutoServico();

        Produto produto1 = produtoServico.cadastrar("codigo1", "descricao1", 1.0);
        Produto produto2 = produtoServico.cadastrar("codigo2", "descricao2", 2.0);
        Produto produto3 = produtoServico.cadastrar("codigo3", "descricao3", 3.0);

        PedidoServico pedidoServico = new PedidoServico();

        Pedido pedido1 = pedidoServico.cadastrar(cliente1.getId(), produto1);
        Pedido pedido2 = pedidoServico.cadastrar(cliente2.getId(), produto2);
        Pedido pedido3 = pedidoServico.cadastrar(cliente3.getId(), produto3);

        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2, 3);
        pedido1.adicionarProduto(produto3, 2);

        pedido2.adicionarProduto(produto3);

        pedido3.adicionarProduto(produto1, 5);
        pedido3.adicionarProduto(produto3, 3);

        CompraServico compraServico = new CompraServico();

        Compra compra1 = pedidoServico.finalizarPedido(pedido1, new PagamentoPix());
        Compra compra2 = pedidoServico.finalizarPedido(pedido2, new PagamentoPix());
        Compra compra3 = pedidoServico.finalizarPedido(pedido2, new PagamentoCartao());

        compraServico.processarCompra(compra1);
        compraServico.cancelarCompra(compra2);
        compraServico.processarCompra(compra3);

    }

}
