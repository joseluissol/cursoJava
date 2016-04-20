package es.coritel.java.EjerciciosCollections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Ejercicio5LinkedList {

	public static void main(String[] args) {
		// Ejercicio 5.1
		Queue<String> ll = new LinkedList<String>();
		ll.add("Objeto1");
		ll.add("Objeto2");
		ll.add("Objeto3");
		ll.add("Objeto4");
		ll.add("Objeto5");

		// Ejercicio 5.2
		System.out.println(ll.add("Objeto1"));
		// Devuelve true por lo que lo agrega a la LinkedList

		// Ejercicio 5.3
		ll.remove("Objeto2");

		// Ejercicio 5.4
		for (String objeto : ll) {
			if (objeto.equals("Objeto3")) {
				System.out.println(objeto);
			}
		}
		System.out.println();

		// Ejercicio 5.5
		System.out.println(ll.size());
		System.out.println();

		// Ejercicio 5.6
		for (String objeto : ll) {
			System.out.println(objeto);
		}
		System.out.println();

		//Ejercicio 5.7
		Queue<String> nuevo = new LinkedList<String>();
		try {
			nuevo.remove();
		} catch (NoSuchElementException e) {
		}
		nuevo.poll();


	}

}
