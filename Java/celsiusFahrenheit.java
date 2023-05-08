import java.util.Scanner;

public class celsiusFahrenheit {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int celsius, fahrenheit;

        System.out.println("Digite a temperatura em graus celsius:");
        celsius = ler.nextInt();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("%d° graus celsius é igual a %d° graus fahrenheit",celsius,fahrenheit);
    }
}
