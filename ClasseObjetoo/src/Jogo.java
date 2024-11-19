public class Jogo {
    private int jogo[];
    private int numerosAdicionados = 0;
    private int tamanho;

    public Jogo(int tamanho){
        this.tamanho = tamanho;
        jogo = new int[tamanho];
    }

    public void setNumero(int num){
        if(numerosAdicionados >= 1){
            for(int i = 0; i < tamanho; i++){
                if (jogo[i] == num){
                    System.out.println("Jogo inválido, numeros repetidos! ");
                    System.exit(0);
                }
            }
        }
        jogo[numerosAdicionados++] = num;
    }

    public int[] getJogo(){
        return jogo;
    }
}
