package faccat;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int quantidadeEstoque, maxima, minima;
        double media;

        System.out.println("Digite quantidade atual em estoque:");
        quantidadeEstoque = ler.nextInt();
        System.out.println("Digite quantidade m�xima que pode ter em estoque:");
        maxima = ler.nextInt();
        System.out.println("Digite quantidade m�nima que quem que ter em estoque:");
        minima = ler.nextInt();

        media = (maxima + minima) / 2; 

        if(quantidadeEstoque >= media){
            System.out.println("N�o efetuar compra");
        } else{
            System.out.println("Efetuar compra");
        }
        
        ler.close();
	}
}
