package died.lab01.problema01;

import died.lab01.problema01.Punto;
import died.lab01.problema01.Recta;

public class App {
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(2,2);
		
		Recta r1 = new Recta(p1,p2);
		
		System.out.print("Pendiente de la recta R1: ");
		System.out.println(r1.pendiente());
		
		Punto p3 = new Punto(3,3);
		
		Recta r2 = new Recta(p2,p3);
		
		System.out.print("Es la misma recta? ");
		System.out.println(r2.equals(r1));
		
	}

}
