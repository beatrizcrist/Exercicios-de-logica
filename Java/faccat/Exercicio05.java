package faccat;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int numero = 0, antecessor = 0, sucessor = 0;

        System.out.println("Digite um n�mero:");
        numero = ler.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("O antecessor do n�mero %d � %d e o sucessor � %d", numero, antecessor,sucessor);
        
        ler.close();
	}
}
