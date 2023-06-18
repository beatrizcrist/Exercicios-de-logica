package faccat;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o custo de Fábrica de um carro: ");
		float custoFabrica=sc.nextFloat();
		float imposto=(custoFabrica*45)/100;
		float distribuidor=(custoFabrica*28)/100;
		float custoTotal=custoFabrica+imposto+distribuidor;
		System.out.println("O custo total do carro é de: R$ "+custoTotal);
		sc.close();
	}
}
