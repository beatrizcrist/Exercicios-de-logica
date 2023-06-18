package faccat;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, maior = -1;
        double media = 0;

        for (int contador = 1; contador <= 15; contador++) {
            System.out.println("Digite o c�digo do produto");
            int codigo = sc.nextInt();
            System.out.println("Digite o pre�o do produto");
            int preco = sc.nextInt();

            if (preco > maior) {
                maior = preco;
            }

            soma += preco;
            media = (double) soma / contador;
        }

        System.out.println("O maior pre�o digitado foi: " + maior);
        System.out.println("A m�dia dos pre�os digitados foi: " + media);

        sc.close();
    }
}
