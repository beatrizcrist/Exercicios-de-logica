// Ler tres valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor:");
        valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = ler.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = ler.nextInt();

        if(valor1 < valor2 && valor1 < valor3){
            if(valor2 < valor3){
                System.out.printf("Ordem crescente: %d, %d, %d", valor1,valor2,valor3); 
            } else{
                System.out.printf("Ordem crescente: %d, %d, %d", valor1,valor3,valor2);
            }
        } else if(valor2 < valor1 && valor2 < valor3){
            if(valor1 < valor3){
                System.out.printf("Ordem crescente: %d, %d, %d", valor2,valor1,valor3);
            } else{
                System.out.printf("Ordem crescente: %d, %d, %d", valor2,valor3,valor1);  
            }   
        } else{
            if(valor2 < valor1){
                System.out.printf("Ordem crescente: %d, %d, %d", valor3,valor2,valor1);
            } else{
                System.out.printf("Ordem crescente: %d, %d, %d", valor3,valor1,valor2);  
            } 
        }
    }
}
