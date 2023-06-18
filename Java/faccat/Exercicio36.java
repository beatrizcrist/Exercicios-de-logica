package faccat;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeMulher1, idadeMulher2, idadeHomem1, idadeHomem2, soma, produto;
		idadeMulher1 = idadeMulher2 = idadeHomem1 = idadeHomem2 = soma = produto = 0;
		
		System.out.println("Digite a idade da primeira mulher");
		idadeMulher1 = sc.nextInt();
		System.out.println("Digite a idade da segunda mulher");
		idadeMulher2 = sc.nextInt();
		
		System.out.println("Digite a idade do primeiro homem");
		idadeHomem1 = sc.nextInt();
		System.out.println("Digite a idade do segundo homem");
		idadeHomem2 = sc.nextInt();

		if(idadeHomem1 > idadeHomem2){
			if(idadeMulher1 < idadeMulher2){
			   soma = idadeHomem1 + idadeMulher1;
			   produto = idadeHomem2 * idadeMulher2;
		} else{
			 soma = idadeHomem1 + idadeMulher2;
			 produto = idadeHomem2 * idadeMulher1;
			 }

		} else{

		if(idadeMulher1< idadeMulher2){
			 soma = idadeHomem2 + idadeMulher2;
			 produto = idadeHomem1 * idadeMulher1;
		} else{
			 soma = idadeHomem2 + idadeMulher2;
			 produto = idadeHomem1 * idadeMulher1;
			 }

		}

		System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é: %d \n", soma);
		System.out.printf("O produto das idades do homem mais novo com a mulher mais velha é: %d", produto);
		
		sc.close();
	}
}
