// As  maçãs  custam  R$  1,30  cada  se  forem  compradas  menos  de  uma  dúzia, e  R$  1,00  se  forem compradas  pelo  menos  12.  Escreva  um  programa  que  leia  o  número  de  maçãs  compradas,  calcule  e escreva o custo total da compra.

import java.util.Scanner;

public class maca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maca;
        double preco;

        System.out.println("Digite quantas maças foram compradas:");
        maca = ler.nextInt();

        if(maca < 6){
            preco = maca * 1.30;
            System.out.printf("O total a ser pago pelas %d maças compradas é R$%f",maca,preco);
        } else{  
            preco = maca * 1.00;
            System.out.printf("O total a ser pago pelas %d maças compradas é R$%f",maca,preco);
        }
    }
}
