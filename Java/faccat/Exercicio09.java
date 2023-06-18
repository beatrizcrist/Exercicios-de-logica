package faccat;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o salário mensal atual do funcionário: ");
		float salarioMensal=sc.nextFloat();
		System.out.println("Digite o percentual de reajuste: ");
		float reajuste=sc.nextFloat();
		float reajusteSalario=(reajuste/100)*salarioMensal;
		float salarioFinal=reajusteSalario+salarioMensal;
		System.out.println("O salário final do funcionário é: "+salarioFinal);
		sc.close();
	}
}
