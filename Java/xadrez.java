// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

import java.util.Scanner;

public class xadrez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.println("Digite a hora que o jogo de xadrez começou:");
        inicio = ler.nextInt();
        System.out.println("Digite a hora que o jogo de xadrez acabou:");
        fim = ler.nextInt();

        if(fim <= inicio){
           duracao = 24 - inicio + fim;
           System.out.printf("O jogo de xadrez durou %d horas",duracao);
        } else{
            duracao = fim - inicio;
            System.out.printf("O jogo de xadrez durou %d horas",duracao);
        }
         
    }
}
