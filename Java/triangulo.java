// Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.   

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;

        System.out.println("Ditige o valor do lado:");
        a = ler.nextInt();
        System.out.println("Ditige o valor do lado:");
        b = ler.nextInt();
        System.out.println("Ditige o valor do lado:");
        c = ler.nextInt();

        if(c < a + b &&  a < b + c &&  b < c + a){
            System.out.println("Pode formar um triângulo!");
        } else{
            System.out.println("Não pode formar um triângulo!");
        }
    }
}
