package ciclos;

import javax.swing.JOptionPane;

/*Ejercicio
Validación de correo

Escribe un programa que reciba un correo y  que, usando un ciclo for, evalúe si el correo contiene un caracter de '@'.
Si lo tiene, el programa debe mostrar en consola:
"Es un correo válido"

Si no lo tiene, el programa debe mostrar:
"No es un correo válido" */


public class Ejercicio2 {

	public static void main(String[] args) {
		
		String entradaEmail = JOptionPane.showInputDialog("Introduce un correo");
				
		for (int i=0; i<entradaEmail.length(); i++) {
			
			if(entradaEmail.contains("@")) {
				System.out.println("Es un correo válido");
			} else {
				continue;
			}
		}
	}
}
