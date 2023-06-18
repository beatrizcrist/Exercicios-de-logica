package faccat;

import java.util.Scanner;

public class Exercicio63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valores;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d° número\n", i);
			valores = sc.nextInt();
			
			soma += valores;
		}
		
		System.out.println("A soma dos 10 números lidos é "+soma);
		
		sc.close();
	}
}
