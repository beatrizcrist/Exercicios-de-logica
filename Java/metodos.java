public class metodos {
    //modificador de acesso, retorno, nome, parametro
    public static void main(String[] args) {
        //metodos sao basicamente funcoes da classe
        //o main é um metodo
        //metodo so vai ser executado se ele for chamado
        bia();
        for(int i = 0; i< 10;i++){
            bia();
        }

        msg("Bom dia", 2);
        msg("Boa tarde", 3);
        msg("Boa noite", 4);

        int r;
        r = soma2(5,6);
        System.out.println(r);
        System.out.println(soma2(7,7));

        System.out.println(soma(1,8,3,4));
        System.out.println(soma(1.5,8.8));

    }

    //acesso a esse metodo fora de classe
    //void = nao retorna nada
    public static void bia(){
        System.out.println("Bia");
    }

    //parametro de entrada m para esse método, pode ter varios parametros
    public static void msg(String m, int l){
        for(int i= 0; i<l;i++){
            System.out.println(m);
        }    
    }

    //retorna um valor inteiro
    public static int soma2(int n1, int n2){
        int res=n1+n2;
        //quanto o parametro nao é void precisa cplocar o return
        return res;
    }

    

    //sobrecarca de metodos: metodos com mesmo nome mas recebe um tipo de valor diferente

    //recebe varios números, como se fosse um array
    public static int soma(int... numeros){
        int res = 0;
        for(int n:numeros){
            res +=n;
        }
        return res;
    }

    public static Double soma(Double... numeros){
        Double res = 0.0;
        for(Double n:numeros){
            res +=n;
        }
        return res;
    }
}
