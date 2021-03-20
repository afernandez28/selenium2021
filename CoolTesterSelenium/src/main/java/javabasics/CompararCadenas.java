package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe la primera palabra");
		String palabra1=leer.next();
		
		System.out.println("Escribe la segunda palabra");
		String palabra2=leer.next();
		leer.close();//esto es para que al terminar de leer se cierre y ya no pida otra palabra
		
		if(palabra1.equalsIgnoreCase(palabra2))
		{
			System.out.println("Las palabras son iguales");
		}
		else
		{
			System.out.println("Las palabras no son iguales");
		}
		
		
		if(palabra1.equals(palabra2))
		{
			System.out.println("Las palabras son iguales");
		}
		else
		{
			System.out.println("Las palabras no son iguales");
		}
		
		
		String texto="Lorem Ipsum es simplemente el texto de relleno de las imprentas";
		String textoSinEspacios=texto.replace(" ", "");
		System.out.println(textoSinEspacios);
		
		System.out.println("EL texto tiene [ "+texto.length()+" ] caracteres");
		
		//hay una forma para reemplazar numeros pero ahorita no lo tenemos
		

	}//fin de maink
	

}//fin de la clase
