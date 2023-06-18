package encapsulamento.classes;

public class Quadrado implements FiguraGeometrica{
    //atributo
    private int lado;
    
    //constutor
    public Quadrado(int lado){
        this.lado = lado;
    }

    //metodos especificos
    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    //metodos getters e setters
    public int getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
}
