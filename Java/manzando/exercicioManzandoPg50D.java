package manzando;

public class exercicioManzandoPg50D {
	public static void main(String[] args) {
		long acumuladora = 0, graos = 0;
		int contador = 0;

		do{
			contador++;
            graos = (long) Math.pow(2, contador - 1);
			acumuladora += graos;
			System.out.println(acumuladora);
		} while (contador <= 64);
	}
}
