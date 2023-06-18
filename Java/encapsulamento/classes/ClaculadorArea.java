package encapsulamento.classes;

public class ClaculadorArea {
    /*
     quadrado, circulo
     circulo, quadrado
     quadarado, quadarado
     circulo, circulo
     */
    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB){
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}
