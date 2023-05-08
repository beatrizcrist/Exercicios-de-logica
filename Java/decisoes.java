public class decisoes {
    public static void main(String[] args){
        //if else
        int nota = 50;
        int faltas=10;
        int maxfalta=5;
        int media = 60;

        if(nota>media && faltas <= maxfalta){
            System.out.println("Aprovado");
        } else if(nota >= 40){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        //condição ternaria
        String res;
        res=(nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: "+res);

        int resposta;
        resposta=(nota >= media ? 1 : 0);
        System.out.println("Resultado: " + (resposta==1? "Aprovado":"Reprovado"));

        //switch
        int pos=7;
        switch(pos){
            case 1:
            System.out.println("Primeiro lugar");
            break;
            case 2:
            System.out.println("Segundo lugar");
            break;
            case 3:
            System.out.println("Terceiro lugar");
            break;
            case 4: case 5: case 6: 
            System.out.println("Premio de participação");
            break;
            default:
            System.out.println("Não ganhou premio");
            break;
        }

        System.out.println("Fim do programa");
    }
}
