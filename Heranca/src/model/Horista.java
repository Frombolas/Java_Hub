package model;

public class Horista extends Funcionario{
    private double valorHora;
    private double horasTrabalhadas;

    public Horista(String cpf, String nome,double valorHora, double horasTrabalhadas){
        super(cpf, nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(){
        return valorHora * getHorasTrabalhadas();
    }
}
