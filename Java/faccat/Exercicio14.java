package faccat;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Insira um valor:");
		numero = sc.nextInt();
		
		if(numero < 10) {
			System.out.println("O valor digitado é menor que 10");
		} else {
			System.out.println("O valor digitado é maior que 10");
		}
		
		sc.close();
	}
}
