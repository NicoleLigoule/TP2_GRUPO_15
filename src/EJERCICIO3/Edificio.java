package EJERCICIO3;

public class Edificio {
	private double superficie;

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public Edificio(double superficie) {
		this.superficie = superficie;
	}

	public Edificio() {
		this.superficie =-1;
	}

	@Override
	public String toString() {
		return "superficie: " + superficie + " ";
	}

}
