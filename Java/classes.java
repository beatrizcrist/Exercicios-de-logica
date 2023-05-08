public class classes {
    //tudo em java é uma classe
    //a main vai ser sempre a primeira classe a ser executada
    public static void main(String[] args) {
        int num = 0;
        // int num = 0;

        Classe.pontos();
        Classe.pontos();
        Classe.pontos();

        //o new vai instanciar a classe
        Classe jogador1 = new Classe(++num);
        Classe jogador2 = new Classe(++num);
        Classe jogador3 = new Classe(++num);

        jogador1.info();
        jogador2.info();
        jogador3.info();

        Classe.alerta = true;

        // jogador1.SetVidas(50);
        // jogador1.addVidas();
        // jogador1.addVidas();
        // jogador1.addVidas();
        // jogador1.addVidas();
        System.out.printf("Vidas do jogador 1: %d%n", jogador1.getVidas());
        // System.out.printf("Vidas do jogador 2: %d%n", jogador2.getVidas());
        // System.out.printf("Vidas do jogador 3: %d%n", jogador3.getVidas());


        // jogador1.num = 10;
        // jogador2.num = 5;
        // System.out.printf("%n%d",jogador1.num);
        // System.out.printf("%n%d",jogador2.num);
    }

}
