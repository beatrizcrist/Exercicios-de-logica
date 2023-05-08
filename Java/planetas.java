public class planetas {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta();
        planeta1.nomePlaneta = "Mercúrio";
        planeta1.diametro = 4879;
        planeta1.distanciaDoSol = "57 910 000 km";
        planeta1.duracaoDia = "58 dias 15 horas e 30 minutos";

        Planeta planeta2 = new Planeta();
        planeta2.nomePlaneta = "Vênus";
        planeta2.diametro = 12104;
        planeta2.distanciaDoSol = "108 200 000 km";
        planeta2.duracaoDia = "116 dias 18 horas e 0 minutos";

        Planeta planeta3 = new Planeta();
        planeta3.nomePlaneta = "Terra";
        planeta3.diametro = 12742;
        planeta3.distanciaDoSol = "149 600 000 km";
        planeta3.duracaoDia = "23 horas e 59 minutos";

        Planeta planeta4 = new Planeta();
        planeta4.nomePlaneta = "Marte";
        planeta4.diametro = 6779;
        planeta4.distanciaDoSol = "227 900 000 km";
        planeta4.duracaoDia = "1 dia 0 horas e 37 minutos";

        Planeta planeta5 = new Planeta();
        planeta5.nomePlaneta = "Júpiter";
        planeta5.diametro = 139822;
        planeta5.distanciaDoSol = "778 500 000 km";
        planeta5.duracaoDia = "9 horas e 56 minutos";

        Planeta planeta6 = new Planeta();
        planeta6.nomePlaneta = "Saturno";
        planeta6.diametro = 116464;
        planeta6.distanciaDoSol = "1.429.400.000 km";
        planeta6.duracaoDia = "10 horas e 42 minutos";

        Planeta planeta7 = new Planeta();
        planeta7.nomePlaneta = "Urano";
        planeta7.diametro = 50724;
        planeta7.distanciaDoSol = "2,871 x 10^9 km";
        planeta7.duracaoDia = "17 horas e 14 minutos";

        Planeta planeta8 = new Planeta();
        planeta8.nomePlaneta = "Netuno";
        planeta8.diametro = 49244;
        planeta8.distanciaDoSol = "4,495 x 10^9 km";
        planeta8.duracaoDia = "16 horas e 6 minutos";

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta1.nomePlaneta, planeta1.diametro, planeta1.distanciaDoSol, planeta1.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta2.nomePlaneta, planeta2.diametro, planeta2.distanciaDoSol, planeta2.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta3.nomePlaneta, planeta3.diametro, planeta3.distanciaDoSol, planeta3.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta4.nomePlaneta, planeta4.diametro, planeta4.distanciaDoSol, planeta4.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta5.nomePlaneta, planeta5.diametro, planeta5.distanciaDoSol, planeta5.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta6.nomePlaneta, planeta6.diametro, planeta6.distanciaDoSol, planeta6.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta7.nomePlaneta, planeta7.diametro, planeta7.distanciaDoSol, planeta7.duracaoDia);
        System.out.println("-----------------------------------------------");

        System.out.printf("Nome do planeta: %s%nDiâmetro do planeta: %dkm%nDistância do Sol: %s%nDuração do dia: %s%n", planeta8.nomePlaneta, planeta8.diametro, planeta8.distanciaDoSol, planeta8.duracaoDia);
        System.out.println("-----------------------------------------------");
    }
}
