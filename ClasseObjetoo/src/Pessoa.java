import java.time.LocalDate;

public class Pessoa {

    //Encapsulamento
    private String nome;
    /*cpf é uma constante
    - não precisa fazer o set
    - Precisa inicializar no construtor
    */

    private static int contPessoa; //referente a classe pessoa
    private int id;  //referente ao objeto pessoa

    private final String cpf;
    private String estadoCivil;
    private float renda;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String estadoCivil, float renda, LocalDate dataNascimento) {
        this.id = ++contPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.renda = renda;
        this.dataNascimento = dataNascimento;
    }

    //Sobrecarga de operador (Quando se tem mais de um operador)
    public Pessoa(String nome, String cpf){
        this.id = ++contPessoa;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId(){
        return id;
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

    public String getEstadoCivil(){
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public float getRenda(){
        return renda;
    }
    public void setRenda(float renda){
        this.renda = renda;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }


}
