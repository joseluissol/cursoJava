package es.coritel.java.EjerciciosBasicos;

import java.util.Scanner;

public class PrimerModulo {

	public static void main(String[] args) {

		// Ejercicio 2
		byte numByte = 73;
		short numShort = 153;
		int numInt = 4562;
		long numLong = 64564241L;
		float numFloat = 687.2F;
		double numDouble = 654.654;
		char character = 'a';
		boolean booleano = true;

		System.out.println("byte: " + numByte);
		System.out.println("short: " + numShort);
		System.out.println("int: " + numInt);
		System.out.println("long: " + numLong);
		System.out.println("float: " + numFloat);
		System.out.println("double: " + numDouble);
		System.out.println("char: " + character);
		System.out.println("boolean: " + booleano);

		// Ejercicio 3
		int a = 2;
		int b = 4;
		int c = 3;
		int d = 0;
		System.out.println("a + b: " + a + b);
		System.out.println("b + c: " + b + c);
		System.out.println("c + d: " + c + d);
		System.out.println("a - b: " + (a - b));
		System.out.println("b - c: " + (b - c));
		System.out.println("c - d: " + (c - d));
		System.out.println("a * b: " + a * b);
		System.out.println("b * d: " + b * d);
		System.out.println("c * a: " + c * a);
		System.out.println("d * a: " + d * a);
		System.out.println("a / b: " + a / b);
		System.out.println("b / c: " + b / c);
		System.out.println("b / a: " + b / a);
		System.out.println("d / a: " + d / a);
		// System.out.println("b / d: " + b / d); //No se puede dividir entre 0

		// Ejercicio 4
		operaciones();

		// Ejercicio 5
		operacionesParametros(a, b, c, d);

		// Ejercicio 6
		System.out.println(suma(a, a));
		System.out.println(suma(b, d));
		System.out.println(resta(d, b));
		System.out.println(resta(c, c));
		System.out.println(multiplicacion(d, c));
		System.out.println(multiplicacion(a, c));
		System.out.println(division(a, b));
		System.out.println(division(b, c));

		// Ejercicio 7
		calculadora();

	}

	// Ejercicio4
	public static void operaciones() {
		int a = 2;
		int b = 4;
		int c = 3;
		int d = 0;
		System.out.println("a + b: " + a + b);
		System.out.println("b + c: " + b + c);
		System.out.println("c + d: " + c + d);
		System.out.println("a - b: " + (a - b));
		System.out.println("b - c: " + (b - c));
		System.out.println("c - d: " + (c - d));
		System.out.println("a * b: " + a * b);
		System.out.println("b * d: " + b * d);
		System.out.println("c * a: " + c * a);
		System.out.println("d * a: " + d * a);
		System.out.println("a / b: " + a / b);
		System.out.println("b / c: " + b / c);
		System.out.println("b / a: " + b / a);
		System.out.println("d / a: " + d / a);
		// System.out.println("b / d: " + b / d); //No se puede dividir entre 0
	}

	// Ejercicio5
	public static void operacionesParametros(int a, int b, int c, int d) {

		System.out.println("a + b: " + a + b);
		System.out.println("b + c: " + b + c);
		System.out.println("c + d: " + c + d);
		System.out.println("a - b: " + (a - b));
		System.out.println("b - c: " + (b - c));
		System.out.println("c - d: " + (c - d));
		System.out.println("a * b: " + a * b);
		System.out.println("b * d: " + b * d);
		System.out.println("c * a: " + c * a);
		System.out.println("d * a: " + d * a);
		System.out.println("a / b: " + a / b);
		System.out.println("b / c: " + b / c);
		System.out.println("b / a: " + b / a);
		System.out.println("d / a: " + d / a);
		// System.out.println("b / d: " + b / d); //No se puede dividir entre 0

	}

	// Ejercicio 6
	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplicacion(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	// Ejercicio 7
	private static void calculadora() {
		int a = 0, b = 0;
		String operacion;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca operacion (+, -, *, /) o S para salir: ");
		operacion = sc.next();

		if (!operacion.equalsIgnoreCase("S")) {
			System.out.print("Introduzca un numero a: ");
			a = sc.nextInt();
			System.out.print("Introduzca un numero b: ");
			b = sc.nextInt();
		}

		while (!operacion.equalsIgnoreCase("S")) {
			if (operacion.equals("+")) {
				System.out.println(suma(a, b));
			} else if (operacion.equals("-")) {
				System.out.println(resta(a, b));
			} else if (operacion.equals("*")) {
				System.out.println(multiplicacion(a, b));
			} else if (operacion.equals("/")) {
				if (b != 0) {
					System.out.println(division(a, b));
				} else {
					System.out.println("No se puede dividir entre 0.");
				}
			} else {
				System.out.println("Operacion incorrecta.");
			}

			System.out
					.print("Introduzca operacion (+, -, *, /) o S para salir: ");
			operacion = sc.next();

			if (!operacion.equalsIgnoreCase("S")) {
				System.out.print("Introduzca un numero a: ");
				a = sc.nextInt();
				System.out.print("Introduzca un numero b: ");
				b = sc.nextInt();
			}
		}
		sc.close();
	}
}
