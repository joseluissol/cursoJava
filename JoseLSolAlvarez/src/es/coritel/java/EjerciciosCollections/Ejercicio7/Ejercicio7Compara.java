package es.coritel.java.EjerciciosCollections.Ejercicio7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio7Compara {

	public static void main(String[] args) {

		List<Persona> lPersona = new ArrayList<Persona>();

		Persona p1 = new Persona();
		p1.setEdad(17);
		p1.setNombre("Paco");

		Persona p2 = new Persona();
		p2.setEdad(11);
		p2.setNombre("Zyran");

		Persona p3 = new Persona();
		p3.setEdad(21);
		p3.setNombre("Fran");

		Persona p4 = new Persona();
		p4.setEdad(17);
		p4.setNombre("Carlos");

		Persona p5 = new Persona();
		p5.setEdad(17);
		p5.setNombre("Felicia");

		lPersona.add(p1);
		lPersona.add(p2);
		lPersona.add(p3);
		lPersona.add(p4);
		lPersona.add(p5);

		//Ejercicio 7.1 y 7.4
		Collections.sort(lPersona);

		for (Persona persona : lPersona) {
			System.out.println(persona);
		}

		System.out.println();

		//Ejercicio 7.2
		Collections.sort(lPersona, new ComparadorPersonas());

		for (Persona persona : lPersona) {
			System.out.println(persona);
		}

		System.out.println();

		//Ejercicio 7.3
		Collections.sort(lPersona, new ComparadorPersonas2());

		for (Persona persona : lPersona) {
			System.out.println(persona);
		}

		System.out.println();

		//Ejercicio 7.5
		Collections.sort(lPersona, new ComparadorPersonas3());

		for (Persona persona : lPersona) {
			System.out.println(persona);
		}

		System.out.println();
	}

}
