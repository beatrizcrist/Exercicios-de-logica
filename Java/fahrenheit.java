// Escreva  um  algoritmo  para  ler  uma  temperatura  em  graus  Fahrenheit,  calcular  e  escrever  o  valor correspondente em graus Celsius

import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.println("Digite a temperatura em graus Fahrenheit:");
        fahrenheit = ler.nextInt();

        celsius = ((double)fahrenheit - 32) / 1.8;

        System.out.printf("A conversão de %f° graus fahrenheit para graus celsius é %f°", fahrenheit, celsius);    
    }
}
