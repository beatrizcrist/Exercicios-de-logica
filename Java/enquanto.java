// Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura while).

import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor1, valor2;
        double divisao;

        System.out.println("Digite o primeiro valor:");
        valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = ler.nextInt();

        while (valor2 == 0){
            System.out.println("VALOR INVÁLIDO");
            System.out.println("Digite o segundo valor:");
            valor2 = ler.nextInt();
        }

        divisao = (double) valor1 / (double) valor2;

        System.out.printf("A divisão de %d por %d é %.1f", valor1, valor2, divisao);

    }
}
