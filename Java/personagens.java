public class personagens {
    public static void main(String[] args) {
        Pesonagem heroi = new Pesonagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();
        //chamei o metodo atacar e passei o argumento de quem ele vai atacar e que habilidade ele vai usar
        heroi.atacar("Hydra", 30, "Soco");
    }
}
