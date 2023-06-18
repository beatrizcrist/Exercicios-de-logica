package heranca.animais;

// herda da classe Ave, que herda da classe Animal
public class Dragao extends Ave{
    
    public Dragao(String nome){
        super(nome);
    }

    public void soltarFogo(){
        System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }

}
