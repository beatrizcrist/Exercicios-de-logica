// Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS

import java.util.Scanner;

public class negativosPositivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("Digite o %d° valor:%n", contador);
            valor = ler.nextInt();

            int negativos = 0;

            while (valor < 0) {
                negativos = +1;
            }
            
            System.out.printf("Quantidades de valores negativos digitados: %d%n", negativos);
        }

    }
}
