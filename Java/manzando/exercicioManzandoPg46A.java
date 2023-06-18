package manzando;

import java.util.Scanner;

public class exercicioManzandoPg46A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor, contador = 1;
		
		System.out.println("Digite um valor para ser mostrado a tabuada");
		valor = sc.nextInt();
		
		while(contador <= 10) {
			int tabuada = valor * contador;
			System.out.println(valor+" X "+contador+" = "+tabuada+" ");
			contador++;
		}
		
		sc.close();
	}
}
