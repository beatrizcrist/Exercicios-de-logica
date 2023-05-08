// Ler  um  valor  e  escrever  a  mensagem  É  MAIOR  QUE  10!  se  o  valor  lido  for  maior  que  10,  caso contrário escrever NÃO É MAIOR QUE 10! 

import java.util.Scanner;

public class maiorQue10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.println("Digite um número:");
        valor = ler.nextInt();

        if (valor > 10){
            System.out.println("É MAIOR QUE 10!");
        } else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
