package faccat;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		String  resposta;
		
		System.out.println("Digite o valor para x");
		x = sc.nextInt();
		System.out.println("Digite o valor para y");
		y = sc.nextInt();
		
		z = (x * y) + 5;
		
		if(z <= 0){
			 resposta = "A";
		} else if(z <= 100){
			 resposta = "B";
		} else{
			 resposta = "C";
		}
			    
		System.out.printf("Z = %d \nresposta = %s", z, resposta);
			    
		sc.close();
	}
}
