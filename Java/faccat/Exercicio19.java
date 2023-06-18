package faccat;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite um valor");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor digitado foi: "+valor1);
		} else {
			System.out.println("O maior valor digitado foi: "+valor2);
		}
		
		sc.close();
	}
}
