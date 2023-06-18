package faccat;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, maior = -1;
        double media = 0;

        for (int contador = 1; contador <= 15; contador++) {
            System.out.println("Digite o código do produto");
            int codigo = sc.nextInt();
            System.out.println("Digite o preço do produto");
            int preco = sc.nextInt();

            if (preco > maior) {
                maior = preco;
            }

            soma += preco;
            media = (double) soma / contador;
        }

        System.out.println("O maior preço digitado foi: " + maior);
        System.out.println("A média dos preços digitados foi: " + media);

        sc.close();
    }
}
