package es.coritel.java.EjercicioDiagramaClases;

import java.util.Date;

public class Villano extends Ciudadano implements BilleteTransporte{
	private boolean sociopatia;

	public Villano(String dni, String nombreCompleto, String direccion,
			Date fNac, char sexo, boolean sociopatia) {
		super(dni, nombreCompleto, direccion, fNac, sexo);
		this.sociopatia = sociopatia;
	}

	public boolean isSociopatia() {
		return sociopatia;
	}

	public void setSociopatia(boolean sociopatia) {
		this.sociopatia = sociopatia;
	}

	@Override
	public void viajaMetro() {
		System.out.println("Viajo en Metro.");
	}

	@Override
	public void viajaTren() {
		System.out.println("Viajo en Tren.");
	}

	@Override
	public void descuentoViaje() {
		System.out.println("No tengo descuento, soy malo.");
	}



}
