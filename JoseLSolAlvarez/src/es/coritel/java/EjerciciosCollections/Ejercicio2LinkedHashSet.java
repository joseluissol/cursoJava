package es.coritel.java.EjerciciosCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2LinkedHashSet {

	public static void main(String[] args) {
			//Ejercicio 2.1
			Set<String> lhsString = new LinkedHashSet<String>();
			lhsString.add("Objeto1");
			lhsString.add("Objeto2");
			lhsString.add("Objeto3");
			lhsString.add("Objeto4");
			lhsString.add("Objeto5");

			//Ejercicio 2.2
			System.out.println(lhsString.add("Objeto1"));
				//Devuelve false por lo que no lo agrega al LinkedHashSet

			//Ejercicio 2.3
			lhsString.remove("Objeto2");

			//Ejercicio 2.4
			for (String objeto : lhsString) {
				if(objeto.equals("Objeto1")){
					System.out.println(objeto);
				}
			}

			//Ejercicio 2.5
			System.out.println(lhsString.size());

			//Ejercicio 2.6
			for (String objeto : lhsString) {
				System.out.println(objeto);
			}

	}

}
