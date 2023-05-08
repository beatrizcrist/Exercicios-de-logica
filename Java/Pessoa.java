

public class Pessoa {

    private int numero = 0;

    public String nome = "";
    private int idade = 0;
    private int maiorIdade = 18;

    public Pessoa(int numero){
        this.numero = numero;
        System.out.println("Uma nova pessoa nasceu!");
        System.out.printf("%d° pessoa a nascer hoje%n",numero);
    }

    public int getnumero(){
        return this.numero;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        if(this.idade >= maiorIdade){ 
            System.out.println("É maior de idade");
            return this.idade;
        } else{
            System.out.println("Não é maior de idade");
            return this.idade;
        }
    }

}
