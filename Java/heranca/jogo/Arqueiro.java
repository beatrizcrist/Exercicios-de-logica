package heranca.jogo;

 //quando colocado final em classes, nenhuma classe pode herdar dele
public final class Arqueiro extends Personagem{
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco longo";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();
        String informacoesArqueiro = String.format(" - Arma: %s", arma);
        String informacoes = informacaoPersonagem + informacoesArqueiro;
        return informacoes;
    }

    @Override
    public void atacarComArma() {
        System.out.println("O arqueiro atacou com "+arma);
    }
    
}
