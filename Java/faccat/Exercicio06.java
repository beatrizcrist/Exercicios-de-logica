package faccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int area = 0, base = 0,altura = 0;

        System.out.println("Digite a medida da base do ret�ngulo:");
        base = ler.nextInt();
        System.out.println("Digite a altura do ret�ngulo:");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("A �rea do ret�ngulo �: %d",area);
        ler.close();
	}
}
