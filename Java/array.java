import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int tam = 5;

        int[] num = new int[tam];
        int[] numeros = {10,20,30,40,50};

        num[0] = 10;
        num[1] = 15;
        num[2] = 20;
        num[3] = 25;
        num[4] = 30;

        for(int i = 0; i < num.length;i++){
            System.out.printf("%d - ",num[i]);
        }

        //System.out.printf("%d",numeros[1]);

        char[] gabarito = {'b','a','b','c','d'};
        char[] respostas = new char[tam];
        int nota = 0;

        // respostas[0]='b';
        // respostas[1]='a';
        // respostas[2]='c';
        // respostas[3]='b';
        // respostas[4]='d';

        for(int i = 0; i < tam;i++){
            System.out.printf("Informa a resposta %d ",i);
            respostas[i] = ler.nextLine().charAt(0);
        }

        for(int i=0;i<tam;i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }

        System.out.printf("%nNota do aluno: %d",nota);
    }
}
