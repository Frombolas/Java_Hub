package view;
import model.*;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel Quadrado = new Quadrado(5.2);
        AreaCalculavel Circulo = new Circulo(5.2);
        AreaCalculavel Retangulo = new Retangulo(4.8, 8.2);

        Quadrado.calcularArea();
        Circulo.calcularArea();
        Retangulo.calcularArea();
    }
}