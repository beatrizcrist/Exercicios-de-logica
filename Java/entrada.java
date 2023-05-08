//comando para ler dados
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        //mostra que quer ler conteudos digitados no teclado
        Scanner ler = new Scanner(System.in);

        int n1 =0,n2=0,res=0;
        String nome="";
        System.out.println("Digite seu nome:");
        //nextLine = string, qubra linha   next = string, nao quebra linha   
        nome=ler.nextLine();  

        System.out.println("Digite um numero:");
        //nextInt = inteiro
        n1=ler.nextInt();

        System.out.println("Digite outro numero:");
        n2=ler.nextInt();

        res=n1+n2;

        System.out.printf("%s a soma de %d com %d é: %d%n",nome,n1,n2,res);


        int nota1 =0,nota2=0, nota3, nota4,soma=0;
        //uma contante nao pode ser alterada
        final int MEDIA=60;
        String aluno="", resultado="";

        System.out.println("Digite o nome do aluno:");
        aluno=ler.nextLine();

        System.out.println("Digite a nota 1:");
        nota1=ler.nextInt();

        System.out.println("Digite a nota 2:");
        nota2=ler.nextInt();

        System.out.println("Digite a nota 3:");
        nota3=ler.nextInt();

        System.out.println("Digite a nota 4:");
        nota4=ler.nextInt();

        soma=nota1+nota2+nota3+nota4;

        if(soma >= MEDIA){
            resultado="aprovado";
        } else if(soma >= 40){
            resultado="recuperação";
        } else{
            resultado="Reprovado";
        }

        System.out.printf("Aluno(a) %s foi %s, com nota %d", aluno, resultado, soma);
    }
}
