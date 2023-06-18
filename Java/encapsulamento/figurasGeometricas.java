package encapsulamento;
// 4 pilares de poo
// E - encapsulamento: criar um padrao de codigo
// H - herança: classes que herdam informações de outras classes
// P - polimorfismo: um objeto pode se comprortar de formas diferentes para uma determinada ação
// A - abstração: pegar informações que são relevantes

import encapsulamento.classes.Circulo;
import encapsulamento.classes.ClaculadorArea;
import encapsulamento.classes.Quadrado;

public class figurasGeometricas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        // double area = circulo.calcularArea();
        // System.out.println(area);

        Quadrado quadrado = new Quadrado(5);
        // System.out.println(quadrado.calcularArea());

        ClaculadorArea calculador = new ClaculadorArea();
        System.out.println(calculador.somarAreas(quadrado, circulo));
    }
}
