package manzando;

import java.util.Scanner;

public class exercicioManzandoPg46K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "sim";
		int area = 0, areaTotal = 0, comodos = 0;
		
		while(continuar.equals("sim")){
			System.out.println("Digite o nome do c�modo");
	        String comodo = sc.next();
	        System.out.println("Digite a largura do c�modo");
	        int largura = sc.nextInt();
	        System.out.println("Digite o comprimento do c�modo");
	        int comprimento = sc.nextInt();

	        area = largura*comprimento;

	        System.out.printf("A �rea do c�modo %s � %dm2\n", comodo, area);
	        areaTotal += area;
	        comodos++;
	        System.out.println("Quer continuar a calcular novos c�modos? (sim/n�o)");
	        continuar = sc.next();
	    }
		
		System.out.printf("Quantidade de c�modos lidos: %d\n",comodos);
	    System.out.printf("A soma total da �rea dos comodos lidos �: %dm2",areaTotal);
		
		sc.close();
	}
}
