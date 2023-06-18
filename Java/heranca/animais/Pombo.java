package heranca.animais;

public class Pombo extends Ave{

    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPru(){
        System.out.printf("%s fez Pruuuuuuuuuuu\n", getNome());
    }

    public void enviarCarta(){
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    
}
