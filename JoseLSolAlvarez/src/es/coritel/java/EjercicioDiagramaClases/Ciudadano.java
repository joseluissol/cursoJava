package es.coritel.java.EjercicioDiagramaClases;

import java.util.Date;

public class Ciudadano {
	private String dni;
	private String nombreCompleto;
	private String direccion;
	private Date fNac;
	private char sexo;


	public Ciudadano(String dni, String nombreCompleto, String direccion,
			Date fNac, char sexo) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.fNac = fNac;
		this.sexo = Character.toUpperCase(sexo);
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Date getfNac() {
		return fNac;
	}


	public void setfNac(Date fNac) {
		this.fNac = fNac;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public void cambioSexo(){
		if(this.sexo == 'H'){
			this.sexo = 'M';
		} else if (this.sexo == 'M') {
			this.sexo = 'H';
		}
	}
}
