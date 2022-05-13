import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		
		//creamos objeto que viene de la clase Scanner, se pone .in para decirle que va a leer del teclado
		Scanner escaner = new Scanner(System.in);
		System.out.println("Escribe un numero");
	
		
		// int numero = 10;
		
		int numero = escaner.nextInt();
		
		numero++;
		
		System.out.println(numero);
		
		if (numero < 10) {
			System.out.println("El numero es menor a 10");
			
		}

	}

}
