// Faça  um  algoritmo  que  leia  três  notas  de  um  aluno,  calcule  e  escreva  a  média  final  deste  aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5

import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota1, nota2, nota3, soma, media;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = ler.nextInt();

        soma = (nota1*2) + (nota2*3) + (nota3*5);
        media = soma / 10;

        System.out.printf("A média ponderada das notas digitadas é %d", media);
    }
}
