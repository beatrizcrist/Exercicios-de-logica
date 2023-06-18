package heranca.classes;

// toda vez que um objeto é criado, o java entende que esse objeto de maneira implicida que esse objeto extends de Object
//toda classe é uma estenção da classe Object
public class Serie extends Object{ //explicito
    private String nome;
    private int temporada;
    private int ano;
    
    //construor
    public Serie(String nome, int temporada, int ano) {
        this.nome = nome;
        this.temporada = temporada;
        this.ano = ano;
    }
    
    //metodos especificos
    // @ = notação em java
    // @Override = sobrescrição , ta pegando um metodo da classe mae Object e reescrevendo a função dele
    @Override
    public String toString(){
        String informacoes = String.format("Nome: %s (%d) - %d temporadas", nome, ano, temporada);
        return informacoes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
}
