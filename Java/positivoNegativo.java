// Ler um valor e escrever se é igual a 0, positivo ou negativo (considere o valor zero como positivo). 

import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.println("Digite um número:");
        valor = ler.nextInt();

        if(valor==0){
            System.out.println("Valor é igual a 0");
        } else if(valor < 0){
            System.out.printf("O valor %d é NEGATIVO!",valor);
        } else{
            System.out.printf("O valor %d é POSITIVO!",valor); 
        }
    }
}
