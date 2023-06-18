package encapsulamento.classes;

public class Circulo implements FiguraGeometrica{
    //atributos
    private int raio;

    //construtor
    public Circulo(int raio){
        this.raio = raio;
    }
    
    //metodos especificos
    public double calcularArea(){
        // area = pi * raio ao quadrado
        return Math.PI * Math.pow(raio, 2);    
    }

    //metodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
