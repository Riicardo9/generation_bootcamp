package ciclos;

import javax.swing.JOptionPane;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		String clave = "Pedro";
		String comparacion = "";
		
		do {
			comparacion = JOptionPane.showInputDialog("Introduce tu contrase�a por favor");
			
			if (clave.equals(comparacion)== false) {
				System.out.println("La contrase�a es incorrecta");
			}
			
		}	while (clave.equals(comparacion));
		
		System.out.println("La contrase�a es correcta");
		System.out.println(Math.random() *100);

	}
}


