package es.coritel.java.EjerciciosLambda;

import java.util.ArrayList;
import java.util.List;

public class MainLambda {

	public static void main(String[] args) {
		// ++++++Ejercicios usando stream lambda++++++

		List<Evento> arrayList = new ArrayList<Evento>();

		arrayList.add(new Evento(1, "Event 1", "Musical", 3));
		arrayList.add(new Evento(2, "Event 2", "Sport", 5));
		arrayList.add(new Evento(3, "Event 3", "Sport", 10));
		arrayList.add(new Evento(4, "Event 4", "Cultutal", 34));
		arrayList.add(new Evento(5, "Event 5", "Sport", 56));

		// Ejercicio 1
		System.out.println("Listado de todos los miembros: ");
		arrayList.stream().forEach(e -> System.out.println(e.getNombre()));
		System.out.println();

		// Ejercicio 2
		System.out
				.println("Listado de todos los miembros que son de tipo \"sport\": ");
		arrayList.stream().filter(list -> list.getType().equals("Sport"))
				.forEach(e -> System.out.println(e.getNombre()));
		System.out.println();

		// Ejercicio 3
		System.out.println("Suma de los asientos libres de \"sport\": ");
		System.out.println(arrayList.stream()
				.filter(list -> list.getType().equals("Sport"))
				.mapToInt(e -> e.getSeatsAvailable()).sum());
		System.out.println();

		// Ejercicio 4
		System.out
				.println("Listado de todos los IDs que son de tipo \"sport\": ");
		arrayList.stream().filter(list -> list.getType().equals("Sport"))
				.map(e -> e.getId()).forEach(System.out::println);
		System.out.println();

		// Ejercicio 5
		System.out
				.println("Listado de todos los IDs que son de tipo \"sport\" invertidos: ");
		arrayList.stream().filter(list -> list.getType().equals("Sport"))
				.sorted(new ComparatorEventoNombreDecreciente())
				.map(e -> e.getId()).forEach(System.out::println);

	}

}
