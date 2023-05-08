//por padrao as classes sao salvas com letra maiuscula 
//a representação de um objeto
//istanciar é criar um objeto na classe
public class Classe {
    //variaveis dentro da classe = atributos da classe
    //public = pode modificar o valor desse atributo fora da classe
    // public int num = 0;
    // public int vidas = 0;
    
    //private = so pode ter acesso a ele dentro da classe
    //geralmente deixamos a variavel como private para nao correr risco de elas fugirem do controle
    
    
    static boolean alerta = false;
    static int qtdJoggadores = 0;
    static int pontosJogadores = 0;
    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;

    static void pontos(){
        pontosJogadores+=10;
    }

    //metodo construtor: metodo que vai ser executadi assim que a classe for instanciada, nao vai ter retorno entao nao precisa falar o tipo, precisa ter o mesmo nome da classe
    public Classe(int num){
        this.num=num;
        this.SetVidas(1);
        System.out.printf("Jogador número %d criado%n", num);
        qtdJoggadores++;
    }

        //get = obtem valor
        public int getVidas(){
            return this.vidas;
        }

        //set = atribui um valor para a classe private
        private void SetVidas(int vidas){
            if (vidas > maxVidas) {
                this.vidas = maxVidas;
            } else if(vidas < 0){
                this.vidas = 0;
            } else{
               this.vidas=vidas; 
            }     
        }

        public void addVidas(){
            if (this.vidas < maxVidas) {
                this.vidas ++;
            }    
        }

        public void info(){
            System.out.printf("%nJogador: %d%n", this.num);
            System.out.printf("%nVidas: %d%n",this.vidas);
            System.out.printf("%nAlerta: %s%n", alerta ? "sim" : "nao");
            System.out.printf("%nPontos Jogadores: %d%n", qtdJoggadores);
            System.out.printf("%nJogadores: %d%n", pontosJogadores);
            System.out.println("---------------------------------------");
        }
}
