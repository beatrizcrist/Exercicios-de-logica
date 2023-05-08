// Ler  as  notas  da  1a.  e  2a.  avaliações  de  um  aluno.  Calcular  a  média aritmética  simples  e  escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class aprovadoReprovado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextInt();

        media = (nota1+nota2)/2;

        System.out.printf("A média das notas digitadas é: %d%n",media);

        if(media >= 6){
            System.out.println("ALUNO APROVADO!");
        }else{
            System.out.println("ALUNO REPROVADO!");
        }
    }
}
