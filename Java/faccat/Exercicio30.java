package faccat;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite o primeiro valor:");
		valor1 =  sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 =  sc.nextInt();
		
		System.out.println("Digite o ultimo valor:");
		valor3 =  sc.nextInt();
		
		if(valor1 < valor2 && valor1 < valor3) {
			if(valor2 < valor3) {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor1, valor2, valor3);
			} else {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor1, valor3, valor2);
			}
		} else if(valor2 < valor1 && valor2 < valor3) {
			if(valor1 < valor3) {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor2, valor1, valor3);
			} else {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor2, valor3, valor1);
			}
		} else {
			if(valor1 < valor2) {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor3, valor1, valor2);
			} else {
				System.out.printf("A ordem crescente dos numeros digitados: %d, %d, %d", valor3, valor2, valor1);
			}
		}
		
		sc.close();
	}
}
