// Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito: - Ter no mínimo 65 anos de idade. - Ter trabalhado no mínimo 30 anos. - Ter no mínimo 60 anos  e ter trabalhado no mínimo 25 anos. Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria'  ou  'Não requerer'

import java.util.Scanner;

public class aposentadoria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigo, anoNascimento, anoContratado, idade, tempoTrabalho;

        System.out.println("Digite o número (código) do colaborador:");
        codigo = ler.nextInt();
        System.out.println("Digite o ano de nascimento do colaborador:");
        anoNascimento = ler.nextInt();
        System.out.println("Digite o ano de ingresso na empresa:");
        anoContratado = ler.nextInt();

        idade = 2023 - anoNascimento;
        tempoTrabalho = 2023 - anoContratado;

        System.out.printf("Idade o colaborador: %d%n",idade);
        System.out.printf("Tempo de trabalho do colaborador: %d%n",tempoTrabalho);

        if(idade >= 65 || tempoTrabalho >= 30){
            System.out.println("Requerer aposentadoria");
        } else if(idade >= 60 && tempoTrabalho >= 25){
            System.out.println("Requerer aposentadoria");
        } else{
            System.out.println("Não requerer aposentadoria");
        }
    }
}
