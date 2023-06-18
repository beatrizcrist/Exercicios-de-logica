package manzando;

public class exercicioManzandoPg50A {
	public static void main(String[] args) {
		int contadora = 15, resultado = 0;

	    do {
	        resultado = contadora * contadora;
	        System.out.println(contadora + "² = " + resultado);
	        contadora++;
	    } while (contadora <= 200);
	}
}
