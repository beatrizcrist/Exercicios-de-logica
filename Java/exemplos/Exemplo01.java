package exemplos;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		/*int numero1 = 0;
		int numero2 = 0;
		numero1 = 10;
		numero2 = 20;
		int soma = numero1 + numero2;
		System.out.println(soma);*/
		
		Scanner ler =  new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Equipe 04 PROA");
		
		System.out.println("Numero 1");
		num1 = ler.nextInt(); 
		
		System.out.println("Numero 2");
		num2 = ler.nextInt(); 
		
		System.out.println(num1 + num2);
		
		ler.close();
	}
}
