// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele  recebe  uma  comissão  de  3%  sobre  o  total  das  vendas  até  R$  1.500,00  mais  5%  sobre  o  que ultrapassar este valor, calcular e escrever o seu salário total.

import java.util.Scanner;

public class salarioTotal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioFixo, vendas, comissao, salario;

        System.out.println("Digite o salário fixo:");
        salarioFixo = ler.nextDouble();
        ler.nextInt();
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        vendas = ler.nextDouble();
        ler.nextInt();

        if (vendas > 1500) {
            comissao = ((vendas - 1500) * 0.05) + (1500 * 0.03);
            salario = salarioFixo + comissao;
            System.out.printf("O salário total do vendedor é %f", salario);
        } else {
            comissao = vendas * 0.03;
            salario = salarioFixo + comissao;
            System.out.printf("O salário total do vendedor é %f", salario);
        }
    }
}
