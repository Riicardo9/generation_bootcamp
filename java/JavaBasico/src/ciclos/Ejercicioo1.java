package ciclos;
import javax.swing.JOptionPane;

public class Ejercicioo1 {
	
	public static void main(String[] args) {
		
		int numBase = 9;
		String numEntrada = "";
		
		do {
			numEntrada = JOptionPane.showInputDialog("Introduce un numero");
			
		}	while (numBase != Integer.parseInt(numEntrada));
		
		System.out.println("Felicidades, adivinaste el número.");
	}          
}
