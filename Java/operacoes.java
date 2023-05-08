import java.util.Scanner;

public class operacoes {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);

        int valor1 = 0, valor2 = 0, soma=0, multiplicacao=0, subtracao = 0;
        double divisao = 0;
        System.out.println("Digite um valor:");
        valor1 = ler.nextInt();
        System.out.println("Digite outro valor:");
        valor2 = ler.nextInt();

        soma = valor1 + valor2;
        multiplicacao = valor1 * valor2;
        subtracao = valor1 - valor2;
        divisao = ((double) valor1 / (double) valor2);

        System.out.printf("A soma dos valores %d e %d é: %d %n",valor1,valor2, soma);
        System.out.printf("A multiplicação dos valores %d e %d é: %d %n",valor1,valor2, multiplicacao);
        System.out.printf("A subtração dos valores %d e %d é: %d %n",valor1,valor2, subtracao);
        System.out.printf("A divisão dos valores %d e %d é: %.1f",valor1,valor2, divisao);
    }
}
