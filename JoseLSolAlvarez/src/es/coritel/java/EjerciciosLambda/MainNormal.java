package es.coritel.java.EjerciciosLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainNormal {

	public static void main(String[] args) {
		// ++++++Ejercicios sin stream y lambda++++++

		List<Evento> arrayList = new ArrayList<Evento>();

		arrayList.add(new Evento(1, "Event 1", "Musical", 3));
		arrayList.add(new Evento(2, "Event 2", "Sport", 5));
		arrayList.add(new Evento(3, "Event 3", "Sport", 10));
		arrayList.add(new Evento(4, "Event 4", "Cultutal", 34));
		arrayList.add(new Evento(5, "Event 5", "Sport", 56));

		// Ejercicio 1
		System.out.println("Listado de todos los miembros: ");
		for (Evento evento : arrayList) {
			System.out.println(evento.getNombre());
		}
		System.out.println();

		// Ejercicio 2
		System.out
				.println("Listado de todos los miembros que son de tipo \"sport\": ");
		for (Evento evento : arrayList) {
			if (evento.getType().equals("Sport")) {
				System.out.println(evento.getNombre());
			}
		}
		System.out.println();

		// Ejercicio 3
		int suma = 0;
		System.out.println("Suma de los asientos libres de \"sport\": ");
		for (Evento evento : arrayList) {
			if (evento.getType().equals("Sport")) {
				suma += evento.getSeatsAvailable();
			}
		}
		System.out.println(suma);

		// Ejercicio 4
		List<Integer> listID = new ArrayList<Integer>();

		for (Evento evento : arrayList) {
			if (evento.getType().equals("Sport")) {
				listID.add(Integer.valueOf(evento.getId()));
			}
		}

		System.out
				.println("Listado de todos los IDs que son de tipo \"sport\": ");
		for (Integer entero : listID) {
			System.out.println(entero.toString());
		}
		System.out.println();

		// Ejercicio 5
		Collections.sort(arrayList, new ComparatorEventoNombreDecreciente());
		List<Integer> listIDInversa = new ArrayList<Integer>();

		for (Evento evento : arrayList) {
			if (evento.getType().equals("Sport")) {
				listIDInversa.add(Integer.valueOf(evento.getId()));
			}
		}

		System.out
				.println("Listado de todos los IDs que son de tipo \"sport\" invertidos: ");
		for (Integer entero : listIDInversa) {
			System.out.println(entero.toString());
		}
		System.out.println();
	}

}
