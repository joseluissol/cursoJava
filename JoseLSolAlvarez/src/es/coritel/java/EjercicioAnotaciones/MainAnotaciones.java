package es.coritel.java.EjercicioAnotaciones;

public class MainAnotaciones {

	public static void main(String[] args) {

		metodoPrueba();

	}
	@TiempoDeVida(tiempo=6)
	public static void metodoPrueba() {
		System.out.println("Metodo prueba.");
	}

}
