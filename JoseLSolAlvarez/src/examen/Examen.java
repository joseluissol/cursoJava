package examen;

public class Examen {

	public Examen() {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		new Examen().go();
		boolean flag = false;

		if (flag = true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		Father father = new Father();
		Son son = new Son();

		//son = (Son) father; //Valido en tiempo de compilacion, no valido en tiempo de ejecucion
		father = son;
		father = (Father) son;


		Number n = 7;
		Integer i = 3;
		i= (Integer) n;
		System.out.println(i);
	}
	public void go(){
		System.out.println("3");
	}
	static{
		System.out.println("4");
	}

}
