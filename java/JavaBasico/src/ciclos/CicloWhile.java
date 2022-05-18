package ciclos;

import javax.swing.JOptionPane;

public class CicloWhile {

	public static void main(String[] args) {
		
		/*
		int condicion = 0;
		while (condicion < 5 ) {
			System.out.println("Hola");	
			condicion ++;
		} */
		
		
		//verificar contraseña
		String clave = "Pedro";
		String comparacion = "";
		
		while (clave.equals(comparacion) == false) {
			comparacion = JOptionPane.showInputDialog("Introduce tu contraseña por favor");
			
			if (clave.equals(comparacion)== false) {
				System.out.println("La contraseña es incorrecta");
				
			}
			
		}
		
		System.out.println("La contraseña es correcta");

	}

}
