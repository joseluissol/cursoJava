package es.coritel.java.EjerciciosExcepciones;

@SuppressWarnings("serial")
public class ExcepcionPersonalizada extends Exception {

	public ExcepcionPersonalizada() {
		super("Mi excepcion");
	}

	public  ExcepcionPersonalizada(String mensaje) {
		super(mensaje);
	}

	@Override
	public String getMessage() {
		return "Este es el mensaje: " + super.getMessage();
	}
}
