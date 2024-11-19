package model;

public class Item {
    private Produto produto;
    private int id;
    private double Quantidade;


    public Item(int id, double Quantidade, Produto produto) {
        this.id = id;
        this.produto = produto;
        this.Quantidade = Quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getId() {
        return id;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double getSubTotal(){
        return produto.preco * Quantidade;
    }
}
