package ciclos;

import javax.swing.JOptionPane;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		String clave = "Pedro";
		String comparacion = "";
		
		do {
			comparacion = JOptionPane.showInputDialog("Introduce tu contraseņa por favor");
			
			if (clave.equals(comparacion)== false) {
				System.out.println("La contraseņa es incorrecta");
			}
			
		}	while (clave.equals(comparacion));
		
		System.out.println("La contraseņa es correcta");
		System.out.println(Math.random() *100);

	}
}


