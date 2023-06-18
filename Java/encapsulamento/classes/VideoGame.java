package encapsulamento.classes;

public class VideoGame {
    private Jogo jogo; //false
    private boolean estaLigado; //null

    public void ligar(){
        System.out.println("Ligando o video game");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if(estaLigado == true){ 
            System.out.println("Iniciando o jogo...");
            this.jogo = jogo;
            jogo.jogar();
        } else{
            System.out.println("O videogame esta desligado");
        }
    }

    public void fechar(){
        if(estaLigado == true){ 
            //ver se iniciou o jogo
            boolean temJogoRodando = jogo != null;
            if(temJogoRodando){
                System.out.println("Fechando o jogo...");
                jogo.fechar();
                jogo = null; //definindo que nao tem jogo rodando
            } else{
                System.out.println("Não tem jogo rodando");
            }
            
        } else{
            System.out.println("O videogame esta desligado");
        }

            // if(jogo != null){
            //     jogo.fechar();
            // }
    }
}
