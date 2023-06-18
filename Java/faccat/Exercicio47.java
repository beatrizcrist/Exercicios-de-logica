package faccat;

import java.util.Scanner;

public class Exercicio47 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double valor1, valor2 = 0, divisao;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = sc.nextInt();
		
		if(valor2 == 0) {
			while(valor2 == 0){
					System.out.println("VALOR INVÁLIDO!");
					System.out.println("Digite o segundo valor");
					valor2 = sc.nextInt();
			}
		}

		divisao = valor1 / valor2;		
		System.out.printf("A divisão de %.2f por %.2f é %.2f", valor1, valor2, divisao);	    
			    
		sc.close();    
	}
}
