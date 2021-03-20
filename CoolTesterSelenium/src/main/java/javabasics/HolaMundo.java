package javabasics;

public class HolaMundo {//open class
	/*
	String miNombre="Angelica Fernández";
	int edad=30;
	double edadDoble=30.123445; //casi no se usa
	char letra='G'; //casi no se usa
	boolean bandera=true;*/
	
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		double numero1=500.00035;
		double numero2=35.37;
		String nombre="Angelica";
		double resultado=numero1+numero2;
		
		String test=nombre+numero2;//en este caso concatenara Angelica3537
		System.out.println("El resultado de la suma es:"+resultado);
		System.out.println("El resultado de la suma es:"+(numero1+numero2));
		System.out.println("Test: "+test);
		
		
	}

}//end class
 