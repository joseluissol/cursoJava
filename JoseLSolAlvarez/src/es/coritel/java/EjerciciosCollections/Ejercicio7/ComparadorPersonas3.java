package es.coritel.java.EjerciciosCollections.Ejercicio7;

import java.util.Comparator;

public class ComparadorPersonas3 implements Comparator<Persona> {

	@Override
	public int compare(Persona pers1, Persona pers2) {
		int result;
		if (pers1.getEdad() > pers2.getEdad()) {
			result = (-1)*(pers1.getNombre().compareTo(pers2.getNombre()));
		} else if (pers1.getEdad() < pers2.getEdad()) {
			result = pers1.getNombre().compareTo(pers2.getNombre());
		} else{
			result = 0;
		}
		return result;
	}

}
