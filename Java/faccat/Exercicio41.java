package faccat;

import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int nota1, nota2, nota3;
        double mediaExercicio, mediaAproveitamento;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = ler.nextInt();

        System.out.println("Digite a m�dia dos exerc�cios que fazem parte da avalia��o:");
        mediaExercicio = ler.nextDouble();
        
        mediaAproveitamento = (((nota1+nota2)*2)+(nota3*3)+mediaExercicio)/7;
        
        System.out.printf("M�dia de aproveitamento: %.2f\n", mediaAproveitamento);

        	    if(mediaAproveitamento >= 9){
        	    	System.out.println("O conceito do aluno � A");
        	    } else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0){
        	    	System.out.println("O conceito do aluno � B");
        	    } else if(mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5){
        	    	System.out.println("O conceito do aluno � C");
        	    } else{
        	    	System.out.println("O conceito do aluno � D");
        	    }
        
        ler.close();
	}
}
