package javabasics;

import javax.swing.JOptionPane;

public class AreaCirculo {

	/***
	 * Calcula el area de un circulo formula PI * radio al cuadrado
	 * ingresa el radio por circulo por teclado
	 * **/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio"));
         
         double area=Math.PI*Math.pow(radio,2); //con esto de PI ya java puede calcular el area
         
         System.out.println("El area del circulo es "+area);
	}

}
