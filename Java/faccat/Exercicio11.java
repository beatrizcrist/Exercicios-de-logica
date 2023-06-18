package faccat;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o número de carros vendidos pelo vendedor: ");
		int carrosVendidos=sc.nextInt();
		System.out.println("Digite o valor total das vendas que o vendedor fez: ");
		float totalVendas=sc.nextFloat();
		System.out.println("Digite o valor do salário fixo mensal do vendedor: ");
		float salarioFixo=sc.nextFloat();
		System.out.println("Digite o valor da comissão que o vendedor recebe por carro vendido:");
		float valorComissao=sc.nextFloat();
		float salarioFinal=salarioFixo+(carrosVendidos*valorComissao)+((totalVendas*5)/100);
		System.out.println("O salário final do funcionário é: R$ "+salarioFinal);
		sc.close();
		
	}
}
