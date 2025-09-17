package br.edu.ufrn.bcc.lp2.ecommerce.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Pedido;

public class PedidoRepositorio {

    private static PedidoRepositorio instancia;

    private PedidoRepositorio() {
        pedidos = new ArrayList<>();
    }

    public static PedidoRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new PedidoRepositorio();
        }
        return instancia;
    }

    private List<Pedido> pedidos;
    private static long pedidosIDs = 1;

    public Pedido salvar(Pedido pedido) {
        pedido.setId(pedidosIDs++);
        pedido.setCriadoEm(LocalDateTime.now());
        pedido.setAtualizadoEm(LocalDateTime.now());
        pedidos.add(pedido);
        return pedido;
    }

    public Pedido buscarPeloId(long id) {
        for (Pedido cliente : pedidos) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Pedido> buscarTodos() {
        return new ArrayList<>(pedidos);
    }

}
