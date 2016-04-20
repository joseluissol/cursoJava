package es.coritel.java.EjerciciosBasicos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SegundoModulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//Ejercicio 1
		parImpar();

		//Ejercicio 2
		multiplo10();

		//Ejercicio 3
		esMayus();

		//Ejercicio 4
		esPositivo();

		//Ejercicio 5
		primo();

		// Ejercicio 6a
		diaSemana();

		// Ejercicio 6b
		diaSemanaLargo();

		//Ejercicio 7
		mesAnio();

		//Ejercicio 8
		ordena();

		//Ejercicio 9
		validaCaracter();

		//Ejercicio 10
		validaVocales();

		//Ejercicio 11
		introduceNumerosEnOrdenCreciente();

		//Ejercicio 12
		ultimoEsSuma();

		//Ejercicio 13
		dosnumerosPrimos();

		//Ejercicio 14
		operacionEntreDosNumeros();

		//Ejercicio 16
		calculadoraGramos();

		//Ejercicio 17
		calculoNeto();

		//Ejercicio 18
		suma50Segundos();

		//Ejercicio 19
		calculadoraSubida();


		sc.close();
	}

	// Ejercicio 1
	public static void parImpar() {

		int num;

		System.out.print("Introduza un numero para saber si es par o impar: ");
		num = sc.nextInt();

		if ((num % 2) == 0) {
			System.out.println("El numero " + num + " es par.");
		} else {
			System.out.println("El numero " + num + " es impar.");
		}

	}

	// Ejercicio 2
	public static void multiplo10() {

		int num;

		System.out
				.print("Introduza un numero para saber si es multiplo de 10: ");
		num = sc.nextInt();

		if ((num % 10) == 0) {
			System.out.println("El numero " + num + " es multiplo de 10.");
		} else {
			System.out.println("El numero " + num + " no es multiplo de 10.");
		}

	}

	// Ejercicio 3
	public static void esMayus() {

		char caracter;
		String stringAux;

		System.out.print("Introduzca un caracter para saber si es Mayucula: ");
		stringAux = sc.next();
		caracter = stringAux.charAt(0);

		if (Character.isUpperCase(caracter)) {
			System.out.println("La letra " + caracter + " es mayuscula.");
		} else {
			System.out.println("La letra " + caracter + " no es mayuscula.");
		}

	}

	// Ejercicio 4
	public static void esPositivo() {
		int num;

		System.out
				.print("Introduzca un numero entero para saber si es positivo o negativo: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("El numero " + num + " es positivo.");
		} else if (num < 0) {
			System.out.println("El numero " + num + " es negativo.");
		} else if (num == 0) {
			System.out.println("El numero " + num + " es igual a 0.");
		} else {
			System.out.println("El numero introducido no es correcto");
		}

	}

	// Ejercicio 5
	public static void primo() {

		int num;
		boolean noEsPrimo = false;

		System.out
				.print("Introduzca un numero para saber si es primo o no (0 - 30): ");
		num = sc.nextInt();

		if (num >= 0 && num <= 30) {
			if (num == 0){
				noEsPrimo = true;
			}
			for (int i = 2; i <= num; i++) {
				if (i != num) {
					if (num % i == 0) {
						noEsPrimo = true;
					}
				}
			}
			if (noEsPrimo) {
				System.out.println("El numero " + num + " no es primo");
			} else {
				System.out.println("El numero " + num + " es primo");
			}
		} else {
			System.out.println("El numero no esta en el rango 0 - 30.");
		}

	}

	// Ejercicio 6a
	public static void diaSemana() {
		int num;

		System.out
				.print("Introduzca un numero para sabera que dia de la semana corresponde (1 - 7): ");
		num = sc.nextInt();

		if (num >= 1 && num <= 7) {
			if (num == 1) {
				System.out.println("Lunes.");
			} else if (num == 2) {
				System.out.println("Martes.");
			} else if (num == 3) {
				System.out.println("Miercoles.");
			} else if (num == 4) {
				System.out.println("Jueves.");
			} else if (num == 5) {
				System.out.println("Viernes.");
			} else if (num == 6) {
				System.out.println("Sabado.");
			} else if (num == 7) {
				System.out.println("Domingo.");
			}
		} else {
			System.out.println("El numero introducido no es correcto.");
		}
	}

	// Ejercicio 6b
	public static void diaSemanaLargo() {
		int num;

		System.out
				.print("Introduzca un numero para sabera que dia de la semana corresponde (1 - 7): ");
		num = sc.nextInt();

		if (num >= 1 && num <= 7) {
			switch (num) {
			case 1:
				System.out.println("Lunes.");
			case 2:
				System.out.println("Martes.");
			case 3:
				System.out.println("Miercoles.");
			case 4:
				System.out.println("Jueves.");
			case 5:
				System.out.println("Viernes.");
			case 6:
				System.out.println("Sabado.");
			case 7:
				System.out.println("Domingo.");
			default:
				break;
			}
		} else {
			System.out.println("El numero introducido no es correcto.");
		}
	}

	//Ejercicio 7
	public static void mesAnio() {
		int num;

		System.out
				.print("Introduzca un numero para sabera que dia de la semana corresponde (1 - 12): ");
		num = sc.nextInt();

		if (num >= 1 && num <= 12) {
			if (num == 1) {
				System.out.println("Enero.");
			} else if (num == 2) {
				System.out.println("Febrero.");
			} else if (num == 3) {
				System.out.println("Marzo.");
			} else if (num == 4) {
				System.out.println("Abril.");
			} else if (num == 5) {
				System.out.println("Mayo.");
			} else if (num == 6) {
				System.out.println("Junio.");
			} else if (num == 7) {
				System.out.println("Julio.");
			} else if (num == 8) {
				System.out.println("Agosto.");
			} else if (num == 9) {
				System.out.println("Septiembre.");
			} else if (num == 10) {
				System.out.println("Octubre.");
			} else if (num == 11) {
				System.out.println("Noviembre.");
			} else if (num == 12) {
				System.out.println("Diciembre.");
			}
		} else {
			System.out.println("El numero introducido no es correcto.");
		}
	}

	//Ejercicio 8
	public static void ordena(){
		int[] numeros = new int[6];
		System.out.println("Introduzca 6 numeros");
		for (int i = 0; i < numeros.length; i++){
			numeros[i] = sc.nextInt();
		}
		Arrays.sort(numeros);
		System.out.println();
		System.out.println(numeros[0]);
		System.out.println(numeros[numeros.length - 1]);
		System.out.println();
		for (int num: numeros){
			System.out.println(num);
		}

		System.out.println();

		for (int i = numeros.length - 1; i >= 0 ; i --){
			System.out.println(numeros[i]);
		}
	}

	//Ejercicio 9
	public static void validaCaracter() {
		String caracter;

		System.out.println("Introduzca S, N o punto (.): ");

		caracter = sc.next();

		if (caracter.equals("S") || caracter.equals("N") ||caracter.equals(".")){
			System.out.println("CORRECTO");
		} else {
			System.out.println("INCORRECTO");
		}
	}

	//Ejercicio 10
	public static void validaVocales() {
		String [] vocales = {"a", "e", "i", "o", "u"};

		boolean esVocal = false;

		System.out.print("Introduzca una letra para comprobar si es vocal o no: ");

		String letra = sc.next();

		for (String vocal: vocales){
			if (vocal.equals(letra)){
				esVocal = true;
			}
		}

		if (esVocal) {
			System.out.println("Es vocal.");
		}else {
			System.out.println("No es vocal.");
		}

	}

	//Ejercicio 11
	public static void introduceNumerosEnOrdenCreciente() {
		int a, b, c;

		System.out.println("Introduzca tres numeros para comprobar si se ha introducido en orden creciente:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a < b && b < c) {
			System.out.println("Introducidos en orden creciente.");
		} else {
			System.out.println("Introducidos en orden no creciente.");
		}


	}

	//Ejercicio 12
	public static void ultimoEsSuma() {
		int a, b, c;

		System.out.println("Introduzca tres numeros para comprobar si el ultimo es la suma de los dos anteriores:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (c == (a + b)) {
			System.out.println(c + " es la suma de " + a + " y " + b + ".");
		} else {
			System.out.println(c + " no es la suma de " + a + " y " + b + ".");
		}
	}

	//Ejercicio 13
	public static void dosnumerosPrimos() {
		int a, b;
		boolean aNoEsPrimo = true, bNoEsPrimo = true, fueraDeRango = false;

		System.out.println("Introduzca dos numeros para comprobar si ambos son primos (0 - 5):");
		a = sc.nextInt();
		b = sc.nextInt();

		if (a >= 1 && a <= 5) {
			if (a == 0){
				aNoEsPrimo = false;
			}
			for (int i = 2; i <= a; i++) {
				if (i != a) {
					if (a % i == 0) {
						aNoEsPrimo = false;
					}
				}
			}
		} else {
			fueraDeRango = true;
			System.out.println("Primer numero fuera de rango.");
		}

		if (b >= 1 && b <= 5) {
			if (b == 0){
				bNoEsPrimo = false;
			}
			for (int i = 2; i <= b; i++) {
				if (i != b) {
					if (b % i == 0) {
						bNoEsPrimo = false;
					}
				}
			}
		} else {
			fueraDeRango = true;
			System.out.println("Segundo numero fuera de rango.");
		}
		if (!fueraDeRango){
			if (aNoEsPrimo && bNoEsPrimo){
				System.out.println("Ambos son primos.");
			} else {
				System.out.println("Bien uno de los dos, o bien ambos no son primos.");
			}
		}
	}

	//Ejercicio 14
	public static void operacionEntreDosNumeros() {

		int a, b, c;

		System.out.println("Introduzca tres numeros para comprobar si se ha introducido alguna operacion de "
				+ "\nlos dos anteriores en el ultimo lugar:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();


		if (c == (a * b)){
			System.out.println(a +" * " + b + " es igual a " + c);
		} else if (c == (a / b)) {
			System.out.println(a +" / " + b + " es igual a " + c);
		} else if (c == (a % b)) {
			System.out.println(a +" % " + b + " es igual a " + c);
		}

	}

	//Ejercicio 16
	public static void calculadoraGramos() {
		int opcion, kg;

		System.out.print("Introduzca un peso en kg: ");
		kg = sc.nextInt();

		System.out.println("Seleccione una opcion:");
		System.out.println(" 1.Hg "
				+ "\n 2.Dg"
				+ "\n 3.g"
				+ "\n 4.dg"
				+ "\n 5.cg"
				+ "\n 6.mg."
				+ "");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println((double) kg/10);
			break;
		case 2:
			System.out.println((double) kg/100);
			break;
		case 3:
			System.out.println((double) kg/1000);
			break;
		case 4:
			System.out.println((double) kg/10000);
			break;
		case 5:
			System.out.println((double) kg/100000);
			break;
		case 6:
			System.out.println((double) kg/1000000);
			break;
		default:
			break;
		}
	}

	//Ejercicio 17
	public static void calculoNeto() {
		double salario, neto;

		System.out.print("Introduzca su sueldo: ");
		salario = sc.nextDouble();

		if (salario > 15000){
			neto = salario * 0.84;
		} else{
			neto = salario * 0.90;
		}

		System.out.println("Salario neto: " + neto);
	}

	//Ejercicio 18
	public static void suma50Segundos() {
		String hora;
		int h, m, s;
		System.out.println("introduzca una hora en el formatio HH:MM:SS");
		hora = sc.next();

		StringTokenizer st = new StringTokenizer(hora, ":");
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());

		if (h <= 23 && m <= 59 && s <= 59){
			s += 50;
			if (s >= 60){
				s -= 60;
				m += 1;
				if (m >= 60){
					m -= 60;
					h += 1;
					if (h >= 24){
						h = 0;
					}
				}
			}
			System.out.println(h + ":" + m + ":" + s);
		} else {
			System.out.println("Formato de hora incorrecto.");
		}

	}

	//Ejercicio 19
	public static void calculadoraSubida() {
		double salario = 40000.0;
		int antiguedad;

		System.out.print("Cuantos años lleva en la empresa: ");
		antiguedad = sc.nextInt();

		System.out.print("Sueldo: ");
		if (antiguedad >= 10){
			System.out.println(salario * 1.10);
		} else if (antiguedad < 10 && antiguedad >= 5) {
			System.out.println(salario * 1.07);
		} else if (antiguedad < 5 && antiguedad >= 3) {
			System.out.println(salario * 1.05);
		} else{
			System.out.println(salario * 1.03);
		}
	}

}
