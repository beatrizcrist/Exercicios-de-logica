package exemplos;

public class Exemplo16 {
	public static void main(String[] args) {
		//compara valores e armazena somente o maior valor
		System.out.println(Math.max(5, 10));
		
		//compara valores e mostra somente o menor valor
		System.out.println(Math.min(5, 10));
		
		//mostra a raiz quadrada
		double raiz = Math.sqrt(64);
		int raizInt = (int) raiz;
		System.out.println(raizInt);
		
		//mostra o valor absoluto (positivo), tira o sinal
		System.out.println(Math.abs(-10.7));
		
		//gera numeros aleatorios entre 0.0 e 1.0
		System.out.println(Math.random());
		
		//gera numeros aleatorios entre 0 e 100
		int numerosInteirosAleatorios = (int)(Math.random() * 101);
		System.out.println(numerosInteirosAleatorios);
	}
}
