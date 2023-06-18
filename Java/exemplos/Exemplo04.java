package exemplos;

import java.util.Scanner;

public class Exemplo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro número");
		int numero2 = sc.nextInt();
		
		int divisao = numero1 / numero2;
		
		System.out.printf("A divisão de %d e %d é %d", numero1, numero2, divisao);
		
		sc.close();
	}
}
