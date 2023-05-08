public class cronometro {
    public static void main(String[] args) {
        for (int horas = 0; horas <= 24; horas++) {
            for (int minutos = 0; minutos <= 59; minutos++) {
                for (int segundos = 0; segundos <= 59; segundos++) {
                    System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
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
