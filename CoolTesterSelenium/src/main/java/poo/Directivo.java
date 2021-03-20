package poo;

public class Directivo extends Empleado {

	/**
	 * 
	 */
	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Directivo(String nombre) {
		super(nombre);
		System.out.println("Constructor de Directivo ");
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" -> Directivo";
	}
	

}
