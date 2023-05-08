// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. 

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String time1, time2;
        int golsTime1, golsTime2;

        System.out.println("Digite o nome do time 1:");
        time1 = ler.nextLine();
        System.out.println("Digite o nome do time 2:");
        time2 = ler.nextLine();
        System.out.printf("Digite quantos gols o time %s fez:",time1);
        golsTime1 = ler.nextInt();
        System.out.printf("Digite quantos gols o time %s fez:",time2);
        golsTime2 = ler.nextInt();

        if(golsTime1 > golsTime2){
            System.out.printf("O time %s foi o vencedor", time1);
        } else if(golsTime1 < golsTime2){
            System.out.printf("O time %s foi o vencedor", time2);
        } else{
            System.out.println("Deu empate!");
        }
    }    
}
