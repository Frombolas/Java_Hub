package model;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Venda {

    private Item itens[];
    private LocalDateTime dataHora;
    private int quantidadeItens;

    public Venda() {
        itens = new Item[3];
        this.dataHora = LocalDateTime.now();
        quantidadeItens = 0;
    }

    public LocalDateTime getData() {
        return dataHora;
    }

    public void setData(LocalDateTime data) {
        this.dataHora = data;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public double getTotal(){
        double total = 0;

        for(int k = 0; k < quantidadeItens; k++){
            total += itens[k].getSubTotal();
        }
        return total;
    }

    public boolean addItem(Item item){
        if(quantidadeItens == itens.length){
            itens = Arrays.copyOf(itens, itens.length + 3);
        }
        itens[quantidadeItens++] = item;
        return true;
    }

    public Item[] getItens() {
        return Arrays.copyOf(itens, quantidadeItens);
    }
}
