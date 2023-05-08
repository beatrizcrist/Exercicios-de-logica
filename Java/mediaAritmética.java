import java.util.Scanner;

public class mediaAritmética {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1, soma = 0, valores, media = 0;

        // while(contador <= 10){
        //     System.out.printf("Digite o %d° numero:%n",contador);
        //     valores = ler.nextInt();
        //     soma += valores;
        //     media = soma / contador;
        //     contador++;
        // }

        // do{
        //     System.out.printf("Digite o %d° numero:%n",contador);
        //     valores = ler.nextInt();
        //     soma += valores;
        //     media = soma / contador;
        //     contador++;
        // }while(contador <= 10);

        for(contador = 1; contador <= 10; contador++){
            System.out.printf("Digite o %d° numero:%n",contador);
            valores = ler.nextInt();
            soma += valores;
            media = soma / contador;
        }

        System.out.printf("A soma dos números digitados é = %d%n",soma);
        System.out.printf("A média dos números digitados é = %d",media);
    }
}
