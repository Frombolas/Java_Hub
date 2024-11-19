package view;

import model.Categoria;
import model.Item;
import model.Produto;
import model.Venda;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
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