package es.coritel.java.EjerciciosCollections;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3TreeSet {
	public static void main(String[] args) {
		//Ejercicio 2.1
		Set<String> tsString = new TreeSet<String>();
		tsString.add("Objeto1");
		tsString.add("Objeto2");
		tsString.add("Objeto3");
		tsString.add("Objeto4");
		tsString.add("Objeto5");

		//Ejercicio 2.2
		System.out.println(tsString.add("Objeto1"));
			//Devuelve true por lo que lo agrega al TreeSet

		//Ejercicio 2.3
		tsString.remove("Objeto2");

		//Ejercicio 2.4
		for (String objeto : tsString) {
			if(objeto.equals("Objeto1")){
				System.out.println(objeto);
			}
		}

		//Ejercicio 2.5
		System.out.println(tsString.size());

		//Ejercicio 2.6
		for (String objeto : tsString) {
			System.out.println(objeto);
		}
	}
}
