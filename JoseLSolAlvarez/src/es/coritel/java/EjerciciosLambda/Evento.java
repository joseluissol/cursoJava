package es.coritel.java.EjerciciosLambda;

public class Evento {
	private int id;
	private String nombre;
	private String type;
	private int seatsAvailable;

	public Evento() {
		super();
	}

	public Evento(int id, String nombre, String type, int seatsAvailable) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.type = type;
		this.seatsAvailable = seatsAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", type=" + type
				+ ", seatsAvailable=" + seatsAvailable;
	}

}
