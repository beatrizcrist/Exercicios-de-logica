package exemplos;

public class Exemplo17 {
	public static void main(String[] args) {
		String[] frutas = {"Pera","Uva","Maça","Salada mista"};
		int[] numeros = {10,20,30,40};
		
		//reatribui o valor do elemento 3 
		frutas[3] = "Salada";
		
		System.out.println(frutas[3]);
		//mostra quantos elementos tem no vetor
		System.out.println(frutas.length);
		
		numeros[0] = 15;
		System.out.println(numeros[0]);
		
		//mostra os elementos que estao dentro do array
		for(int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}
