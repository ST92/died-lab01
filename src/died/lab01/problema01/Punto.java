package died.lab01.problema01;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float nuevoValor) {
		this.x = nuevoValor;
	}

	public float getY() {
		return y;
	}

	public void setY(float nuevoValor) {
		this.y = nuevoValor;
	}
	
	public boolean equal(Punto otroPunto) {
		
		if(otroPunto == this) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
