package faccat;

public class Exercicio67 {
    public static void main(String[] args) {
        int soma = 0;
        double media = 0;

        for (int i = 15; i <= 100; i++) {
            soma += i;
        }

        media = soma / 85.0;

        System.out.println("A soma dos n�meros existentes entre 15 e 100 �: " + soma);
        System.out.println("A m�dia aritm�tica dos n�meros existentes entre 15 e 100 �: " + media);
    }
}
