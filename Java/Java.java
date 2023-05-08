public class Java {
    public static void main(String[] args) {
        //nao faz quebra a linha
        System.out.print("bia");
        //faz qubra de linha
       System.out.println("curso java"); 
        //entra com o tipo de dados que deseja utilizar, %S=texto, %d=numero
       System.out.printf("nome:%s - ano:%d", "bia", 2023);

       //comandos de entrada
       //variaveis, int = inteiro
       int num=100;
       String nome="beatriz";
       int n1=10, n2=10, n3=10;
       int soma = n1+n2+n3;

       System.out.printf("%nvariavel:%d%nNome:%s",num,nome);
       System.out.printf("%nsoma de:%d, %d, %d é igual a :%d",n1,n2,n3,soma);
    }
}
