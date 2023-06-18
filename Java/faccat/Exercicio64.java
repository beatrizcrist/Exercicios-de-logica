package faccat;

import java.util.Scanner;

public class Exercicio64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valores;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d° número\n", i);
			valores = sc.nextInt();
			
			if(valores < 40) {
				soma += valores;
			}
		}
		
		System.out.println("A soma dos números inferiores a 40 é "+soma);
		
		sc.close();
	}
}
