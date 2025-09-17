package br.edu.ufrn.bcc.lp2.ecommerce.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufrn.bcc.lp2.ecommerce.models.Compra;

public class CompraRepositorio {

    private static CompraRepositorio instancia;

    private CompraRepositorio() {
        compras = new ArrayList<>();
    }

    public static CompraRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new CompraRepositorio();
        }
        return instancia;
    }

    private List<Compra> compras;
    private static long comprasIDs = 1;

    public Compra salvar(Compra compra) {
        compra.setId(comprasIDs++);
        compra.setCriadoEm(LocalDateTime.now());
        compra.setAtualizadoEm(LocalDateTime.now());
        compras.add(compra);
        return compra;
    }

    public Compra buscarPeloId(long id) {
        for (Compra cliente : compras) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Compra> buscarTodos() {
        return new ArrayList<>(compras);
    }

}
