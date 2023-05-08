// Faça  um  algoritmo  para  ler:  a  descrição  do  produto  (nome),  a  quantidade  adquirida  e  o  preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que: - Se quantidade  <= 5  o desconto será de 2% - Se quantidade  > 5  e  quantidade  <=10  o desconto será de 3% - Se quantidade  >  10 o desconto será de 5% 

import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int quantidade;
        double preco, total, desconto, totalPagar;

        System.out.println("Digite a descrição ou o nome do produto:");
        nome = ler.nextLine();
        System.out.println("Digite a quantidade adquirida:");
        quantidade = ler.nextInt();
        System.out.println("Digite o preço unitário:");
        preco = ler.nextDouble();

        total = quantidade * preco;
        System.out.printf("Total: R$%.2f%n",total);

        if(quantidade <= 5){
            desconto = total * 0.02;
            totalPagar = total - desconto;
            System.out.printf("Desconto: R$%.2f%n",desconto);
            System.out.printf("Total a pagar: R$%.2f%n",totalPagar);
        } else if(quantidade > 5 && quantidade <= 10){
            desconto = total * 0.03;
            totalPagar = total - desconto;
            System.out.printf("Desconto: R$%.2f%n",desconto);
            System.out.printf("Total a pagar: R$%.2f%n",totalPagar);
        } else{
            desconto = total * 0.05;
            totalPagar = total - desconto;
            System.out.printf("Desconto: R$%.2f%n",desconto);
            System.out.printf("Total a pagar: R$%.2f%n",totalPagar);
        }
    }
}
