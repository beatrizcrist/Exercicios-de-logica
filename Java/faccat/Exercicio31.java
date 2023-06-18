package faccat;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor do primeiro lado:");
		a = sc.nextInt();
		System.out.println("Digite o valor do segundo lado:");
		b = sc.nextInt();
		System.out.println("Digite o valor do terceiro lado:");
		c = sc.nextInt();

		if(c < a + b && a < b + c && b < c + a){
			 System.out.println("Pode formar um triângulo!");
		} else{
			 System.out.println("Não pode formar um triângulo!");
		}
		
		sc.close();
	}
}
