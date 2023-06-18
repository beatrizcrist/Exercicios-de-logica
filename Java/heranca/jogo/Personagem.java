package heranca.jogo;

/* 
private, public, protected =  modificador de acesso
* final, abstract = modificadores sem acesso
 */

// so pode ter metodos abstratos em uma classe abstrata 
//nao é possivel criar objetos de uma classe abstrata
public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (nível: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }

    //final = faz com que esse metodo nao seja modificado de forma alguma
    public final void atacarSemArma(){
        System.out.println("O personagem atacou sem arma!");
    }

    public void atacar(){
        System.out.println("O personagem atacou!");
    }

    //abstract =  nao é implementado nessa classe, mas as hedeiras tem que ter, nao pode ter corpo de metodo ou {}
    //parecido com o comportamento de interface, tem que ter todos os metodos abstratos nas classes herdeiras
    public abstract void atacarComArma();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
}
