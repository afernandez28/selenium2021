package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		
		int numeroTemporal;
		int resultado;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un numero que desea multiplicar");
		numeroTemporal=teclado.nextInt();
		
		//solictaremos el numero siempre y cuando el numero ingresado sea menor a 0
		while(numeroTemporal<=0)
		{
			System.out.println("El numero capturado debe ser mayor a 0, tu numero es ["+numeroTemporal+" ], ingresa numero nuevamente");
			numeroTemporal=teclado.nextInt();
			
			
		}
		
		
		for(int i=1; i<=10;i++)
		{
			resultado=numeroTemporal*i;
			System.out.println("La multiplicacion " +numeroTemporal+" x "+ i + " = "+resultado);
		}
		
		teclado.close();
		

	}//cierra main

}//cierra clase
