package model;

public class Comissionado extends Funcionario{
    protected int vendas;
    protected double comissao;

    public Comissionado(String cpf, String nome, int vendas, double comissao) {
        super(cpf, nome);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return vendas * comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
