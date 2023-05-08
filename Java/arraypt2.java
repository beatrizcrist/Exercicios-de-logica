import java.util.Arrays;
import java.util.Scanner;

public class arraypt2 {
    public static void main(String[] args) {
        int[] num={4,8,12,9,2,5,3,7,0};
        int[] numeros={4,8,12,9,2,5,3,7,0};
        int[] a= new int[10];

        //coloca o array em ordem g=crescente
        Arrays.sort(num);
        //preeche o array com um valor expecifico, todos vao ser 10
        Arrays.fill(numeros, 10);

        //copia o conteudo de um array para outro
        //qual array copiar, copiar a partir de que posição, cola em qual array, posição de colamento, tamanho do array que sera colado o conteudo
        //Arrays.arraycopy(num, 0, a, 0, 10);
        
        //comparar array
        System.out.printf("%s ",Arrays.equals(num, a) ? "Sim" : "Não");
        //pesquisa se tal elemento ta no array, retorna a posisao, se for positivo é verdadeiro, negativo é falso 
        int pos =2;
        System.out.printf("o elemento %d ta no array? %s",pos,Arrays.binarySearch(num,pos) > 0 ? "Sim" : "Não");


        for(int n:a){
            System.out.printf("%d ",n);
        }
    }
}
