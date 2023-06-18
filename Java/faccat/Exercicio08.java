package faccat;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int total, brancos, nulos, validos;
        double percentualBrancos, percentualNulos;

        System.out.println("Digite quantos o n�mero total dos eleitores:");
        total = ler.nextInt();
        System.out.println("Digite quantos eleitores votaram nulo:");
        nulos = ler.nextInt();
        System.out.println("Digite quantos eleitores votaram branco:");
        brancos = ler.nextInt();

        percentualBrancos = ((double) brancos / total) * 100;
        percentualNulos = ((double) nulos / total) * 100;
        validos = 100 - (int) percentualBrancos - (int) percentualNulos;

        System.out.printf("Percentual de votos brancos: %.2f%% %n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%% %n", percentualNulos);
        System.out.printf("Percentual de votos v�lidos: %d%% %n", validos);
        
        ler.close();
	}
}
