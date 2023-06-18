package faccat;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int codigo;
        double saldoAtual, saldo, debito, credito;

        System.out.println("Digite o código da conta bancária:");
        codigo = ler.nextInt();
        System.out.println("Digite o saldo disponível da conta:");
        saldo = ler.nextDouble();
       
        System.out.println("Digite o valor que deseja debitar da conta:");
        debito = ler.nextDouble();
        
        while(debito > saldo) {
        	System.out.println("DÉBITO INDISPONÍVEL POR ULTRAPASSAR O VALOR DE SALDO");
        	System.out.println("Digite o valor que deseja debitar da conta:");
            debito = ler.nextDouble();
        }
        
        System.out.println("Digite o valor que deseja creditar a conta:");
        credito = ler.nextDouble();

        saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual da conta: R$%.2f%n",saldoAtual);

        if(saldoAtual >= 0){
            System.out.println("Saldo Positivo");
        } else{
            System.out.println("Saldo Negativo"); 
        }
        
        ler.close();
	}
}
