public class somaInteiros {
    public static void main(String[] args) {
        int contador = 1, soma = 0;

        while(contador <= 100){
            soma += contador;
            contador++;
        }

        System.out.printf("A soma de 1 ate 100 é %d", soma);
    }
}
