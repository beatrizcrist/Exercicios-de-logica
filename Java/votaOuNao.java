// Ler  o  ano  atual  e  o  ano  de  nascimento  de  uma  pessoa.  Escrever  uma mensagem  que  diga  se  ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 

import java.util.Scanner;

public class votaOuNao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoAtual, anoNascimento, idade;

        System.out.println("Digite o ano atual:");
        anoAtual = ler.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        anoNascimento = ler.nextInt();

        idade = anoAtual - anoNascimento;

        if(idade > 16){
            System.out.println("Você já pode votar");
        } else{
            System.out.println("Você não pode votar");
        }
    }
}
