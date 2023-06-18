package faccat;

import java.util.Scanner;

public class Exercicio54 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		
		while(valor <= 0) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.println("Digite um valor");
			valor = sc.nextInt();
		}
		
		for (int i = 1; i <= valor; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
