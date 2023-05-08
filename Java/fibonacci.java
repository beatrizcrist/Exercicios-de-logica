//mostra a sequencia de fubonacci ate o 15° termo

public class fibonacci {
    public static void main(String[] args) {
        int contador = 1, numeroAtual = 1, numeroAntecessor = 0, soma = 0;

        System.out.println("1");
        while(contador < 15){
            soma = numeroAtual + numeroAntecessor;
            System.out.printf("%d%n",soma);
            numeroAntecessor = numeroAtual;
            numeroAtual = soma;
            contador++;
        }
    }
}
