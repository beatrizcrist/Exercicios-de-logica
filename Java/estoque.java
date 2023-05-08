// Faça  um  algoritmo  para  ler:  quantidade  atual  em  estoque,  quantidade  máxima  em  estoque  e quantidade  mínima  em  estoque  de  um  produto.  Calcular  e  escrever  a  quantidade  média  ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a  quantidade  média  escrever  a  mensagem  'Não  efetuar  compra',  senão  escrever  a  mensagem  'Efetuar compra'. 

import java.util.Scanner;

public class estoque {
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
    }
}
