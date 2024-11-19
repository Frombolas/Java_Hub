public class contaCorrente {

    private final int agencia;
    private final int conta;
    private Usuario titular;
    private float saldo;

    public contaCorrente(int agencia, int conta, Usuario titular, float saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta(){
        return conta;
    }

    public String getTitular(){
        return titular.getNome();
    }
    public void setTitular(Usuario titular){
        this.titular = titular;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public void sacar(float valor){
        if(saldo > 0 && valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saldo atual: " + saldo);
        }else if( valor <= 0){
            System.out.println("Valor incompativel para saque!");
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }
}
