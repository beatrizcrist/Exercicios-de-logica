package faccat;

import java.util.Scanner;

public class Exercicio60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intervalo = 0, foraIntervalo = 0, valores;
		
		for (int i = 1; i <= 10; i++) {
	    	System.out.printf("Digite o %d° número\n", i);
	    	valores = sc.nextInt();
	    	
	    	if(valores >= 10 && valores <= 20){
	            intervalo++;
	        } else{
	            foraIntervalo++;
	        }
		}
		
		System.out.println("Números no intervalo de 10 a 20: "+intervalo);
		System.out.println("Números que não estão no intervalo de 10 a 20: "+foraIntervalo);
		
		sc.close();
	}
}
