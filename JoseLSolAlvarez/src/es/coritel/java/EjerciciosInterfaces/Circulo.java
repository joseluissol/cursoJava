package es.coritel.java.EjerciciosInterfaces;

public class Circulo implements Figuras {

	private int radio;

	public Circulo(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*Math.pow(this.radio, 2);
	}

	@Override
	public double calculaPerimetro() {
		return Math.PI*this.radio;
	}

}
