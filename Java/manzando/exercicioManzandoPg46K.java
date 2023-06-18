package manzando;

import java.util.Scanner;

public class exercicioManzandoPg46K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "sim";
		int area = 0, areaTotal = 0, comodos = 0;
		
		while(continuar.equals("sim")){
			System.out.println("Digite o nome do cômodo");
	        String comodo = sc.next();
	        System.out.println("Digite a largura do cômodo");
	        int largura = sc.nextInt();
	        System.out.println("Digite o comprimento do cômodo");
	        int comprimento = sc.nextInt();

	        area = largura*comprimento;

	        System.out.printf("A área do cômodo %s é %dm2\n", comodo, area);
	        areaTotal += area;
	        comodos++;
	        System.out.println("Quer continuar a calcular novos cômodos? (sim/não)");
	        continuar = sc.next();
	    }
		
		System.out.printf("Quantidade de cômodos lidos: %d\n",comodos);
	    System.out.printf("A soma total da área dos comodos lidos é: %dm2",areaTotal);
		
		sc.close();
	}
}
