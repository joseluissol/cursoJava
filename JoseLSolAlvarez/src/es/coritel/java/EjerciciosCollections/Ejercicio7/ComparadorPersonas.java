package es.coritel.java.EjerciciosCollections.Ejercicio7;

import java.util.Comparator;


public class ComparadorPersonas implements Comparator<Persona>{

	//Ejercicio 7.2
	@Override
	public int compare(Persona pers1, Persona pers2) {
		return pers1.getNombre().compareTo(pers2.getNombre());
	}

}
