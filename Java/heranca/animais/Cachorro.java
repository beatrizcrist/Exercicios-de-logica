package heranca.animais;

// extends = essa classe vai herdar coisas da classe Animal
public class Cachorro extends Animal{
    //cahamdo o construtor da classe superior
    public Cachorro(String nome){
        super(nome); //o super sempre tem que estar na primeira linha

    }

    public void latir(){
        System.out.printf("%s latiu\n", getNome());
    }
    
    public void lamber(){
        System.out.printf("%s lambeu\n", getNome());
    }
}
