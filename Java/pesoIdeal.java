// Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu peso ideal, utilizando as seguintes fórmulas: - para sexo masculino:  peso ideal = (72.7 * altura) - 58 - para sexo feminino:  peso ideal = (62.1 * altura) - 44.7 

import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome, sexo;
        double altura, pesoIdeal;

        System.out.println("Digite o seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite a sua altura:");
        altura = ler.nextDouble();
        ler.nextLine(); // para pular uma linha depois de ler o valor double
        System.out.println("Digite o seu sexo (M para masculino OU F para feminino)");
        sexo = ler.nextLine();

        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("%s, o peso ideal para pessoas com %.3fm de altura é %.2fkg", nome, altura, pesoIdeal); 
        } else{
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("%s, o peso ideal para pessoas com %.3fm de altura é %.2fkg", nome, altura, pesoIdeal); 
        }
    }
}

