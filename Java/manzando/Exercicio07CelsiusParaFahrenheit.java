package manzando;

import java.util.Scanner;

public class Exercicio07CelsiusParaFahrenheit {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Informe os graus em Celsius: ");
	 float celsius = sc.nextFloat();
	 float fahrenheit = ((9 * celsius) + 160)/5;
	 System.out.println("O valor de fahrenheit é " + fahrenheit);
	 sc.close();
 }
}