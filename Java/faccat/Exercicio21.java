package faccat;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.println("Digite o horário de início do jogo de xadrez");
		inicio = sc.nextInt();
		
		System.out.println("Digite o horário que o jogo de xadrez acabou");
		fim = sc.nextInt();
		
		if (fim <= inicio) {
			duracao = 24 - (inicio + fim);
	        System.out.printf("O jogo de xadrez durou %d horas",duracao);
		} else {
			duracao = fim - inicio;
	        System.out.printf("O jogo de xadrez durou %d horas",duracao);
		}
		
		sc.close();
	}
}
