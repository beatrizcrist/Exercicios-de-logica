package faccat;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String novo = "S";
        int nota1, nota2;
        double media;

        while (novo.equals("S")) {
            System.out.println("Digite a nota da primeira avaliação:");
            nota1 = sc.nextInt();
            System.out.println("Digite a nota da segunda avaliação:");
            nota2 = sc.nextInt();

            while (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
                System.out.println("DIGITE SOMENTE VALORES VÁLIDOS, ENTRE 0 E 10!");
                System.out.println("Digite a nota da primeira avaliação:");
                nota1 = sc.nextInt();
                System.out.println("Digite a nota da segunda avaliação:");
                nota2 = sc.nextInt();
            }

            media = (nota1 + nota2) / 2;

            System.out.println("A média das notas é: " + media);
            System.out.println("Novo calculo? (S/N)");
            novo = sc.next();
        }
        
        System.out.println("Tchau Tchau");

        sc.close();
    }
}
