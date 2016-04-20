package es.coritel.java.EjercicioDiagramaClases;

import java.util.Date;

public class MainDiagramaClases {

	public static void main(String[] args) {

		Villano villano1 = new Villano("2515", "VaterMan", "Su casa", new Date(0),
				'h', true);
		Villano villano2 = new Villano("2233", "DiodoMan!", "El mundo", new Date(1),
				'H', false);

		Villano[] arrVillanos = new Villano[2];

		arrVillanos[0] = villano1;
		arrVillanos[1] = villano2;

		Poder poder = new Poder(true, false, false);

		Superheroe superheroe = new Superheroe("2255", "SuperChero", "Mansion Playboy",
				new Date(0), 'H', poder, arrVillanos);

		System.out.println(villano1.getDireccion());
		System.out.println("Vuela? " + superheroe.getPoder().isVuelo());
		System.out.println("Es sociopata? " + villano2.isSociopatia());

		villano1.viajaMetro();

		Ciudadano ciudadano = new Ciudadano("2255", "Simon", "Rio",
				new Date(0), 'H');
		System.out.println(ciudadano.getSexo());
		ciudadano.cambioSexo();
		System.out.println("Cambio de sexo");
		System.out.println(ciudadano.getSexo());

		superheroe.getPoder().devuelvePoder();
	}

}
