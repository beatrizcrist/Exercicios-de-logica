public class celulares {
    public static void main(String[] args) {
        //Iphone 12, tela de 6.1', 256gb
        //Galaxy Note 20 Ultra, tela de 6.9', 256gb
        //Xiaomi Mi 11 Pro, tela de 6.81', 128gb

        //declarando/criando um objeto do tipo Celular = instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular(); //objeto celularB
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC;
        celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.armazenamento = 128;
        celularC.sistemaOperacional = "Android";

        celularA.infoCelular();
        celularB.ligar(5422284);
        celularC.baixarAplicativo("WhatsApp");
        celularA.entrarAplicativo("calculadora", 4, 8);
    }
}
