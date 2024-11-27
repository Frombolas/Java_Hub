package model;

public class Circulo implements AreaCalculavel{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println(Math.PI * Math.pow(raio, 2));
    }
}
