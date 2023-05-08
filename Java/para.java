// Escreva  um  algoritmo  para  imprimir  os  números  de  1  (inclusive)  a  10  (inclusive)  em  ordem crescente e descrescente.

import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for(int contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }

        for(int contador = 10; contador >= 1;contador--){
            System.out.println(contador);
        }

        int contar;

        System.out.println("Contar até o número:");
        contar = ler.nextInt();

        if(contar == 0 || contar < 0){
            System.out.println("Valor invalido, digite um numero maior");
            contar = ler.nextInt();
        }

        for(int i = 1; i <= contar; i++){
            System.out.println(i);
        }

    }
}
