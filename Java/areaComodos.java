import java.util.Scanner;

public class areaComodos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int area = 0, areaTotal = 0, comodos = 0, largura, comprimento;
        String continuar = "sim", nomeComodo;

        while(continuar.equals("sim")){
            System.out.println("Digite o nome do cômodo");
            nomeComodo = ler.nextLine();
            System.out.println("Digite a largura do cômodo");
            largura = ler.nextInt();
            System.out.println("Digite o comprimento do cômodo");
            comprimento = ler.nextInt();

            area = largura * comprimento;

            System.out.printf("A área do cômodo %s é %d%n",nomeComodo, area);
            ler.nextLine();

            areaTotal+=area;
            comodos++;
            System.out.println("Quer continuar a calcular novos cômodos? (sim/não)");
            continuar = ler.nextLine();
        }

        System.out.printf("Quantidade de cômodos lidos: %d%n", comodos);
        System.out.printf("A soma total da área dos comodos lidos é: %dm2", areaTotal);
    }
}
