package es.coritel.java.EjerciciosCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ejercicio6HashMap {
	public static void main(String[] args) {
		//Ejercicio 6.1
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("1", "Uno");
		hm.put("2", "Dos");
		hm.put("3", "Tres");
		hm.put("4", "Cuatro");
		hm.put("5", "Cinco");

		//Ejercicio 6.2
		System.out.println(hm.put("1", "UnoRepe"));
		//Sobreescribe el valor y la salida que tiene es el valor anterior

		//Ejercicio 6.3
		hm.remove("3");

		//Ejercicio 6.4
		System.out.println(hm.get("2"));

		//Ejercicio 6.5
		System.out.println(hm.size());

		//Ejercicio 6.6

		for (Entry<String, String> entry : hm.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " - " + value);
		}

		//Ejercicio 6.7
		Set<String> sKeys = hm.keySet();
		for (String key : sKeys) {
			System.out.println(key);
		}

		List<String> lValues = new ArrayList<String>(hm.values());
		for (String string : lValues) {
			System.out.println(string);
		}

	}


}
