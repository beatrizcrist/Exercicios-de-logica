package faccat;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horasTrabalhadas, salarioPorHora, salario, horaExtra;
		
		System.out.println("Digite quantas horas foram trabalhadas este mês:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o salário recebido por hora trabalhada:");
		salarioPorHora = sc.nextInt();
		
		if(horasTrabalhadas <= 160){
			salario = horasTrabalhadas * salarioPorHora;
			System.out.println("O salário correspondente a este mês é "+salario);
		} else {
			horaExtra = horasTrabalhadas - 160;
			salario = (horaExtra * salarioPorHora+(horaExtra *(salarioPorHora * 0.5))) + (160 * salarioPorHora);
			System.out.println("O salário correspondente a este mês é "+salario);
		}
		
		sc.close();
	}
}
