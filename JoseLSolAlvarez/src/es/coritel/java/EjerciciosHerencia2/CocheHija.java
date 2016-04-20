package es.coritel.java.EjerciciosHerencia2;

import es.coritel.java.EjerciciosHerencia.Coche;

public class CocheHija extends Coche{

	public CocheHija(String bastidor, String color, String matricula,
			String conductor) {
		super(bastidor, color, matricula, conductor);
		this.bastidor = bastidor;
		//this.color = color; //Al ser private no permite acceder desde cualquier otra clase
		this.matricula = matricula;
		//this.conductor = conductor; //El modificador por defecto es protected.
	}


}
