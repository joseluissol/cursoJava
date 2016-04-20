package es.coritel.java.EjerciciosInterfaces;

public class Triangulo implements Figuras {
	private int base;
	private int altura;


	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public double calculaArea() {
		return (this.base*this.altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		return this.base + 2 * (Math.sqrt(Math.pow(this.base / 2, 2)
				+ Math.pow(this.altura, 2)));
	}

}
