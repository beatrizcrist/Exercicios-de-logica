package heranca;

import heranca.animais.Cachorro;
import heranca.animais.Dragao;
import heranca.animais.Gato;
import heranca.animais.Pombo;

public class Animais {
    public static void main(String[] args) {
        Cachorro cachorro =  new Cachorro("Mel");
        cachorro.beber();
        cachorro.latir();

        Gato gato = new Gato("Mingal");
        gato.comer();
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco");
        dragao.soltarFogo();
        dragao.voar();

        Pombo pombo = new Pombo("Pombinha");
        pombo.enviarCarta();
        pombo.fazerPru();
        pombo.voar();
    }
}
