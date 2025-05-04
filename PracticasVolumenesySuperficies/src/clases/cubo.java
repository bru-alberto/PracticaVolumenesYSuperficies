package clases;

public class cubo {

	double lado;
	
	public cubo() {
		this.lado = 1;
	}
	
	public cubo(double lado) {
		if (lado > 0)
			this.lado = lado;
		else
			throw new IllegalArgumentException("Error, lado negativo");
	}
	
	/**
	 * Calcula la superficie de un cubo
	 * @return la superficie del cubo
	 */
	public double superficie() {
		return Math.round((6 * Math.pow(this.lado, 2)) * 100.0) / 100.0;
	}
	
	/**
	 * Calcula el volumen de un cubo
	 * @returnel volumen de un cubo
	 */
	public double volumen() {
		return Math.round((Math.pow(this.lado, 3))* 100.0) / 100.0;
	}
}