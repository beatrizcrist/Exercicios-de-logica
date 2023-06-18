package faccat;

import java.util.Scanner;

public class Exercicio69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "S";
		int contador = 0;
		double valorEstoque = 0, media, preco;
		
		while(continuar.equals("S")) {
			System.out.println("Digite o preço da mercadoria");
			preco = sc.nextDouble();
			
			System.out.println("MAIS MERCADORIAS (S/N)?");
			continuar = sc.next();
			
			contador++;
			valorEstoque += preco;
		}
		
		media = valorEstoque / contador;
		
		System.out.println("O valor total em estoque da empresa: R$"+valorEstoque);
		System.out.println("A média do valor das mercadorias em estoque: R$"+media);
		
		sc.close();
	}
}
