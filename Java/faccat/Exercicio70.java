package faccat;

import java.util.Scanner;

public class Exercicio70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero");
		int valores = sc.nextInt();
		
		int maior = valores, menor = valores;
		
		for (int i = 2; i <= 10; i++) {
			System.out.printf("Digite o %d� n�mero\n", i);
			valores = sc.nextInt();

	        if(valores > maior){
	            maior = valores;
	        } 

	        if(valores < menor){
	            menor = valores;
	        }
		}
		
		System.out.println("O maior valor digitado foi: "+maior);
		System.out.println("O menor valor digitado foi: "+menor);
		
		sc.close();
	}
}
