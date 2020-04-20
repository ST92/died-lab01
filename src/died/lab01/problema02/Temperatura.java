package died.lab01.problema02;

public class Temperatura {

	Double grados;
	Escala escala;
	
	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(Double temperatura, Escala escala) {
		this.grados = temperatura;
		this.escala = escala;
	}
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados;
		}
		else {
			Double gradosAux;
			gradosAux = (this.grados - 32.0) * (0.55);
			return gradosAux;
		}
	}
	
	public Double asFarenheit() {
		if(this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}
		else {
			Double gradosAux;
			gradosAux = (this.grados*(1.8)) + 32.0;
			return gradosAux;
		}
	}
	
	public String toString() {
		if(this.escala == Escala.CELCIUS) {
			return Double.toString(this.grados).concat(" Fº");
		}
		else {
			return Double.toString(this.grados).concat(" Cº");
		}
	}
	
	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			switch (this.escala) {
			case CELCIUS:
				if(this.escala != temperatura.escala) {
					this.grados += temperatura.asCelcius();
				}
				else {
					this.grados += temperatura.grados;
				}
				break;
			case FAHRENHEIT:
				if(this.escala != temperatura.escala) {
					this.grados += temperatura.asFarenheit();
				}
				else {
					this.grados +=temperatura.grados;
				}
				break;
			}
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			switch (this.escala) {
			case CELCIUS:
				if(this.escala != temperatura.escala) {
					this.grados -= temperatura.asCelcius();
				}
				else {
					this.grados -= temperatura.grados;
				}
				break;
			case FAHRENHEIT:
				if(this.escala != temperatura.escala) {
					this.grados -= temperatura.asFarenheit();
				}
				else {
					this.grados -=temperatura.grados;
				}
				break;
			}
		}
	}
	
	
}
