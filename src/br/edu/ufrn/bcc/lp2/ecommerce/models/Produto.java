package br.edu.ufrn.bcc.lp2.ecommerce.models;

import java.time.LocalDateTime;

import br.edu.ufrn.bcc.lp2.ecommerce.utils.GsonUtil;

public class Produto {

    private long id;
    private String codigo;
    private String descricao;
    private double valorUnitario;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Produto(String codigo, String descricao, double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    // public void setCodigo(String codigo) {
    // this.codigo = codigo;
    // }

    public String getDescricao() {
        return descricao;
    }

    // public void setDescricao(String descricao) {
    // this.descricao = descricao;
    // }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

}
