package manzando;

public class exercicioManzandoPg46G {
	public static void main(String[] args) {
		int contador = 1, numeroAtual = 1, numeroAtecessor = 0, soma = 0;
			    System.out.println(numeroAtual);
			    while(contador < 15){
			        soma = numeroAtual + numeroAtecessor;
			        System.out.println(soma);
			        numeroAtecessor = numeroAtual;
			        numeroAtual = soma;
			        contador++;
			    }
	}
}
