package faccat;

import java.util.Scanner;

public class Exercicio46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2, divisao;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
	    valor2 = sc.nextInt();
	    
	    if(valor2 == 0) {
	    	do{
	    		System.out.println("VALOR INV�LIDO!");
			    System.out.println("Digite o segundo valor");
			    valor2 = sc.nextInt();
			}while(valor2 == 0);
	    }

		divisao = valor1 / valor2;	    
			    
		System.out.printf("A divis�o de %.2f por %.2f � %.2f", valor1, valor2, divisao);	    
			    
		sc.close();	
		}
}
