package exemplos;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero");
		int numero2 = sc.nextInt();
		
		int subtracao = numero1 - numero2;
		
		System.out.printf("A subtracao de %d e %d � %d \n", numero1, numero2, subtracao);
		sc.close();
	}
	
	
}
