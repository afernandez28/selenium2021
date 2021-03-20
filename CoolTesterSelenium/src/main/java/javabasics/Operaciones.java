package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {//abre clase
	/**
	 * 1) Declarar dos variables numericas ingresando el valor
	 * por el teclado, muestra por consola la suma, resta, multiplicacion,}division
	 * 
	 * **/
	
	
	
	public static void main(String[] args) {
		
		double numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 1"));
		double numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 2"));
		
		//suma
		System.out.println("Suma: "+(numero1+numero2));
		JOptionPane.showMessageDialog(null,"La suma es "+( numero1+numero2));
		
		//resta
		System.out.println("Resta: "+(numero1-numero2));
		JOptionPane.showMessageDialog(null, "La resta es "+(numero1-numero2));
		
		//multiplicacion
		System.out.println("Multiplicacion: "+(numero1*numero2));
		JOptionPane.showMessageDialog(null, "La multiplicacion es "+(numero1*numero2));
		
		//division
		System.out.println("Division: "+(numero1/numero2));
		JOptionPane.showMessageDialog(null, "La division es "+(numero1/numero2));
	}
	

}//cierra clase
