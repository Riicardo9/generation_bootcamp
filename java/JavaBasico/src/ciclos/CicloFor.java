package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		
		/*
		for(int i=0; i<5; i++) {
			System.out.println("Hola " + i);
		}
		
		for (int j=5; j>0; j--) {
			System.out.println("Hola2 " + j);
			
		}
		for (int i=0; i<20; i+=2) {
			System.out.println("Hola3 " + i);
			
		} */
		
		for (int i=0; i<10; i++) {
			if(i%2 == 0) {
				continue; //se salta esa iteracion
			}
			
			System.out.println(i);
		}
		
		for (int i=0; i<10; i++) {
			if(i%2 == 1) {
				break; //termina el ciclo
			}
			
			System.out.println(i);
		}
		

	}

}
