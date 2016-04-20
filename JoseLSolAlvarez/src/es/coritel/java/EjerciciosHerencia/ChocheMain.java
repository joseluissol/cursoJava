package es.coritel.java.EjerciciosHerencia;

public class ChocheMain {

	public static void main(String[] args) {
		//Ejercicio 3
		//Coche coche = new Coche(); //Da error por el contructor con parametros

		Coche coche = new Coche("2102B3", "rojo", "5201JVC", "Jose");

		//Ejercicio 5
		coche.cambiaConductorColor("Luis", "verde");

		//Ejercicio 6
		Coche.mensaje();

		//Ejercicio7
		coche.bastidor = "1200V5";
		coche.conductor = "Fran";
		//coche.color = "Amarillo"; //No accede porque el acceso es private
		coche.matricula = "1234AAA";



	}

}
