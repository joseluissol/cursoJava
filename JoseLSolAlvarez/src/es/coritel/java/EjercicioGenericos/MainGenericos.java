package es.coritel.java.EjercicioGenericos;

import java.util.ArrayList;
import java.util.List;


public class MainGenericos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {


		List<String> al0 = new ArrayList<String>();
		List<String> al1= new ArrayList<>();
		List al2 = new ArrayList();

		ArrayList<String> al3 = new ArrayList<String>();
		ArrayList<String> al4 = new ArrayList<>();


		List<Number> n = new ArrayList<Number>();
		List<Integer> l	= new ArrayList<Integer>();

		//n = l;

		List<? extends Number> n2 = new ArrayList<Integer>();
		List<? extends Number> l2 = new ArrayList<Number>();

		n2 = l2;

		List<? super Integer> n3 = new ArrayList<Number>();
		List<? super Integer> l3 = new ArrayList<Integer>();

		n3 = l3;
	}

}
