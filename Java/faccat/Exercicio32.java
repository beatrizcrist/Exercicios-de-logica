package faccat;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeTime1, nomeTime2;
		int golsTime1, golsTime2, pontosVantagem;
		
		System.out.println("Digite o nome do primeiro time");
		nomeTime1 = sc.nextLine();
		System.out.println("Digite o nome do segundo time");
		nomeTime2 = sc.nextLine();
		
		System.out.println("Digite a quantidade de gols que o primeiro time marcou");
		golsTime1 = sc.nextInt();
		System.out.println("Digite a quantidade de gols que o primeiro time marcou");
		golsTime2 = sc.nextInt();
		
		if(golsTime1 > golsTime2) {
			pontosVantagem = golsTime1 - golsTime2;
			System.out.printf("O time %s venceu, com %d pontos de vantagem!!!", nomeTime1, pontosVantagem);
		} else if(golsTime2 > golsTime1) {
			pontosVantagem = golsTime2 - golsTime1;
			System.out.printf("O time %s venceu, com %d pontos de vantagem!!!", nomeTime2, pontosVantagem);
		} else {
			System.out.printf("Deu empate!!!");
		}
		
		sc.close();
	}
}
