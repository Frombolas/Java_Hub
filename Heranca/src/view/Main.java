package view;
import model.Funcionario;
import model.Comissionado;
import model.Horista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Horista("333-333-333-03", "Paula" , 50, 90);
        Funcionario funcionario2 = new Horista("333-333-333-03", "Paula" , 50, 90);

        System.out.println(funcionario);
        System.out.println(funcionario.hashCode());
        System.out.println(funcionario2.hashCode());

        System.out.println(funcionario.equals(funcionario2));



    }
}