import java.util.Scanner;

public class temporizador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.println("A patir de que hora deve começar:");
        horas = ler.nextInt();
        System.out.println("A patir de que minuto deve começar:");
        minutos = ler.nextInt();
        System.out.println("A patir de que segundo deve começar:");
        segundos = ler.nextInt();

        for(int contador = horas; contador >= 0; contador--){
            for(int contador1 = minutos; contador1 >= 0; contador1--){
                minutos = 59;
                for(int contador2 = segundos; contador2 >= 0;contador2--){
                    segundos = 59;
                    System.out.printf("%d:%d:%d%n",contador, contador1, contador2);
                    try {
                        Thread.sleep(1000); // delay de 1 segundo
                    } catch (InterruptedException e) {
                        // se der algo errado mostra isso
                        System.out.println("deu erro");
                    }
                }
            }
        }
    }
}
