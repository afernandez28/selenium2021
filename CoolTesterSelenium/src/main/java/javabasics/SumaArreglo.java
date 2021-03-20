package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {
		// Crear nuestro arreglo de 100 indices
		
		int[] numeros=new int[100];
		int suma =0;
		
	   //Recorreo el arreglo asigna numero y sumar
		for(int i=0;i<numeros.length;i++) {
			
			numeros[i]=i+1;
			suma+=numeros[i];
			//suma=suma+ numeros[i];
		}
		
		System.out.println(suma);

	}

}
