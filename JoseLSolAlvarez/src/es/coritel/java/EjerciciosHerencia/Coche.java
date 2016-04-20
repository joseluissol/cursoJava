package es.coritel.java.EjerciciosHerencia;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Coche {


	public String bastidor;
	private String color;
	protected String matricula;
	String conductor;

	//Ejercicio 3
	public Coche(String bastidor, String color, String matricula, String conductor) {
		this.bastidor = bastidor;
		this.color = color;
		this.matricula = matricula;
		this.conductor = conductor;
	}

	//Ejercicio 4
	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}


	public void cambiaConductorColor(String conductor, String color){
		setConductor(conductor);
		setColor(color);
	}

	public static void mensaje() {
		System.out.println("Esto es un mensaje");
	}





}
