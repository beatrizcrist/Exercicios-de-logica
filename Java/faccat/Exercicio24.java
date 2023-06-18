package faccat;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        double salarioFixo, vendas, comissao, salario;

        System.out.println("Digite o sal�rio fixo:");
        salarioFixo = ler.nextDouble();
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        vendas = ler.nextDouble();

        if (vendas > 1500) {
            comissao = ((vendas - 1500) * 0.05) + (1500 * 0.03);
            salario = salarioFixo + comissao;
            System.out.printf("O sal�rio total do vendedor � R$%.2f", salario);
        } else {
            comissao = vendas * 0.03;
            salario = salarioFixo + comissao;
            System.out.printf("O sal�rio total do vendedor � R$%.2f", salario);
        }
        
        ler.close();
	}
}
