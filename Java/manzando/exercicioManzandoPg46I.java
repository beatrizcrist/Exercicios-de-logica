package manzando;

import java.util.Scanner;

public class exercicioManzandoPg46I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 1, soma = 0, media = 0;
		
		while(contador <= 10) {
			System.out.printf("Digite o %d� n�mero\n", contador);
			int valores = sc.nextInt();
			soma += valores;
			media = soma / contador ;
			contador++;
		}
		
		System.out.printf("A soma dos valores digitados � %d \nA m�dia aritim�tica dos valores � %d",soma, media);
		
		sc.close();
	}
}
