// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
import java.util.Scanner;

public class reajusteSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int salario, reajuste, novoSalario;

        System.out.println("Digite o seu salário atual:");
        salario = ler.nextInt();
        System.out.println("Digite o percentual de reajuste:");
        reajuste = ler.nextInt();

        novoSalario = (salario / reajuste) + salario;

        System.out.printf("Salario com reajuste: %d",novoSalario);
    }
}
