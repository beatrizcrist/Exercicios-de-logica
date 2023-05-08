// Escreva  um  algoritmo  que  leia  as  idades  de  2  homens  e  de  2  mulheres (considere  que  as  idades dos  homens  serão  sempre  diferentes  entre  si,  bem  como  as  das  mulheres).  Calcule  e  escreva  a  soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova,  e  o  produto  das  idades  do  homem  mais novo com a mulher mais velha. 

import java.util.Scanner;

public class somaIdades {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2, soma, produto;

        System.out.println("Digite a idade da primeira mulher:");
        idadeMulher1 = ler.nextInt();
        System.out.println("Digite a idade da  segunda mulher:");
        idadeMulher2 = ler.nextInt();
        System.out.println("Digite a idade do primeiro homem:");
        idadeHomem1 = ler.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        idadeHomem2 = ler.nextInt();

        if(idadeHomem1 > idadeHomem2){
            if(idadeMulher1 < idadeMulher2){
                soma = idadeHomem1 + idadeMulher1;
                produto = idadeHomem2 * idadeMulher2;
                System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é: %d%n",soma);
                System.out.printf("A produto das idades do homem mais novo com a mulher mais velha: %d",produto);
            } else{
                soma = idadeHomem1 + idadeMulher2;
                produto = idadeHomem2 * idadeMulher1;
                System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é: %d%n",soma);
                System.out.printf("A produto das idades do homem mais novo com a mulher mais velha: %d",produto);
            }
        } else{
            if(idadeMulher2 < idadeMulher1){
                soma = idadeHomem2 + idadeMulher2;
                produto = idadeHomem1 * idadeMulher1;
                System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é: %d%n",soma);
                System.out.printf("A produto das idades do homem mais novo com a mulher mais velha: %d",produto);
            } else{
                soma = idadeHomem2 + idadeMulher1;
                produto = idadeHomem1 * idadeMulher2;
                System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é: %d%n",soma);
                System.out.printf("A produto das idades do homem mais novo com a mulher mais velha: %d",produto);
            }
        }
    }
}
