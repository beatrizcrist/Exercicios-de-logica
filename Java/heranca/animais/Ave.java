package heranca.animais;

//nao pode ter heranças multiplas, tem que fazer uma classe que herda de outra classe, igual a essa
public class Ave extends Animal{

    public Ave(String nome) {
        super(nome);
    }
    
    public void voar(){
        System.out.printf("%s voou\n", getNome());
    }

}
