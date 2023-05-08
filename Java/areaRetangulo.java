// Escreva  um  algoritmo  para  ler  as  dimensões  de  um  retângulo  (base  e  altura),  calcular  e  escrever  a área do retângulo. 

import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int area = 0, base = 0,altura = 0;

        System.out.println("Digite a medida da base do retângulo:");
        base = ler.nextInt();
        System.out.println("Digite a altura do retângulo:");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("A área do retângulo é: %d",area);
    }
}
