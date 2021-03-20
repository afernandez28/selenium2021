package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    
	private int carga;
	
	
	public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.carga=carga;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCarga()
	{
		return carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo:" + modelo + "\nCarga"
				+ carga;

	}
  


}
