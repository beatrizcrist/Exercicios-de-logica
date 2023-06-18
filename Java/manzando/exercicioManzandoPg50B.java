package manzando;

public class exercicioManzandoPg50B {
	public static void main(String[] args) {
		int soma = 0,contador = 0;

	    do {
	        contador += 2;
	        soma += contador;
	    } while (contador <= 500);

	    System.out.println("Total das somas dos números pares de 1 a 500 é: " + soma);
	}
}
