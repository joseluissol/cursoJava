package es.coritel.java.EjerciciosInterfaces;

public class Cuadrado implements Figuras {

	private int lado;

	public Cuadrado(int lado) {

		this.lado = lado;
	}




	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}



	@Override
	public double calculaArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double calculaPerimetro() {
		return this.lado * 4;
	}

}
