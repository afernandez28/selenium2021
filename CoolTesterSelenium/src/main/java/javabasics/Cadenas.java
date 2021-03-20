package javabasics;

public class Cadenas {

	public static void main(String[] args) {
		
		String cadena="Hola Curso Selenium";
		
		String subcadena=cadena.substring(0,4);
		
		System.out.println(subcadena);
		
		
		//Con equals si le importa mayuscula o minuscula
		
		if(cadena.equals("hola Curso Selenium"))
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas no son iguales");
			
		}
		
		//Ignora si es mayuscula o minuscula
		if(cadena.equalsIgnoreCase("hola Curso Selenium"))
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas no son iguales");
			
		}
		
		
		if(cadena.contains("Curso"))
		{
			System.out.println("Si esta el elemento");
		}
		else
		{
			System.out.println("No esta el elemento");
		}

	}

}
