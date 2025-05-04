package clases;

public class Cilindro {

	double altura, radio;
	final double PI = 3.14;
	
	public Cilindro(double a, double r) {
		if (a > 0 && r > 0 ) {
			this.altura = a;
			this.radio = r;
		}
		
		else
			throw new IllegalArgumentException("Error, altura o radio negativo");
	}
	
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/**
	 * Calcula la superficie de un cilindro
	 * @return la superficie de un cilindro
	 */
	public double superficie() {
		return Math.round((2*PI*this.radio * (this.radio + this.altura)) * 100.0) / 100.0;
	}
	
	/**
	 * Calcula el volumen de un cilindro
	 * @return el volumen de un cilindro
	 */
	public double volumen() {
		return Math.round((PI * Math.pow(this.radio, 2) *this.altura) * 100.0) / 100.0;
	}
	
}
