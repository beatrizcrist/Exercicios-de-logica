public class humanos {
    public static void main(String[] args) {
        Humano humano = new Humano();

        // modificar = setNomeVarialver
        // pegar = getNomeVariavel
        humano.setNome("Bia");
        humano.setIdade(20);
        humano.setAltura(1.73);

        System.out.println(humano.getNome());
        System.out.println(humano.getIdade());
        System.out.println(humano.getAltura());
    }
}
