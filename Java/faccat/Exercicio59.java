package faccat;

import java.util.Scanner;

public class Exercicio59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int negativos = 0;
			    for(int contador = 1; contador <= 10; contador++){
			    	System.out.printf("Digite o %d° número\n", contador);
			        int valores = sc.nextInt();

			        if(valores < 0){
			            negativos = negativos + 1;
			        }
			    }

			    System.out.println("Quatidade de valores negativos digitados: "+negativos);
		
		sc.close();
	}
}
