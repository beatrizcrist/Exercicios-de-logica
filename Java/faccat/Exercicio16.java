package faccat;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int maca;
        double preco;

        System.out.println("Digite quantas maças foram compradas:");
        maca = ler.nextInt();

        if(maca < 6){
            preco = maca * 1.30;
            System.out.printf("O total a ser pago pelas %d maças compradas é R$%.2f",maca,preco);
        } else{  
            preco = maca * 1.00;
            System.out.printf("O total a ser pago pelas %d maças compradas é R$%.2f",maca,preco);
        }
        
        ler.close();
	}
}
