package faccat;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int quantidadeEstoque, maxima, minima;
        double media;

        System.out.println("Digite quantidade atual em estoque:");
        quantidadeEstoque = ler.nextInt();
        System.out.println("Digite quantidade máxima que pode ter em estoque:");
        maxima = ler.nextInt();
        System.out.println("Digite quantidade mínima que quem que ter em estoque:");
        minima = ler.nextInt();

        media = (maxima + minima) / 2; 

        if(quantidadeEstoque >= media){
            System.out.println("Não efetuar compra");
        } else{
            System.out.println("Efetuar compra");
        }
        
        ler.close();
	}
}
