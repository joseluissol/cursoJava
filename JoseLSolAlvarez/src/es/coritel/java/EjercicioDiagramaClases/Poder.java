package es.coritel.java.EjercicioDiagramaClases;

public class Poder {
	private boolean vuelo;
	private boolean laser;
	private boolean aracnido;


	public Poder(boolean vuelo, boolean laser, boolean aracnido) {
		super();
		this.vuelo = vuelo;
		this.laser = laser;
		this.aracnido = aracnido;
	}


	public boolean isVuelo() {
		return vuelo;
	}
	public void setVuelo(boolean vuelo) {
		this.vuelo = vuelo;
	}
	public boolean isLaser() {
		return laser;
	}
	public void setLaser(boolean laser) {
		this.laser = laser;
	}
	public boolean isAracnido() {
		return aracnido;
	}
	public void setAracnido(boolean aracnido) {
		this.aracnido = aracnido;
	}

	public void devuelvePoder(){
		if(isVuelo()){
			System.out.println("Vuelo");
		} else if (isLaser()) {
			System.out.println("Laser");
		} else if (isAracnido()) {
			System.out.println("Aracnido");
		} else{
			System.out.println("No tiene un poder especial");
		}
	}
}
