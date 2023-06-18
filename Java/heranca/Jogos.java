package heranca;

import heranca.jogo.Arqueiro;
// import heranca.jogo.Personagem;

public class Jogos {
    public static void main(String[] args) {
        //nao é possivel criar objetos de uma classe abstrata
        // Personagem personagem = new Personagem("Bia");
        // System.out.println(personagem);
        // personagem.atacar();

        Arqueiro arqueiro = new Arqueiro("Beatriz");
        System.out.println(arqueiro);
        arqueiro.atacarComArma();
        arqueiro.atacarSemArma();
    }
}
