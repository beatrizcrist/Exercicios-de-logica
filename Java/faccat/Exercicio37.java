package faccat;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double maca, morango, desconto, preco, precoTotal;
        int quantidadeMaca, quantidadeMorango, quantidade;

        System.out.println("Digite a quantidade (em Kg) de morangos comprados:");
        quantidadeMorango = sc.nextInt();
        System.out.println("Digite a quantidade (em Kg) de maças comprados:");
        quantidadeMaca = sc.nextInt();

        if(quantidadeMorango <= 5){
            morango = 2.50 * quantidadeMorango;
            System.out.printf("O preço a ser pago pelos morangos é: R$%.2f%n",morango);
        } else {
            morango = 2.20 * quantidadeMorango;
            System.out.printf("O preço a ser pago pelos morangos é: R$%.2f%n",morango);
        } 
        
        if(quantidadeMaca <= 5){
            maca = 1.80 * quantidadeMaca;
            System.out.printf("O preço a ser pago pelas maças é: R$%.2f%n",maca);
        } else{
            maca = 1.50 * quantidadeMaca;
            System.out.printf("O preço a ser pago pelas maças é: R$%.2f%n",maca);
        }

        preco = maca + morango;
        quantidade = quantidadeMaca + quantidadeMorango;

        if(quantidade > 8 || preco > 25){
            desconto = preco * 0.10;
            precoTotal = preco - desconto;
            System.out.printf("O total da compra com o desconto de R$%.2f é R$%.2f", desconto, precoTotal);
        } else{
            System.out.printf("O total da compra é R$%.2f",preco);
        }
		
		sc.close();
	}
}
