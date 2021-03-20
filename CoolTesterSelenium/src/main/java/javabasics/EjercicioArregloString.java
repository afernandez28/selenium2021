package javabasics;

import javax.swing.JOptionPane;

public class EjercicioArregloString {

	public static void main(String[] args) {
		String cadena[]=new String[3];
		
		rellenarArreglo(cadena);
		mostrarArreglo(cadena);
				

	}
	
	public static void rellenarArreglo(String arreglo[])
	{
		
		for(int i=0;i<arreglo.length;i++) {
		
			String texto=JOptionPane.showInputDialog("Ingresa un cadena");
			arreglo[i]=texto;
		}
	}
	
	public static void mostrarArreglo(String arreglo[])
	{
		for(int i=0;i<arreglo.length;i++) {
			
			System.out.println(arreglo[i]);
		}
		
	}
	
	

}
