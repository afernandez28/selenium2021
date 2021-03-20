package javabasics;

import javax.swing.JOptionPane;

public class Divisible {
/***
 * 6) Lee un numero por teclado e indica si es divisible entre 2(resto=0)
 * **/
	
	
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		//con el %validamos el residuo de la validacion
		if(numero%2==0)
		{
			System.out.println("El numero ingresado ["+numero+"] es divisible entre 2");
		}
		else
		{
			
			System.out.println("El numero ingresado ["+numero+"] es no divisible entre 2");
		}
		
	}
	
}
