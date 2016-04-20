package es.coritel.java.EjerciciosCollections;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4ArrayList {
	public static void main(String[] args) {
		//Ejercicio 3.1
		List<String> al = new ArrayList<String>();
		al.add("Objeto1");
		al.add("Objeto2");
		al.add("Objeto3");
		al.add("Objeto4");
		al.add("Objeto5");

		//Ejercicio 3.2
		System.out.println(al.add("Objeto1"));
			//Devuelve true por lo que lo agrega al ArrayList

		//Ejercicio 3.3
		al.remove("Objeto1");

		//Ejercicio 3.4
		for (String objeto : al) {
			if(objeto.equals("Objeto2")){
				System.out.println(objeto);
			}
		}

		//Ejercicio 3.5
		System.out.println(al.size());

		//Ejercicio 3.6
		for (String objeto : al) {
			System.out.println(objeto);
		}


	}
}
