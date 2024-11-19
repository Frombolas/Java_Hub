import java.time.LocalDate;

public class Usuario {
    private String nome;
    private final String cpf;
    private LocalDate dataNascimento;



    public Usuario(String nome, String cpf, LocalDate dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

}


