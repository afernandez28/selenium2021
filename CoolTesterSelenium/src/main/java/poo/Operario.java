package poo;

public class Operario  extends Empleado{
	
	String nombre;
	
	public Operario(String nombre) {
		super(nombre);
		System.out.println("Constructor del operario");
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"->Operario";
	}

}

