package es.coritel.java.EjerciciosCollections;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio1HashSet {

	public static void main(String[] args) {
		//Ejercicio 1.1
		Set<String> hsString = new HashSet<String>();
		hsString.add("Objeto1");
		hsString.add("Objeto2");
		hsString.add("Objeto3");
		hsString.add("Objeto4");
		hsString.add("Objeto5");

		//Ejercicio 1.2
		System.out.println(hsString.add("Objeto1"));
			//Devuelve false por lo que no lo agrega al HashSet

		//Ejercicio 1.3
		hsString.remove("Objeto2");

		//Ejercicio 1.4
		for (String objeto : hsString) {
			if(objeto.equals("Objeto1")){
				System.out.println(objeto);
			}
		}

		//Ejercicio 1.5
		System.out.println(hsString.size());

		//Ejercicio 1.6
		for (String objeto : hsString) {
			System.out.println(objeto);
		}

	}

}
