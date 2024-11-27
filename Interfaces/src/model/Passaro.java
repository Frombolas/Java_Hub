package model;

public class Passaro implements Planavel {
    private String especie;
    private String cor;

    public Passaro(String especie, String cor) {
        this.especie = especie;
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void voar(){
        System.out.println(Planavel.Teste);
        System.out.println("Bater asas");
    }
}

