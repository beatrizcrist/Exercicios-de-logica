package faccat;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int quantidade;
        Double preco, total, desconto, precoTotal;

        System.out.println("Digite a descrição ou o nome do produto");
        nome = sc.nextLine();
        System.out.println("Digite a quantidade adquirida");
        quantidade = sc.nextInt();
        System.out.println("Digite o preço unitário do produto");
        preco = sc.nextDouble();

        total = quantidade * preco;

        if (quantidade <= 5) {
            desconto = total * 0.02;
            precoTotal = total - desconto;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = total * 0.03;
            precoTotal = total - desconto;
        } else {
            desconto = total * 0.05;
            precoTotal = total - desconto;
        }

        System.out.printf("Nome e descrição do produto: %s\n", nome);
        System.out.printf("Total (sem desconto): %.2f\n", total);
        System.out.printf("Desconto: %.2f\n", desconto);
        System.out.printf("Total a pagar: %.2f", precoTotal);

        sc.close();
    }
}
