import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		System.out.println("Introduce el numero de la operacion a realizar");
		System.out.println("1) Suma   2) Resta   3) Multiplicacion   4) Division");
		
		Scanner entrada = new Scanner(System.in);
		int seleccion = entrada.nextInt();
		
		System.out.println("Ingresa el primer numero");
		float numA = entrada.nextFloat();
		
		System.out.println("Ingresa el segundo numero");
		float numB = entrada.nextFloat();
		
		
		entrada.close();
		
		float resultado = 0;
		
		switch (seleccion){
		case 1:
			resultado = numA + numB;
			System.out.println("La suma es: " + resultado);
			break;
		case 2:
			resultado = numA - numB;
			System.out.println("La resta es: " + resultado);
			break;
		case 3:
			resultado = numA * numB;
			System.out.println("La multiplicación es: " + resultado);
			break;
		case 4:
			resultado = numA / numB;
			System.out.println("La división es: " + resultado);
			break;
		default: 
			System.out.println("Seleccion no valida");
	}
	}
}
