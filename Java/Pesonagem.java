import java.util.Random;

public class Pesonagem {
    String nome;
    int nivel;
    int forca;


    //metodos sao acoes que o objeto vai realizar

    //void = nao esta retornando nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.%n", nome, nivel, forca);
    }

    int calcularDano(){
        //exibe numeros aleatorios
        Random gerador = new Random();

        //1 ate 20
        //nextInt = 0 ate 19
        //1 + gerador = para fazer com que os numeros aleatorios comecem pelo 1
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    //metod que nao retorna nada e recebe o parametro do tipo string
    void atacar(String alvo, int maxDanoAlvo, String habilidade){
        //camando metodo dentro de outro metodo
        int danoCausado = calcularDano();
        
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.%n", nome, alvo, danoCausado);

            
        } else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.%n", nome, habilidade, alvo, danoCausado);
        }
        
        if(maxDanoAlvo >= danoCausado){
            System.out.printf("%s não morreu", alvo);
        } else{
            System.out.printf("%s morreu!", alvo);
        }
        
    }
}
