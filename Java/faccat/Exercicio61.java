package faccat;

import java.util.Scanner;

public class Exercicio61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valores; 
		double media = 0.0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d° número\n", i);
	    	valores = sc.nextInt();
	    	
	    	soma += valores;
	    	media = soma / i;
		}
		
		System.out.println("Média aritimética dos valores: "+media);
		
		sc.close();
	}
}
