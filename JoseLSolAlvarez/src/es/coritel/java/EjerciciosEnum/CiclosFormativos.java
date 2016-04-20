package es.coritel.java.EjerciciosEnum;

public enum CiclosFormativos {
	INFANTIL(4),
	PRIMARIA(6),
	SECUNDARIA(4),
	BACHILLER(2),
	GRADOMEDIO(2),
	GRADOSUPERIOR(2),
	GRADOUNIVERSITARIO(4),
	MASTER(2),
	DOCTORADO(1);

	private int cursos;
	private CiclosFormativos (int cursos){
		this.cursos = cursos;
	}
	public int getCursos() {
		return cursos;
	}
}
