package es.coritel.java.EjerciciosInterfaces;

public class FigurasMain {

	public static void main(String[] args) {

		Figuras circulo = new Circulo(2);
		Figuras cuadrado = new Cuadrado(3);
		Figuras triangulo = new Triangulo(3, 4);

		System.out.println(circulo.calculaArea());
		System.out.println(circulo.calculaPerimetro());
		System.out.println(cuadrado.calculaArea());
		System.out.println(cuadrado.calculaPerimetro());
		System.out.println(triangulo.calculaArea());
		System.out.println(triangulo.calculaPerimetro());

	}

}
