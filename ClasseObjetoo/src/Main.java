import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Coleta da quantidade de numeros do jogo
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome a quantidade de numeros por jogo (6 a 20): ");
        int numeroJogo = scan.nextInt();

        //Amostra dos preços
        amostraPreco(numeroJogo);

        //Verificação se a quantidade de numeros é valida
        if(numeroJogo >= 6 && numeroJogo <= 20) {
            realizeJogo(numeroJogo);
        }else{
            System.out.println("Numero invalido!");
        }
    }


    public static void amostraPreco(int num){
        switch (num){
            case 6:
                System.out.println("O preço é 5,00 Reais! ");
                break;
            case 7:
                System.out.println("O preço é 35,00 Reais!");
                break;
            case 8:
                System.out.println("O preço é 140,00 Reais!");
                break;
            case 9:
                System.out.println("O preço é 420,00 Reais!");
                break;
            case 10:
                System.out.println("O preço é 1050,00 Reais!");
                break;
        }
    }
    public static void realizeJogo(int numeroJogo){
        Jogo mega = new Jogo(numeroJogo);
        Scanner scanNum = new Scanner(System.in);

        //Inserindo os numeros no jogo
        for (int k = 0; k < numeroJogo; k++) {

            System.out.println("Insira um numero de 1 até 60: ");
            int num1 = scanNum.nextInt();
            //Verificação numero por numero se nao viola nenhuma regra
            if (num1 >= 1 && num1 <= 60) {
                mega.setNumero(num1);
            }else{
                System.out.println("Numero invalido!");
            }
        }

        //Retornando o jogo completo
        int jogoFeito[] = mega.getJogo();
        Arrays.sort(jogoFeito);

        System.out.println("Jogo cadastrado com sucesso: " + Arrays.toString(jogoFeito));
    }
}