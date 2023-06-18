package faccat;

import java.util.Scanner;

public class Exercicio73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int habitantes = 0, filhos = 0, media = 0, mediaFilhos = 0, salario = 1, maior = 0, soma1 = 0, soma2 = 0, salarioBaixo = 0;
		
		while(salario > 0){
			System.out.println("Digite o seu salário");
	        salario = sc.nextInt();
	        System.out.println("Digite o número de filhos que você tem");
	        filhos = sc.nextInt();

	        habitantes++;

	        soma1 = soma1+salario;
	        media = soma1/habitantes;

	        soma2 = soma2+filhos;
	        mediaFilhos = soma2/habitantes;

	        if(salario > maior){
	            maior = salario;
	        }

	        if(salario < 150){
	            salarioBaixo++;
	        }
	        
	    }
		
	    System.out.println("Média do salário da população: "+media);
	    System.out.println("Média do número de filhos: "+mediaFilhos);
	    System.out.println("Maior salário da população: "+maior);
	    System.out.println("Quantidade de pessoas com salário menor que R$ 150,00: "+salarioBaixo);
	    
	    sc.close();
	}
}
