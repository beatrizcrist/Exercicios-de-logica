package faccat;

import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = sc.nextInt();
		
		if (valor1 == valor2) {
			System.out.println("Os valores digitados s�o iguais");
		} else if(valor1 > valor2) {
			System.out.println("O primeiro valor � maior");
		} else {
			System.out.println("O segundo valor � maior");
		}
		
		sc.close();
	}
}
