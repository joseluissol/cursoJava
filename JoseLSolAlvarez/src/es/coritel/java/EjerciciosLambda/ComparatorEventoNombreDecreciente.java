package es.coritel.java.EjerciciosLambda;

import java.util.Comparator;

public class ComparatorEventoNombreDecreciente implements Comparator<Evento> {

	@Override
	public int compare(Evento evento0, Evento evento1) {
		return (-1) * (evento0.getNombre().compareTo(evento1.getNombre()));
	}

}
