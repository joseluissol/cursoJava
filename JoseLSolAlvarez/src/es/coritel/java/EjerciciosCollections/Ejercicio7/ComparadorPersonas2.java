package es.coritel.java.EjerciciosCollections.Ejercicio7;

import java.util.Comparator;

public class ComparadorPersonas2 implements Comparator<Persona> {

	//Ejercicio 7.3
	@Override
	public int compare(Persona pers1, Persona pers2) {
		int result;
		if (pers1.compareTo(pers2) == 0) {
			result = pers1.getNombre().compareTo(pers2.getNombre());
		} else{
			result = pers1.compareTo(pers2);
		}
		return result;
	}

}
