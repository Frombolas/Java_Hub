package model;

import java.util.Objects;

public abstract class Funcionario {
    protected String cpf;
    protected String nome;

    public Funcionario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }
}
