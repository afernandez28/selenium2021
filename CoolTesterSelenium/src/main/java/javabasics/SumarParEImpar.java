package javabasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		float par = 0;
		float impar = 0;
		float residuo;
		float numeroTemp;
		int numeroDeVecesARepetir;
		
		System.out.println("Ingrese la cantidad de veces que se va a repetir");
		numeroDeVecesARepetir=teclado.nextInt();
		
		for(int i=1; i<=numeroDeVecesARepetir; i++)
		{
			
			System.out.println("Ingrese el numero ["+i+"]");
			numeroTemp=teclado.nextFloat();
			
			while(numeroTemp<0)
				{
				
					 System.out.println("El numero es menor a 0, tu numero es:"+numeroTemp+ " , ingrese el numero nuevamente");
					 numeroTemp=teclado.nextFloat();
				}
			
			residuo=numeroTemp%2;
			
			if(residuo==0)
			{
				par+=numeroTemp;
				System.out.println("El numero es par: "+numeroTemp);
			}
			
			
			if(residuo !=0 && residuo >0) 
			{
				impar+=numeroTemp;
				System.out.println("El numero es impar: "+numeroTemp);
			}		
			
		}
		
		teclado.close();
		System.out.println("La sumatoria de los pares es: ["+par+"]");
		System.out.println("La sumatoria de los impares es: ["+impar+"]");
		

	}//cierra main

}//cierra clase
