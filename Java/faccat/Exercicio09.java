package faccat;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o sal�rio mensal atual do funcion�rio: ");
		float salarioMensal=sc.nextFloat();
		System.out.println("Digite o percentual de reajuste: ");
		float reajuste=sc.nextFloat();
		float reajusteSalario=(reajuste/100)*salarioMensal;
		float salarioFinal=reajusteSalario+salarioMensal;
		System.out.println("O sal�rio final do funcion�rio �: "+salarioFinal);
		sc.close();
	}
}
