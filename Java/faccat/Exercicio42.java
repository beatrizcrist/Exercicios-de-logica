package faccat;

import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int codigo, anoNascimento, anoContratado, idade, tempoTrabalho;

        System.out.println("Digite o n�mero (c�digo) do colaborador:");
        codigo = ler.nextInt();
        System.out.println("Digite o ano de nascimento do colaborador:");
        anoNascimento = ler.nextInt();
        System.out.println("Digite o ano de ingresso na empresa:");
        anoContratado = ler.nextInt();

        idade = 2023 - anoNascimento;
        tempoTrabalho = 2023 - anoContratado;

        System.out.printf("Idade o colaborador: %d%n",idade);
        System.out.printf("Tempo de trabalho do colaborador: %d%n",tempoTrabalho);

        if(idade >= 65 || tempoTrabalho >= 30){
            System.out.println("Requerer aposentadoria");
        } else if(idade >= 60 && tempoTrabalho >= 25){
            System.out.println("Requerer aposentadoria");
        } else{
            System.out.println("N�o requerer aposentadoria");
        }
        
        ler.close();
	}
}
