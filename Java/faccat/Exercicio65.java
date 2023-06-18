package faccat;

import java.util.Scanner;

public class Exercicio65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma = 0;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = sc.nextInt();
		
		for (int i = valor1; i <= valor2; i++) {
			soma += i;
		}
		
		System.out.printf("A soma dos números existentes entre %d e %d é: %d", valor1, valor2, soma);
		
		sc.close();
	}
}
