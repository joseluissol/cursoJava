package es.coritel.java.EjercicioDiagramaClases;

import java.util.Date;

public class Superheroe extends Ciudadano {
	private Poder poder;
	private Villano[] arrayVillanos;
	public Superheroe(String dni, String nombreCompleto, String direccion,
			Date fNac, char sexo, Poder poder, Villano[] arrayVillanos) {
		super(dni, nombreCompleto, direccion, fNac, sexo);
		this.poder = poder;
		this.arrayVillanos = arrayVillanos;
	}


	public Poder getPoder() {
		return poder;
	}
	public void setPoder(Poder poder) {
		this.poder = poder;
	}
	public Villano[] getArrayVillanos() {
		return arrayVillanos;
	}
	public void setArrayVillanos(Villano[] arrayVillanos) {
		this.arrayVillanos = arrayVillanos;
	}


}
