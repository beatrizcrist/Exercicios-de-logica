// Morango R$ 2,50 por Kg R$ 2,20 por Kg. Maçã R$ 1,80 por Kg R$ 1,50 por Kg. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda  um  desconto  de  10%  sobre  este  total.  Escreva  um  algoritmo  para  ler  a  quantidade  (em  Kg)  de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. 

import java.util.Scanner;

public class fruteira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double maca, morango, desconto, preco, precoTotal;
        int quantidadeMaca, quantidadeMorango, quantidade;

        System.out.println("Digite a quantidade (em Kg) de morangos comprados:");
        quantidadeMorango = ler.nextInt();
        System.out.println("Digite a quantidade (em Kg) de maças comprados:");
        quantidadeMaca = ler.nextInt();

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
    }
}
