package faccat;

import java.util.Scanner;

public class Exercicio23 {
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
        
        ler.close();
    }
}
