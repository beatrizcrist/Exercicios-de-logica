import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        //for
        for(int cont = 0; cont  < 5; cont++){
            System.out.println("bia");
        }

        for(int cont2 = 5; cont2 > 0; cont2--){
            System.out.println(cont2);
        }

        //while
        int a = 0, max = ler.nextInt();
        while(a < max){
            System.out.println("oi");
            a++;
        }
        
        //do while
        int b = 0;
        do{
            System.out.println("bia");
            b++;
        }while(b < 0);
    }
}
