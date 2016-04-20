package es.coritel.java.EjerciciosCollections.Ejercicio7;

public class Persona implements Comparable<Persona>{
	private int edad;
	private String nombre;

	public Persona() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre + ", edad: " + edad;
	}

	@Override
	public int compareTo(Persona pers) {
		int result;
		//Ejercicio 7.1
//		if(this.edad > pers.edad){
//			result = 1;
//		} else if (this.edad == pers.edad) {
//			result = 0;
//		} else {
//			result = -1;
//		}


		//Ejercicio 7.4
		if(this.nombre.compareTo(pers.nombre) == 0){
			if(this.edad > pers.edad){
				result = 1;
			} else if (this.edad == pers.edad) {
				result = 0;
			} else {
				result = -1;
			}
		} else{
			result = this.nombre.compareTo(pers.nombre);
		}
		return result;
	}


}
