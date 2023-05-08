import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int base, expoente, contador=1, potencia=1;
        System.out.println("Digite um valor para a base da potencia");
        base = ler.nextInt();
        System.out.println("Digite um valor para o expoente da potencia");
        expoente = ler.nextInt();

        // while(contador <= expoente){
        //     potencia *= base;
        //     contador++;
        // }

        // do{
        //     potencia *= base;
        //     contador++; 
        // }while(contador == expoente);

        for(contador = 1; contador <= expoente; contador++){
            potencia *= base;
        }

        System.out.printf("%d elevado a %d é = %d", base, expoente, potencia);
    }
}
