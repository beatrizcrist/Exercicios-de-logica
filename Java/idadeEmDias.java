// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 
import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anos=0,idade=0,dias=0,meses=0;

        System.out.println("Digite sua idade em anos:");
        anos = ler.nextInt();
        System.out.println("Digite quantos meses se passaram desde seu ultimo aniversário:");
        meses = ler.nextInt();
        System.out.println("Digite quantos dias se passaram desde seu ultimo mesversário:");
        dias = ler.nextInt();

        idade = (anos*365) + (meses*30) + dias;

        System.out.printf("Você está vivo a %d dias",idade);
    }
}
