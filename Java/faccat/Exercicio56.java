package faccat;

import java.util.Scanner;

public class Exercicio56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		
		while(valor < 0 || valor > 10) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.println("Digite um valor");
			valor = sc.nextInt();
		}
		
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", valor, i, valor * i);
		}
		
		sc.close();
	}
}
