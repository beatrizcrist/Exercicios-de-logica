// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais  uma  comissão  também  fixa  para  cada  carro  vendido  e  mais  5% do  valor  das  vendas  por  ele efetuadas. Escrever um algoritmo que leia o número de  carros por  ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class salarioVendedor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double carros, vendas, salarioFixo, carrovendido, salario;

        System.out.println("Digite o número de carros que o funcionário vendeu:");
        carros = ler.nextInt();
        System.out.println("Digite o valor total de vendas que o funcionário efetuou:");
        vendas = ler.nextInt();
        System.out.println("Digite o salário fixo do funcionário:");
        salarioFixo = ler.nextInt();
        System.out.println("Digite o valor que o funcionário recebe por carro vendido:");
        carrovendido = ler.nextInt();

        salario = ((double) vendas * 0.05) + ((double) carros * carrovendido) + salarioFixo;

        System.out.printf("O salário dinal do vendenor é: %f",salario);
    }
}
