package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeString {

	public static void main(String[] args) {
		// una lista de string remover iguales e invertir orden
		
		List<String> listaDeNombre=new ArrayList<>();
		listaDeNombre.add("A 1");
		listaDeNombre.add("Persona 2");
		listaDeNombre.add("Persona 3");
		listaDeNombre.add("C 4");
		listaDeNombre.add("Z 5");
		listaDeNombre.add("B 3");
		listaDeNombre.add("Persona 3");
		
		//imprimir lista tal cual esta
		System.out.println(listaDeNombre);
		
		
		//Se ordene la lista en este caso en orden alfabetico del A a la Z
		Collections.sort(listaDeNombre);
		System.out.println(listaDeNombre);
		
		//Se ordena la lista en este caso en orden inverso de la Z a la A
		Collections.sort(listaDeNombre,Collections.reverseOrder());
		System.out.println(listaDeNombre);
		
		
		//guarda todo los eleenmtps sin que se repitan los elementos repetidos de la lista de string
		
		List<String> nombresSinRepetir=listaDeNombre
				.stream().distinct().collect(Collectors.toList());
		System.out.println(nombresSinRepetir);
		
		
		
		

	}

}
