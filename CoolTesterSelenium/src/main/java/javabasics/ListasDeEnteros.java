package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
	//Declarar nuestra lista de enteros
	/***
	 * Como sacar el numero mayor y el numero menor de la lista
	 * **/	
		
		List<Integer> listaDeNumeros=new ArrayList<>();
		listaDeNumeros.add(100);
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(50);
		listaDeNumeros.add(50);
		listaDeNumeros.add(6);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		listaDeNumeros.add(50);
		
		//imprime todos los elementos de nuestrra lista
	    System.out.println("Lista sin ordenamiento: "+listaDeNumeros);
	    
	    
	    //ordena la lista de menor a mayor
	    Collections.sort(listaDeNumeros);
	    System.out.println("Lista con un ordenamiento de menor a mayor con duplicados: "+listaDeNumeros);
	    
		//Ordenamos e invertimos el orden de nuestra es decir de mayor a menor
	    Collections.sort(listaDeNumeros, Collections.reverseOrder());
	    
	  //imprime todos los elementos con un orden de mayor a menor
	    System.out.println("Lista con un ordenamiento de mayor a menor con duplicados: "+listaDeNumeros);
	    
	    //quitar elementos repetidos  en la lista
	    
	    
	    Object ultimo=null;
	    
	    int numCount=0;
	    
	    Iterator<Integer> i=listaDeNumeros.iterator();
	    
	    while(i.hasNext()) {
	    	Object temp=i.next();
	    	if(temp.equals(ultimo)) {
	    		
	    		
	    		i.remove();
	    		numCount++;
	    		
	    		
	    	}else{
	    		
	    		ultimo=temp;
	    		
	    	}//fin else
	    }//fin de while
	    
	    
	    //duda aqui al mostrar la lista ya quitando los duplicados ya no es necesario realizar un ordenamiento___
	    
	    System.out.println("Lista quitando duplicados de mayor a menor: "+ listaDeNumeros);
	    System.out.println("El numero estaba repetido: "+numCount);
	    //primero ordenamos de menor a mayor y posteriormente revertimos el orden de mayor a menor.
	    Collections.reverse(listaDeNumeros);
	    System.out.println("Lista ordenada de menor a mayor: "+listaDeNumeros);	   
	   // Collections.max(listaDeNumeros);
	    System.out.println("El numero mayor es:"+ Collections.max(listaDeNumeros));
	   // Collections.min(listaDeNumeros); por	que si lo hago asi me muestra toda la lista de nuevo?
	   // System.out.println("El numero menor es:"+ listaDeNumeros);
	    System.out.println("El numero menor es:"+ Collections.min(listaDeNumeros));
	    
	    
		

	}//fin del main
;
}//fin de la clase
