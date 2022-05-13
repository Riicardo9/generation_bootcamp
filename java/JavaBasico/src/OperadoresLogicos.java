import java.util.Objects;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// comentario una sola linea
		/*comentario 
		 * de
		 * varias 
		 * lineas
		 * */	
		int num = 9;
		num = 45;
		num = Integer.parseInt("4");
		System.out.println(num);
		
		int num1, num2;
		num1 = 10;
		num2 = 20;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		//Operadores de asignacion
		System.out.println(num1 == num2);
		
		//.equals. Revisa igualdal
		System.out.println(Objects.equals(num1,num2));
		
		//Operadores de comparacion <, >, <=, >=, !=
		int num3 = 15, num4 = 20;
		System.out.println(num3 < num4);
		System.out.println(num3 > num4);
		System.out.println(num3 <= num4);
		System.out.println(num3 >= num4);
		System.out.println(num3 != num4);
		
		if(num3 < num4) {
			System.out.println("num3 es menor");
		} else {
			System.out.println("num3 es mayor");
		}
		
		boolean comparacion = num3 != num4;
		System.out.println(comparacion);
		
		
		//Operadores logicos
		//AND = &&
		//OR = ||
		//NOT !
		System.out.println(true && true);
		System.out.println(false || false);
		
		
		
	}

}
