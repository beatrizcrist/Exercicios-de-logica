// Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tabuada, numero, contador = 1;

        System.out.println("Digite o número para ser exibida sua tabuada:");
        numero = ler.nextInt();

        for(int i = 0; i <= 10; i++){
            tabuada = numero * i;
            System.out.printf("%d X %d = %d%n",numero,i,tabuada);
        }

        // while(contador <=10){
        //     tabuada  = numero * contador;
        //     System.out.printf("%d X %d = %d%n",numero,contador,tabuada);
        //     contador++;
        // }

        // do{
        //     tabuada = numero * contador;
        //     System.out.printf("%d X %d = %d%n",numero,contador,tabuada);
        //     contador++;
        // } while(contador <= 10);
    }
}
