package faccat;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3, soma;
		
		System.out.println("Digite o primeiro valor:");
		valor1 =  sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 =  sc.nextInt();
		
		System.out.println("Digite o ultimo valor:");
		valor3 =  sc.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			if(valor2 > valor3) {
				soma = valor1 + valor2;
				System.out.printf("A soma de %d com %d é %d", valor1, valor2, soma);
			} else {
				soma = valor1 + valor3;
				System.out.printf("A soma de %d com %d é %d", valor1, valor3, soma);
			}
		} else if(valor2 > valor1 && valor2 > valor3) {
			if(valor1 > valor3) {
				soma = valor2 + valor1;
				System.out.printf("A soma de %d com %d é %d", valor2, valor1, soma);
			} else {
				soma = valor2 + valor3;
				System.out.printf("A soma de %d com %d é %d", valor2, valor3, soma);
			}
		} else {
			if(valor1 > valor2) {
				soma = valor3 + valor1;
				System.out.printf("A soma de %d com %d é %d", valor3, valor1, soma);
			} else {
				soma = valor3 + valor2;
				System.out.printf("A soma de %d com %d é %d", valor3, valor2, soma);
			}
		}
		
		sc.close();
	}
}
