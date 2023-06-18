package encapsulamento;

import encapsulamento.classes.PingPong;
import encapsulamento.classes.TiroAoAlvo;
import encapsulamento.classes.VideoGame;
import encapsulamento.classes.Xadrez;

public class jogo {
    public static void main(String[] args) {
        VideoGame xDevOne = new VideoGame();
        PingPong pingpong = new PingPong();

        //tem que ser nessa sequencia se nao da erro
        xDevOne.ligar(); 
        xDevOne.jogar(pingpong); //se fizer esse comando primeiro vai dar erro pq nao ligou o videogame antes
        xDevOne.fechar(); //se fizer esse comando primeiro vai dar erro pq nao ligou o videogame antes, se colocar ele em segundo vai mostrar que nao tem jogo rodando

        xDevOne.ligar();
        xDevOne.jogar(new Xadrez());
        xDevOne.fechar();

        xDevOne.ligar();
        xDevOne.jogar(new TiroAoAlvo());
        xDevOne.fechar();
    }
}
