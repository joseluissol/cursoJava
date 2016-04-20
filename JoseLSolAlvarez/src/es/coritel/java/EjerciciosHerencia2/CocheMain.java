package es.coritel.java.EjerciciosHerencia2;

import es.coritel.java.EjerciciosHerencia.Coche;

public class CocheMain {

	public static void main(String[] args) {
		//Ejercicio 7
				Coche coche = new Coche("2102B3", "rojo", "5201JVC", "Jose");

				coche.bastidor = "1200V5";
				//coche.conductor = "Fran"; //Al dejarlo por defecto el acceso es protected
				//coche.color = "Amarillo"; //No accede porque el acceso es private
				/*coche.matricula = "1234AAA"; //El acceso protected no permite acceder
				desde otro paquete*/
	}



}
