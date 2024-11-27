package model;

public class Aviao  implements Planavel{
    private String modelo;
    private int ano;

    public Aviao(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void voar(){
        System.out.println("Ligar motor");
    }
}
