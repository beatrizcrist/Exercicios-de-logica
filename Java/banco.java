// Faça um  algoritmo para ler: número da  conta do cliente, saldo, débito e  crédito. Após,  calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

import java.util.Scanner;

public class banco {
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
        System.out.println("Digite o valor que deseja creditar a conta:");
        credito = ler.nextDouble();

        saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual da conta: R$%.2f%n",saldoAtual);

        if(saldoAtual >= 0){
            System.out.println("Saldo Positivo");
        } else{
            System.out.println("Saldo Negativo"); 
        }
    }
}
