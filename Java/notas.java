// Escreva  um  algoritmo  para  ler  as  notas  da  1a.  e  2a.  avaliações  de um  aluno,  calcule  e  imprima  a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota1, nota2, soma;
        double media;
        String novo = "S";

        while (novo.equals("S")) {
            System.out.println("Digite a primeira nota:");
            nota1 = ler.nextInt();
            System.out.println("Digite a segunda nota:");
            nota2 = ler.nextInt();

            while (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
                System.out.println("DIGITE APENAS NÚMEROS DE 0 ATE 10!");
                System.out.println("Digite a primeira nota:");
                nota1 = ler.nextInt();
                System.out.println("Digite a segunda nota:");
                nota2 = ler.nextInt();
            }

            soma = nota1 + nota2;
            media = (double) soma / 2;

            System.out.printf("A média das notas é %.1f%n", media);
            ler.nextLine();
            System.out.println("NOVO CÁLCULO (S/N)?'");
            novo = ler.nextLine();
        }

    }
}
