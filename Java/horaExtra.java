// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de  40  horas  receberá  hora  extra,  cujo  cálculo  é  o  valor  da  hora  regular  com  um  acréscimo  de  50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)

import java.util.Scanner;

public class horaExtra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int horasTrabalhadas, salarioHora;
        double horaExtra, salario, total;

        System.out.println("Digite o número de horas trabalhadas no mês:");
        horasTrabalhadas = ler.nextInt();
        System.out.println("Digite o salário por hora trabalhada:");
        salarioHora = ler.nextInt();

        if(horasTrabalhadas > 160){
            horaExtra = (horasTrabalhadas - 160);
            total = (horaExtra*salarioHora)*1.5;
            salario = total+(salarioHora *160);
            System.out.printf("O salário total do funcionário é R$%f",salario); 
        } else{
           salario = horasTrabalhadas * salarioHora;
        System.out.printf("O salário total do funcionário é R$%f",salario); 
        }  
    }
}
