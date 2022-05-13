import java.util.Scanner;

/*Escribe una aplicación que calcule el indice de masa corporal.
y que lance un mensaje según lo siguiente:

Si tiene un IMC entre 18.5 y 25: "Your weigh ratio is good"
si es menor de 18.5 o mayor de 25: "Your health is not good"*/

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		
		Scanner escan = new Scanner(System.in);
		System.out.println("Introduce tu peso en Kg: ");
		float peso = escan.nextFloat();
		
		System.out.println("Introduce tu Estatura en metros: ");
		float estatura = escan.nextFloat();
		
		float imc = peso / (estatura*2);
		
		//System.out.println(imc);
		
		if (imc >= 18.5 && imc <= 25) {
			System.out.println( "Your weigh ratio is good:  " + imc);			
		} else if (imc < 18.5 || imc > 25) {
			System.out.println("Your health is not good:  " + imc);
		}
		
		escan.close();
		
		
		
		
		
		
		

	}

}
