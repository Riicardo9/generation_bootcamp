package ciclos;

import javax.swing.JOptionPane;

/*Ejercicio
Validaci�n de correo

Escribe un programa que reciba un correo y  que, usando un ciclo for, eval�e si el correo contiene un caracter de '@'.
Si lo tiene, el programa debe mostrar en consola:
"Es un correo v�lido"

Si no lo tiene, el programa debe mostrar:
"No es un correo v�lido" */


public class Ejercicio2 {

	public static void main(String[] args) {
		
		String entradaEmail = JOptionPane.showInputDialog("Introduce un correo");
				
		for (int i=0; i<entradaEmail.length(); i++) {
			
			if(entradaEmail.contains("@")) {
				System.out.println("Es un correo v�lido");
			} else {
				continue;
			}
		}
	}
}
