package faccat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite quantos anos você tem: ");
		int anos = sc.nextInt();
		System.out.println("Acrescente os meses desde o dia do seu último aniversário: ");
		int meses = sc.nextInt();
		System.out.println("Coloque o dia do mês que você está: ");
		int dias = sc.nextInt();
		int resultadoanos = anos*365;
		int resultadomes = meses*30;
		int resultadodias = resultadoanos+resultadomes+dias;
		System.out.println("Você tem " + resultadodias + " dias de vida");
		sc.close();
	}
}
