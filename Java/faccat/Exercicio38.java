package faccat;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha, codigo;
		
		System.out.println("Digite o código de usuário");
		codigo = sc.nextInt();
		
		if(codigo == 1234){
			System.out.println("Digite a senha de acesso");
			senha = sc.nextInt();
			
			if(senha == 9999){
			     System.out.println("Acesso permitido!");
			} else{
			     System.out.println("Senha incorreta!");
			}

		} else{
			 System.out.println("Usuário inválido!");
		}
		
		sc.close();
	}
}
