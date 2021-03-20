package poo;

public class Empleado {

	
	private String nombre;
	
	/**
	 * 
	 *@author Angelica
	 *@date 09/03/2021
	 *@param N/A
	 * **/
	public Empleado() {
		
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 09/03/2021
	 *@param String
	 * **/
	
	public Empleado(String nombre) {
		this.nombre=nombre.toString();
		System.out.println("Constructor de empleado: "+nombre);
		System.out.println("");
	}
	

	/**
	 * 
	 *@author Angelica
	 *@date 09/03/2021
	 *@param String
	 * **/
	//mi duda aqui esto es parecido al constructor, cual seria la ventaja???
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return string 
	 * **/
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return String 
	 * **/
	
	@Override
	public String toString()
	{
		return "Empleado " + nombre;
	}
	

}
