package manzando;

public class exercicioManzandoPg46H {
	public static void main(String[] args) {
		int celsius = 10, fahrenheit = 0;
	    while(celsius <= 100){
	        fahrenheit = (9 * celsius + 160) / 5;
	        System.out.println(celsius+"° graus celsius = " +fahrenheit+"° graus fahrenheit");
	        celsius+=10;
	    }
	}
}
