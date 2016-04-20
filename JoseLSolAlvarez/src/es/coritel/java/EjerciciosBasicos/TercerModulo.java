package es.coritel.java.EjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;

public class TercerModulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String frase;
		char caracter;

		// Ejercicio 1
		separaPalabra();

		// Ejercicio 2
		multiplosCuatro();

		// Ejercicio 3
		palindroma();

		// Ejercicio 4
		cuentaMayusMinus();

		// Ejercicio 5
		System.out.print("Introduzca una palabra: ");
		frase = sc.next();
		System.out.print("Introduzca un caracter: ");
		caracter = sc.next().charAt(0);
		System.out.println(cuentaLetra(frase, caracter));

		// Ejercicio 6
		System.out.print("Introduzca una palabra: ");
		frase = sc.next();
		System.out.print("Introduzca un caracter: ");
		caracter = sc.next().charAt(0);
		pasaAMayus(frase, caracter);

		// Ejercicio 7
		System.out.print("Introduzca una palabra: ");
		frase = sc.nextLine();
		frase(frase);

		// Ejercicio 8
		usoArray();

		// Ejercicio 9
		arrayAleatorio();

		//Ejercicio 10
		arrayRandom();

		//Ejercicio 11
		arraySumaMedia();

		//Ejercicio 12
		arrayAbecedario();

		//Ejercicio 13
		fraseArray();

		//Ejercicio 14
		calculaDNI();

		//Ejercicio 15
		numeroCapicua();

		//Ejercicio 16
		invierteArray();

		//Ejercicio 17
		arrayBidimensional();

		//Ejercicio 18
		tablaMultiplicar();

		//Ejercicio 19
		cubo();

		//Ejercicio 20
		palabraInvertida();

		//Ejercicio 21
		escalera();

		//Ejercicio 22
		escaleraNumeros();

		//Ejercicio 23
		escaleraNum();

		//Ejercicio 24
		triangulo();

		//Ejercicio 25
		trianguloInvertido();

		//Ejercicio 26
		invertidoNumero();

		//Ejercicio 27
		piramideBinario();

		//Ejercicio 28
		rombo();

		//Ejercicio 29
		romboNumeros();

		//Ejercicio 30
		acumulativo();

		sc.close();
	}

	/*
	 * Clases publicas
	 */

	//Ejercicio 1
	// Ejercicio 1
public static void separaPalabra() {
		String palabra;
		char[] arrayLetras;

		System.out.print("Intrduzca una palabra: ");
		palabra = sc.next();

		arrayLetras = new char[palabra.length()];

		arrayLetras = palabra.toCharArray();

		for (char letra : arrayLetras) {
			System.out.println(letra);
		}
		System.out.println();
	}

	//Ejercicio 2
	// Ejercicio 2
	public static void multiplosCuatro() {

		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

	//Ejercicio 3
	// Ejercicio 3
	public static void palindroma() {
		String palabra;
		boolean palindroma = true;

		System.out.print("Intrduzca una palabra: ");
		palabra = sc.next();

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) != palabra.charAt(palabra.length() - (i + 1))) {
				palindroma = false;
			}
		}
		if (palindroma) {
			System.out.println("Es palindroma");
		} else {
			System.out.println("No es palindroma");
		}
	}

	//Ejercicio 4
	// Ejercicio 4
	public static void cuentaMayusMinus() {
		String palabra;
		int mayus = 0, minus = 0;

		System.out.print("Intrduzca una palabra: ");
		palabra = sc.next();

		for (int i = 0; i < palabra.length(); i++) {
			if (Character.isUpperCase(palabra.charAt(i))) {
				mayus++;
			} else if (Character.isLowerCase(palabra.charAt(i))) {
				minus++;
			}
		}
		System.out.println("Mayusculas: " + mayus);
		System.out.println("Minusculas: " + minus);

	}

	//Ejercicio 5
	// Ejercicio 5
	public static int cuentaLetra(String palabra, char caract) {
		int cuenta = 0;

		palabra = palabra.toUpperCase();
		caract = Character.toUpperCase(caract);

		for (int i = 0; i < palabra.length(); i++) {
			char aux = palabra.charAt(i);
			if (aux == caract) {
				cuenta++;
			}
		}
		return cuenta;
	}

	//Ejercicio 6
	// Ejercicio 6
	public static void pasaAMayus(String palabra, char caract) {

		String nueva = "";

		caract = Character.toLowerCase(caract);
		palabra = palabra.toLowerCase();

		for (int i = 0; i < palabra.length(); i++) {
			char aux = palabra.charAt(i);
			if (aux == caract) {
				nueva += palabra.toUpperCase().charAt(i);
			} else {
				nueva += palabra.charAt(i);
			}
		}
		System.out.println(nueva);
	}

	//Ejercicio 7
	// Ejercicio 7
	public static void frase(String frase) {
		String hasta = "hasta";

		System.out.println("Longitud: " + frase.length());
		System.out.println("Caracter en la posicion 9: " + frase.charAt(9));
		System.out.println("Subcadena \"hasta\", posicion inicial: "
				+ frase.indexOf("hasta") + ", poscion final: "
				+ (frase.indexOf(hasta) + (hasta.length())) + ".");
		System.out.println("Posicion del caracter z: " + frase.indexOf('z'));
		System.out.println("En mayuculas: " + frase.toUpperCase());

		if ("E".equalsIgnoreCase(frase.substring(0, 1))) {
			System.out.println("La primera letra es E.");
		}

	}

	//Ejercicio 8
	// Ejercicio 8
	public static void usoArray() {
		imprimeArray(rellenaArray(7));
	}

	public static int[] rellenaArray(int dimension) {
		int[] numeros = new int[dimension];

		System.out.println("Escriba " + dimension
				+ " numeros para rellenar un array.");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		return numeros;
	}

	public static void imprimeArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Indice: " + i + ", valor: " + numeros[i]);
		}
	}

	//Ejercicio 9
	//Ejercicio 9
	public static void arrayAleatorio(){
		int[] numeros;

		System.out.print("Introduzca dimension: ");
		numeros = rellenaArrayAleatorios(sc.nextInt());
		imprimeArray(numeros);
		System.out.println(sumaArray(numeros));
	}

	public static int[] rellenaArrayAleatorios(int dimension) {
		int[] numeros = new int[dimension];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio();
		}
		return numeros;
	}

	public static int sumaArray(int[] numeros) {
		int suma = 0;
		for (int numero : numeros){
			suma += numero;
		}
		return suma;
	}

	//Ejercicio 10
	//Ejercicio 10
	//Ejercicio 10

	public static void arrayRandom() {
		int dimension, maximo, minimo;
		int[] numeros;

		System.out.print("Introduzca dimension: ");
		dimension = sc.nextInt();
		System.out.print("Introduzca maximo: ");
		maximo = sc.nextInt();
		System.out.print("introduzca minimo: ");
		minimo = sc.nextInt();

		numeros = rellenaRandom(dimension, maximo, minimo);
		System.out.println("Suma de los valores del array: " + sumaArray(numeros));
		System.out.println("Maximo del array: " + mayor(numeros));

	}


	public static int[] rellenaRandom(int dimension, int maximo, int minimo) {
		int[] numeros = new int[dimension];
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(maximo) + minimo;
		}
		return numeros;
	}


	public static int mayor(int[] numeros) {
		int maximo = 0;
		for (int i = 0; i < numeros.length; i++){
			if (maximo < numeros[i]){
				maximo = numeros[i];
			}
		}
		return maximo;
	}

	//Ejercicio 11
	//Ejercicio 11

	//Ejercicio 11
	public static void arraySumaMedia() {
		int dimension = 65;
		int[] array ;
		array = arrayNumerosCorrelativos(dimension);
		 System.out.println("Suma: " + sumaArray(array));
		 System.out.println("Media: " + mediaArray(array));
	}


	public static int[] arrayNumerosCorrelativos(int dim){
		int [] array = new int[dim];

		for (int i = 0 ; i < array.length; i++){
			array[i] = i + 1;
		}
		return array;
	}


	public static int mediaArray(int [] array) {
		int media;

		media = sumaArray(array)/(array.length - 1);

		return media;
	}

	//Ejercicio 12
	//Ejercicio 12

	//Ejercicio 12
	public static void arrayAbecedario(){
		String palabra ="";
		char [] abecedario = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
		int posicion;

		do{
			System.out.print("Introduzca una numero correspondiente a una letra"
					+ "\ndel abecedario: ");
			posicion = sc.nextInt();

			if (posicion >= 0 && posicion < abecedario.length) {
				palabra += abecedario[posicion];
				System.out.println("Se introducira la '" + abecedario[posicion] + "'.");
			} else if (posicion == -1) {
				System.out.println("Fin");
			}
			else{
				System.out.println("Error, introduzca otro numero.");
			}

		}while (!(posicion == -1));
		System.out.println("Cadena resultante: " + palabra);
	}

	//Ejercicio 13
	//Ejercicio 13

	//Ejercicio 13
	public static void fraseArray() {
		String frase = "";
		char[] arrayFrase;

		System.out.print("Escriba una frase para pasarla a array: ");
		frase = sc.nextLine();

		arrayFrase = frase.toCharArray();

		System.out.println(arrayFrase);
	}

	//Ejercicio 14
	//Ejercicio 14

	//Ejercicio 14
	public static void calculaDNI() {
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni;

		System.out.println("Introduzca su DNI: ");
		dni = sc.nextInt();

		System.out.println(letrasDNI.charAt(dni % 23));
	}

	//Ejercicio 15
	//Ejercicio 15

	//Ejercicio 15
	public static void numeroCapicua() {
		int numero, auxNumero = 0, invertido = 0, resto;

		System.out.print("Introduzca un numero para comprobar si es capicua: ");
		numero = sc.nextInt();
		auxNumero = numero;
		while(auxNumero!=0)
		{
		 resto=auxNumero%10;
		 invertido=invertido*10+resto;
		 auxNumero=auxNumero/10;
		}

		if(invertido==numero){
			System.out.println("El numero " + numero	+ " es capicua");
		} else{
			System.out.println("El numero " + numero	+ " no es capicua");
		}
	}

	//Ejercicio 16
	//Ejercicio 16

	//Ejercicio 16
	public static void invierteArray() {
		int dim = 6;
		int[] numeros = arrayNumerosCorrelativos(dim);

		int[] invertido = new int [numeros.length];

		for(int i = 0; i < numeros.length; i++){
			invertido[(invertido.length - 1) - i] = numeros[i];
		}
		for(int i = 0; i < numeros.length; i++){
			System.out.print(invertido[i] + " ");
		}
		System.out.println();

	}

	//Ejercicio 17
	//Ejercicio 17

	//Ejercicio 17
	public static void arrayBidimensional() {
		int ejeX = 10;
		int ejeY = 10;

		//array[ejeX][ejeY]

		int[][] tabla = new int[ejeX][ejeY];

		for(int i = 0; i < tabla.length; i ++){
			for(int j = 0; j < tabla[i].length; j++){
				tabla[i][j] = i * 10 + j + 1;
			}
		}

		for(int i = 0; i < tabla.length; i ++){
			for(int j = 0; j < tabla[i].length; j++){
				if (tabla[i][j] < 10){
					System.out.print(" " + tabla[i][j] + " ");
				}else{
					System.out.print(tabla[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

	//Ejercicio 18

	//Ejercicio 18
	public static void tablaMultiplicar() {
			int numero;
			System.out.print("Introduzca numero a multiplicar: ");
			numero = sc.nextInt();

			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (i*numero));
			}
		}

	//Ejercicio 19

	//Ejercicio 19
	public static void cubo() {
		int numero;
		System.out.print("introduzca un numero para calcular su cubo: ");
		numero = sc.nextInt();

		System.out.println("Resultado: " + Math.pow(numero, 3));
	}

	//Ejercicio 20

	//Ejercicio 20
	public static void palabraInvertida() {
		String palabra = "";
		char[] invierte, invertido;

		do{
		System.out.print("Escriba una frase para invertir: ");
		palabra = sc.next();

		invierte = palabra.toCharArray();
		invertido = new char[invierte.length];

		for(int i = 0; i < invierte.length; i++){
			invertido[(invierte.length - 1) - i] = invierte[i];
		}
		for(int i = 0; i < invertido.length; i++){
			System.out.print(invertido[i]);
		}
		System.out.println();

		}while(!palabra.equals("fin"));
	}

	//Ejercicio 21

	//Ejercicio 21
	public static void escalera() {
		int numero;
		System.out.print("Introduzca un numero para dibujar con asteriscos: ");
		numero = sc.nextInt();

		for(int i = 1; i <= numero; i++){
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	//Ejercicio 22

	//Ejercicio 22
	public static void escaleraNumeros() {
		int numero;
		System.out.print("Introduzca un numero para dibujar con numeros: ");
		numero = sc.nextInt();

		for(int i = numero; i >= 1; i--){
			for (int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	//Ejercicio 23

	//Ejercicio 23
	public static void escaleraNum() {
		int numero;
		System.out.print("Introduzca un numero para dibujar con numeros: ");
		numero = sc.nextInt();

		for(int i = 1; i <= numero; i++){
			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

	//Ejercicio 24

	//Ejercicio 24
	public static void triangulo() {
		int h;

			System.out.print("Introduzca la altura del triangulo: ");
			h = sc.nextInt();

		for (int i=1; i<=h; i++){
			for(int j=h-1; j>=i; j--){
				System.out.print(" ");
			}
			for (int j=1; j<=i+(i-1); j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	//Ejercicio 25

	//Ejercicio 25
	public static void trianguloInvertido() {
		int l;
		System.out.println("Introduzca altura: ");
		l = sc.nextInt();

		for (int i = l; i >= 1; i--) {
			for (int j = l; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + (i - 1); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	//Ejercicio 26

	//Ejercicio 26
	public static void invertidoNumero() {
		int l;
		System.out.println("Introduzca altura: ");
		l = sc.nextInt();

		for (int i = l; i >= 1; i--) {
			for (int j = l; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

	//Ejercicio 27

	//Ejercicio 27
	public static void piramideBinario() {
		int h;

		System.out.print("Introduzca la altura del triangulo: ");
		h = sc.nextInt();

	for (int i=1; i<=h; i++){
		for(int j=h-1; j>=i; j--){
			System.out.print(" ");
		}
		for (int j=1; j<=i+(i-1); j++){
			if (j%2 == 0){
				System.out.print(0);
			} else {
				System.out.print(1);
			}
		}
		System.out.print("\n");
	}
	}

	//Ejercicio 28

	//Ejercicio 28
	public static void rombo() {
		int l;

		System.out.println("Introduzca la mitad de la altura: ");
		l = sc.nextInt();

		for (int i = 1; i <= l - 1; i++) {
			for (int j = l - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + (i - 1); j++) {
					System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 1; i <= l + (l - 1); i++) {
			System.out.print("*");
		}
		System.out.print("\n");

		for (int i = l - 1; i >= 1; i--) {
			for (int j = l - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + (i - 1); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	//Ejercicio 29

	//Ejercicio 29
	public static void romboNumeros() {
		int l;

		System.out.println("Introduzca la mitad de la altura: ");
		l = sc.nextInt();

		for (int i = 1; i <= l - 1; i++) {
			for (int j = l - 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + (i - 1); j++) {
					System.out.print(i * j + " ");
			}
			System.out.print("\n");
		}
		for (int i = 1; i <= l + (l - 2); i++) {
			System.out.print(l * i + " ");
		}
		System.out.print("\n");

		for (int i = l - 1; i >= 1; i--) {
			for (int j = l - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + (i - 1); j++) {
				System.out.print(i * j + " ");
			}
			System.out.print("\n");
		}
	}

	//Ejercicio 30

	//Ejercicio 30
	public static void acumulativo() {
		int numero;
		System.out.print("Introduzca un numero para dibujar con numeros: ");
		numero = sc.nextInt();

		for(int i = 1; i <= numero; i++){
			System.out.print(factorial(i));
			System.out.println();
		}
	}


	public static int factorial (double numero) {
		  if (numero==0)
		    return 1;
		  else
		    return (int) numero * factorial(numero-1);
		}


	/*
	 * Clases privadas
	 */

	//Ejercicio 9
	private static int aleatorio() {
		int aleatorio;
		double semilla = System.currentTimeMillis();
		aleatorio =  (int) (semilla % 10);
		return aleatorio;
	}
}
