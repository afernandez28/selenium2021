package poo;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1=new Empleado("Sergio");
		Directivo d1=new Directivo("Ivan");
		Operario op1=new Operario("Silvia");
		Oficial of1=new Oficial("Lilia");
		Tecnico tec1=new Tecnico("Luis");
		
		Empleado e2=new Tecnico("polimorfismo");
		
	//siempre llama el metodo toString internamente aunque no se escriba 
	System.out.println(e1);
	System.out.println("");
	System.out.println(d1.toString());
	System.out.println("");
	System.out.println(op1);
	System.out.println("");
	System.out.println(of1);
	System.out.println("");
	System.out.println(tec1);
	System.out.println("");
	System.out.println(e2);
		

	}

}
