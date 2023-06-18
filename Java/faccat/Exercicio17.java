package faccat;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, media;
		
		System.out.println("Digite a primeira nota");
		nota1 = sc.nextInt();
		
		System.out.println("Digite a outra nota");
		nota2 = sc.nextInt();
		
		media = (nota1 + nota2) / 2;
		System.out.println("A média das notas digitadas é "+media);
		
		if (media >= 6) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		sc.close();
	}
}
