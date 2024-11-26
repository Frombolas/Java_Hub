package view;

import model.Categoria;
import model.Item;
import model.Produto;
import model.Venda;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        int codigoItem;
        int codigoProduto;
        String descricao;
        double preco;
        int opcao;
        double quantidade;

        do{

            Scanner scan = new Scanner(System.in);
            System.out.println("Menu de cadastro \n" +
                    "1 - Cadastrar produto \n" +
                    "2 - Realizar venda \n" +
                    "3 - Sair");
            escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("\nAdicionar o código do item: \n");
                    codigoItem = scanner.nextInt();
                    System.out.println("Adicionar o código do produto: \n");
                    codigoProduto = scanner.nextInt();
                    System.out.println("Adionar descrição do produto: \n");
                    descricao = scanner.next();
                    System.out.println("Adicionar o preço do produto: \n");
                    preco = scanner.nextDouble();
                    System.out.println("Adicionar o quantidade do produto: \n");
                    quantidade = scanner.nextInt();


                    Venda.addItem(
                            new Item(codigoItem,
                                    new Produto(codigoProduto, descricao,
                                            preco, Categoria.ALIMENTICIO),
                                    quantidade)

                case 2:

                case 3:
                    System.out.println("Saindo...");
                    break;
            }

        }while (escolha != 3);

        Produto arroz = new Produto(5, "Arroz", 5, Categoria.ALIMENTICIO);
        Produto oleo = new Produto(7, "Oleo", 7, Categoria.ALIMENTICIO);
        Item item1 = new Item(1, 4, arroz);
        Item item2 = new Item(2, 2, oleo);

        Venda venda = new Venda();
        venda.addItem(item1);
        venda.addItem(item2);

        System.out.println(arroz.getDescricao() + " - Quantidade - " + item1.getQuantidade() + " - Preço - " + item1.getSubTotal());
        System.out.println(oleo.getDescricao() + " - Quantidade - " + item2.getQuantidade() + " - Preço - " + item2.getSubTotal());
        System.out.println("Preço total da venda: " + venda.getTotal());
    }//TODO: Menu de vendas : inicializar venda -> info do produto -> Adiciona na venda -> até quando o user quiser parar
    //TODO: Imprimir o total e os itens
}