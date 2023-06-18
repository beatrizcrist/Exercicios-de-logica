package manzando;

public class exercicioManzandoPg46C {
	public static void main(String[] args) {
		int contador = 2, soma = 0;
			    while(contador <= 500){
			        soma += contador;
			        contador +=2;
			    }
		System.out.println("A soma dos número pares de 1 ate 500 é "+soma);
	}
}
