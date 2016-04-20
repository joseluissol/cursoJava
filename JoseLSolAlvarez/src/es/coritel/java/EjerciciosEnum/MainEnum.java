package es.coritel.java.EjerciciosEnum;

import java.util.Scanner;

public class MainEnum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion = null;
		CiclosFormativos cf;

		System.out.println("Seleccione una opción: ");
		for (CiclosFormativos cfor : CiclosFormativos.values()){
			System.out.println(cfor);
		}
		opcion = sc.nextLine().toUpperCase();
		try {
			cf = CiclosFormativos.valueOf(opcion);

			/*Con esta funcion pasamos de un string con la opcion
			* escrita en mayuscula a un enum, lanza IllegalArgumentException
			* si la opcion no esta entre los Enum.
			*/


			switch (cf) {
			case INFANTIL:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.INFANTIL.getCursos()
						+ " cursos.");
				break;
			case PRIMARIA:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.PRIMARIA.getCursos()
						+ " cursos.");
				break;
			case SECUNDARIA:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.SECUNDARIA.getCursos()
						+ " cursos.");
				break;
			case BACHILLER:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.BACHILLER.getCursos()
						+ " cursos.");
				break;
			case GRADOMEDIO:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.GRADOMEDIO.getCursos()
						+ " cursos.");
				break;
			case GRADOSUPERIOR:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.GRADOSUPERIOR.getCursos()
						+ " cursos.");
				break;
			case GRADOUNIVERSITARIO:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.GRADOUNIVERSITARIO.getCursos()
						+ " cursos.");
				break;
			case MASTER:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.MASTER.getCursos()
						+ " cursos.");
				break;
			case DOCTORADO:
				System.out.println("Tiene un total de "
						+ CiclosFormativos.DOCTORADO.getCursos()
						+ " cursos.");
				break;
			default:
				break;
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Has seleccionado una opcion incorrecta.");
		}
		sc.close();
	}

}