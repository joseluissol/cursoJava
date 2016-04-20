package es.coritel.java.EjerciciosExcepciones;

public class MainExcepcion {

	public static void main(String[] args) {
		try {
			throw new ExcepcionPersonalizada();
		} catch (ExcepcionPersonalizada ep) {
			System.out.println(ep.getMessage());
		}
		System.out.println();

		try {
			throw new ExcepcionPersonalizada("JLSA Excepcion");
		} catch (ExcepcionPersonalizada ep) {
			ep.printStackTrace();
		}

		//throw new ExcepcionPersonalizada();
	}

}
