package faccat;

import java.util.Scanner;

public class Exercicio43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		String mens;
		
		System.out.println("Digite um valor para a");
		a = sc.nextInt();
		System.out.println("Digite um valor para b");
		b = sc.nextInt();
		System.out.println("Digite um valor para c");
		c = sc.nextInt();

			    if(a < b+c && b < a+c && c < a+b){
			        if(a == b && b == c){
			            mens = "Tri�ngulo Equil�tero";
			        } else if(a==b || b==c || a==c){
			            mens = "Tri�ngulo Is�sceles";
			        } else{
			            mens = "Tri�ngulo Escaleno";
			        }
			    } else{
			        mens = "N�o � poss�vel formar um tri�ngulo";
			    }

			    System.out.println(mens);
			    
			    sc.close();
	}
}
