package faccat;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoAtual, anoNascimento, idade;
		
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = sc.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = sc.nextInt();
		
		idade = anoAtual - anoNascimento;
		System.out.println("Você tem "+idade+" anos!");
		
		if (idade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você ainda não pode votar!");
		}
		
		sc.close();
	}
}
