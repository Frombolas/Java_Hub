package model;

public class Quadrado implements AreaCalculavel{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        System.out.println(Math.pow(lado, 2));
    }
}
