package faccat;

import java.util.Scanner;

public class Exercicio71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números a serem lidos");
		int quantidade = sc.nextInt();
		
		int soma = 0, maior = 0, media, valores;
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.printf("Digite o %d° valor\n",i);
			valores = sc.nextInt();
			
			if(valores > maior){
	            maior = valores;
	        } 

	        soma += valores;
		}
		
		media = soma / quantidade;
		
		System.out.println("O maior valor digitado foi: "+maior);
		System.out.println("A média dos números digitados foi: "+media);
		
		sc.close();
	}
}
