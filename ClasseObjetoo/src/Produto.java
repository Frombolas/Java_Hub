import java.time.LocalDate;

public class Produto {
    private String descricao;
    private String marca;
    private double preco;
    private double quantia;
    private LocalDate dataValidade;


    public Produto(String descricao, String marca, double preco, double quantia, LocalDate dataValidade){
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
        this.quantia = quantia;
        this.dataValidade = dataValidade;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getQuantia(){
        return quantia;
    }

    public void setQuantia(double quantia){
        this.quantia = quantia;
    }

    public LocalDate getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }

}
