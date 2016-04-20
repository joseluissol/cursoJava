package es.coritel.java.EjercicioAnotaciones;

public class PruebaMain {

	public static void main(String[] args) {

		MainAnotaciones mainAnotaciones = new MainAnotaciones();
		Class clase = mainAnotaciones.getClass();
		System.out.println(clase.getAnnotations());

	}

}
