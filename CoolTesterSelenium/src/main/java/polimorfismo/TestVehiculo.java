package polimorfismo;

public class TestVehiculo {


	public static void main(String[] args) {
		
		Vehiculo misVehiculos[]=new Vehiculo[4];
		misVehiculos[0]=new Vehiculo("001", "Ford ", "2009");
		misVehiculos[1]=new VehiculoTurismo(8,"002","Audi","2012");
		misVehiculos[2]=new VehiculoDeportivo(6,"006","Mazda","2020");
		misVehiculos[3]=new VehiculoFurgoneta(10,"007","Toyota","2021");
		

		
		//vehiculos =misVehiculos[1]
		for(Vehiculo vehiculos :misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		
		
		Vehiculo vehiculoDeportivo=new VehiculoDeportivo(9,"009","Bochito","2020");
		System.out.println(vehiculoDeportivo.mostrarDatos());
		

	}

}
