package javabasics;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce el mes");
		String mes=leer.next();
		
	switch(mes)
		{
		case "1":
			System.out.println("Enero");
			break;
			
		case "2":
			System.out.println("Febrero");
			break;
			
		case "3":
			System.out.println("Marzo");
			break;	
			
			default: System.out.println("El mes es inncorrecto");
				
		
		
		}
		
		

	}

}
