package model;

public class Produto {
    private int codigo;
    private String descricao;
    double preco;
    private Categoria categoria;

    public Produto(int codigo, String descricao, double preco, Categoria categoria){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
