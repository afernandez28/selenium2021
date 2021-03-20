package javabasics;

public class Metodos {
	
	int numero1, numero2, numero3;
	
	//Constructor
	
	public Metodos()
	{
		
	}
	
	public Metodos(int numero1, int numero2)
	{
		this.numero1=numero1;
		this.numero2=numero2;
		
	}
	
	public void mensajeBienvenida()
	{
		System.out.println("Bienvenidos al curso");
		
	}
	
	public int sumatoria()
	{
		
		return numero1+numero2;
	}
	
	public String mostrarNombre(String nombre)
	{
		System.out.println(nombre);
		return nombre;
	}
	
	public String concatenarNombres(String nombre, String apellido)
	{
		
		return nombre+ " "+apellido;
	}
	
	

}
