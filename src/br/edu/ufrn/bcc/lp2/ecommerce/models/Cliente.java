package br.edu.ufrn.bcc.lp2.ecommerce.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.ufrn.bcc.lp2.ecommerce.utils.GsonUtil;

public class Cliente {

    private long id;
    private String cpf;
    private String nome;
    private String celular;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Cliente(String cpf, String nome, String celular, String email, LocalDate dataNascimento, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    // public void setCpf(String cpf) {
    // this.cpf = cpf;
    // }

    public String getNome() {
        return nome;
    }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String numeroCelular) {
        this.celular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // public void setDataNascimento(LocalDate dataNascimento) {
    // this.dataNascimento = dataNascimento;
    // }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        Cliente other = (Cliente) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

}
