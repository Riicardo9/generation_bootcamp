
public class ConversionDatos {

	public static void main(String[] args) {
		byte numByte = 10;
		short numShort = numByte;
		int numEntero = numShort;
		long numLong = numEntero;
		
		//Casteo o parseo
		//Al hacer casteo cuidar que al convertir no sobrepase el valor soportado, por que se desborda 
		int otroInt = (int) numLong;
		short otroShort = (short) otroInt;
		byte otroByte = (byte) otroShort;
		
		
		System.out.println(otroShort);

	}

}
