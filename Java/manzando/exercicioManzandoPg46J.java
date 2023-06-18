package manzando;

public class exercicioManzandoPg46J {
	public static void main(String[] args) {
		int contador = 50, soma = 0, pares = 0;
		
		while(contador <= 70){
	        if(contador%2==0){
	            soma += contador;
	            pares++;
	        }
	        contador++;
	    }
		
	    int media = soma / pares;
	    
	    System.out.println("A soma dos valores pares de 50 ate 70 é "+soma+"\nA média dos números é "+media);
	}
}
