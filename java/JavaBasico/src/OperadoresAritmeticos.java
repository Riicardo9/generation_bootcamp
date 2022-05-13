
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int suma = 9 + 9;
		int resta = 9 - 3;
		int multiplicacion = 3 * 3;
		int division = 9 / 3;
		int modulo = 5 % 2;
		
		float numero = 10;
		numero++;
		++numero;
		
		numero--;
		--numero;
		
		numero += 2;
		numero -= 10;
		numero *= 6;
		numero /= 7f; //peligro
		numero = (float) numero / 7f;
		
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
		System.out.println(modulo);
		System.out.println(numero);

	}

}
