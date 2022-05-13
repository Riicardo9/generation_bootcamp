/*Crear una aplicación que reciba un int entre 1 y 10 y que regrese un mensaje según la calificación ingresada.


menos de 3 == "Failed!"
menos de 5 == "Insufficient!"
menor de 9 == "Good!"
10 == "Excellent!"

Mayor de 10 == "Grade outside range supported!" */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num = 11;
		
		if (num < 3) {
			System.out.println("Failed!");
		}
		if (num >= 3 && num < 5) {
			System.out.println("Insufficient!");
		}
		if (num >= 5 && num < 9) {
			System.out.println("Good!");
		}
		if (num == 10) {
			System.out.println("Excellent!");
		}
		if (num > 10) {
			System.out.println("Grade outside range supported!" );
		}

		
	}
}
