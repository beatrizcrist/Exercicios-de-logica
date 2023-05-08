import java.util.Random;

public class math {
    public static void main(String[] args) {
        //mostra o numero maior 
        System.out.println(Math.max(8, 21));

        //mostra o numero menos 
        System.out.println(Math.min(4,2));

       //mostra a raiz quadrada
       System.out.println(Math.sqrt(9));
       
       //converte o valo para positivo
       System.out.println(Math.abs(-8));

       //gera numeros aleatorios entre 0.0 e 1.0
       System.out.println(Math.random());

       //gera numeros aleatorios entre 0 e 100
       int aleatorio = (int)(Math.random() * 101);
       System.out.println(aleatorio);
    }
}
