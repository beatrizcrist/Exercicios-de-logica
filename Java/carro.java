// O  custo  de  um  carro  novo  ao  consumidor  é  a  soma  do  custo  de  fábrica  com  a  porcentagem  do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja  de  28%  e  os  impostos  de  45%,  escrever  um  algoritmo  para  ler o  custo  de  fábrica  de  um  carro, calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double deFabrica, carro;

        System.out.println("Digite o custo de fábrica do carro:");
        deFabrica = ler.nextInt();

        carro = (deFabrica * 0.73) + deFabrica;

        System.out.printf("O preço final do carro para o consumidor é: R$%f ",carro);
    }
}
