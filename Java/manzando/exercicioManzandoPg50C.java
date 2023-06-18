package manzando;

public class exercicioManzandoPg50C {
	public static void main(String[] args) {
		int contador = 0;
	    do {
	        if (contador % 4 == 0) {
	            System.out.println(contador);
	        }
	        contador++;
	    } while (contador <= 200);
	}
}
