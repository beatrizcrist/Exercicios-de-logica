public class Celular {
    //caracteristicas = atributos
    String nome; 
    String sistemaOperacional;
    int armazenamento;
    float tamanhoTela;

    void ligar(int telefone){
        System.out.printf("%s ligando para %d%n", nome, telefone);
    }
    
    void infoCelular(){
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s%n",nome, tamanhoTela, armazenamento, sistemaOperacional);
    }

    void baixarAplicativo(String aplicativo){
        System.out.printf("Instalando o aplicativo %s no %s%n", aplicativo, nome);
    }

    void entrarAplicativo(String nomeAplicativo, int n1, int n2){
        if(nomeAplicativo.equals("calculadora")){
            System.out.println(calculadora(n1, n2));
        } else{
            System.out.printf("Entrando no aplicativo %s...", nomeAplicativo);
        }
    }

    int calculadora(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }
}
