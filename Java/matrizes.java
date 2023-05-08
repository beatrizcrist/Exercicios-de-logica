//numeros aleatorios
import java.security.SecureRandom;

//matriz = array de arrays
public class matrizes {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;
        //matriz
        int[][] numeros = new int[linhas][colunas];
        int[][] num = {{10,1,2,3,4,},{5,7,8,9,6},{20,30,10,40,50}};

        for(int l =0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                                //gerar numeros aleatorios
                numeros[l][c] = new SecureRandom().nextInt(9);
            }
        }

        // for(int l =0;l<linhas;l++){
        //     for(int c=0;c<colunas;c++){
        //         System.out.printf("%d |",numeros[l][c]);
        //     }
        //     System.out.printf("%n");
        // }

            for(int[] n:num){
                for(int v:n){
                    System.out.printf("%d |",v);
                }
                System.out.printf("%n");
            }
    }
}
