// Ler tres valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor:");
        valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = ler.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = ler.nextInt();

        if(valor1 > valor2 && valor1 > valor3){
            System.out.printf("%d é maior que %d e %d",valor1,valor2,valor3);
        } else if(valor2 > valor1 && valor2 > valor3){
            System.out.printf("%d é maior que %d e %d",valor2,valor1,valor3);  
        } else{
            System.out.printf("%d é maior que %d e %d",valor3,valor1,valor2);  

        }
    }
}
