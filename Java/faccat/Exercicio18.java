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
		System.out.println("Voc� tem "+idade+" anos!");
		
		if (idade >= 16) {
			System.out.println("Voc� pode votar!");
		} else {
			System.out.println("Voc� ainda n�o pode votar!");
		}
		
		sc.close();
	}
}
