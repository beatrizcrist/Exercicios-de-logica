package faccat;

import java.util.Scanner;

public class Exercicio68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mercadorias;
		double media, preco, valorEstoque = 0;
		
		System.out.println("Digite a quantidade de mercadorias em estoque");
		mercadorias = sc.nextInt();
		
		for (int i = 1; i <= mercadorias; i++) {
			System.out.printf("Digite o preço da unidade da %d° mercadoria\n", i);
			preco = sc.nextDouble();
			
			valorEstoque += preco;
		}
		
		media = valorEstoque / mercadorias;
		
		System.out.println("O valor total em estoque da empresa: R$"+valorEstoque);
		System.out.println("A média do valor das mercadorias em estoque: R$"+media);
		
		sc.close();
	}
}
