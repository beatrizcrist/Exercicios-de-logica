package manzando;

import java.util.Scanner;

public class exercicioManzandoPg46F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, expoente, contador = 1, potencia = 1;
		
		System.out.println("Escreva a base da opera��o:");
		base = sc.nextInt();
		System.out.println("Escreva a exponencia��o da opera��o:");
		expoente = sc.nextInt();
		
		while(contador <= expoente){
	        potencia *= base;
	        contador++;
	    }
		
		System.out.println(base+" elevado a "+expoente+" � = "+potencia);
				
		sc.close();
	}
}
