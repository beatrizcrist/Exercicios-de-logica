package faccat;

import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int litros;
        String combustivel;
        double desconto, preco, alcool, gasolina;

        System.out.println("Digite quantos litros foram vendido:");
        litros = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o tipo de gasolina que foi vendida (A para alcool | G para gasolina)");
        combustivel = sc.nextLine();

        alcool = 2.30;
        gasolina = 3.30;

        if(combustivel.equals("A")){
            if(litros <= 20){
                desconto = alcool * 0.03;
                preco = (litros * alcool) - (desconto * litros);
                System.out.printf("O preco a ser pago é: %.2f",preco);
            } else{
                desconto = alcool * 0.05;
                preco = (litros * alcool) - (desconto * litros);
                System.out.printf("O preco a ser pago é: %.2f",preco);
            }
        } else{
            if(litros <= 20){
                desconto = gasolina * 0.04;
                preco = (litros * gasolina) - (desconto * litros);
                System.out.printf("O preco a ser pago é: %.2f",preco);
            } else{
                desconto = gasolina * 0.06;
                preco = (litros * gasolina) - (desconto * litros);
                System.out.printf("O preco a ser pago é: %.2f",preco);
            } 
        }
		
		sc.close();
	}
}
