package died.lab01.problema01;

import died.lab01.problema01.Punto;

public class Recta {

	Punto p1;
	Punto p2;
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Recta() {
		this.p1 = this.p2;
	}
	
	public float pendiente() {
		if((this.p2.getX() - this.p1.getX()) != 0) {
			return ((this.p2.getY() - this.p1.getY())/(this.p2.getX() - this.p1.getX()));
		}
		else {
			return 0;
		}
	}
	
	public boolean paralela(Recta otraRecta) {
		if(this.pendiente() == otraRecta.pendiente()) {
			return true;
		}
		else return false;
	}
	
	public boolean equals(Object otraRecta) {
		if(otraRecta.getClass() == this.getClass()) {
			if(this.paralela((Recta) otraRecta)) {
				Recta tercerRecta = new Recta(((Recta) otraRecta).p1,this.p2);
				if((this.pendiente() == tercerRecta.pendiente()) 
						&& (((Recta) otraRecta).pendiente() == tercerRecta.pendiente())) {
					return true;
				}
				else return false;
			}
			else return false;
		}
		return false;
	}
}
