package faccat;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite um valor");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		valor2 = sc.nextInt();
		
		if (valor1 < valor2) {
			System.out.printf("Os valores digitados em ordem crescente: %d, %d", valor1, valor2);
		} else {
			System.out.printf("Os valores digitados em ordem crescente: %d, %d", valor2, valor1);
		}
		
		sc.close();
	}
}
