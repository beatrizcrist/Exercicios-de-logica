public class FestaVip {
    //se nao informar o modificador, por padrao o java colocar o defaul - so é visivel para classes que estao no mesmo pacote
    //importante sempre colocar um modificador de acesso para nao dar problema depois
    //sempre bom colocar as informaçoes como private poe segurança
    private int quantidadeCafe = 30;
    private int quantidadeSalgados = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    //so quem é vip pode comer e beber
    //modificador> retorno-metodo> nome-metodo
    private void beberCafe(){
        quantidadeCafe--;
        System.out.println("Bebeu 1 xicara de café");
    }

    private void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
