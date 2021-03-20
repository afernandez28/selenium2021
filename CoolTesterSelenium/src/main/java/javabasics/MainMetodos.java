package javabasics;

public class MainMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Metodos objeto=new Metodos(10,20);
		System.out.println(objeto.sumatoria());
		objeto.mensajeBienvenida();
		objeto.mostrarNombre("Angelica Fernandez");
		System.out.println(objeto.concatenarNombres("Elizabeth", "Trejo"));
		
	}

}
