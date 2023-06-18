package faccat;

import java.util.Scanner;

public class Exercicio66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma = 0;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = sc.nextInt();
		
		if(valor2 < valor1){
	        for(int contador = valor2; contador <= valor1; contador++){
	            soma += contador;
	        }
	    } else{
	        for(int contador = valor1; contador <= valor2; contador++){
	            soma += contador;
	        }
	    }
		
		System.out.printf("A soma dos números existentes entre %d e %d é: %d", valor1, valor2, soma);
		
		sc.close();
	}
}
