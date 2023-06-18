package encapsulamento.classes;

public class TiroAoAlvo implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Voce escolheu jogar Tiro ao alvo");
        System.out.println("Carregando o jogo");
        System.out.println("Se conectando ao servidor");
        System.out.println("Carregando partida");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar o progresso do jogo");
        System.out.println("Sair da partida");
        System.out.println("Sair do jogo Tiro ao alvo \n");
    }
    
}
