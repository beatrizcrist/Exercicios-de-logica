package faccat;

import java.util.Scanner;

public class Exercicio62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alunos, soma = 0, notas;
		double media = 0.0;
		
		System.out.println("Digite a quantidade de alunos da turma");
		alunos = sc.nextInt();
		
		for (int i = 1; i <= alunos; i++) {
			System.out.printf("Digite o %d° número\n", i);
	    	notas = sc.nextInt();
	    	
	    	soma += notas;
	    	media = soma / alunos;
	   }
		
		System.out.println("A media de todas as notas dos alunos é: "+media);
		
		sc.close();
	}
}
