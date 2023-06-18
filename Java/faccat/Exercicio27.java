package faccat;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor:");
		valor =  sc.nextInt();
		
		if (valor == 0) {
			System.out.println("O valor digitado foi 0");
		} else if(valor > 0) {
			System.out.println("O valor digitado é positivo");
		} else {
			System.out.println("O valor digitado é negativo");
		}
		
		sc.close();
	}
}
