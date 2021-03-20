package poo;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {
		
		
		LeerProperties prop=new LeerProperties();
		prop.getSystemProperties();
		
		String mensaje=System.getProperty("MENSAJE");
		String mensaje2=System.getProperty("HOLA");
		String mensaje3=System.getProperty("SERGIO");
		int numero=Integer.parseInt(System.getProperty("NUMERO"));
		
		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(numero);
		
		prop.setSystemPropFileName(System.getProperty("user.dir")+"\\src\\main\\resources\\datafile\\data2.properties");
		prop.getSystemProperties();
		String archivo2=System.getProperty("MENSAJE");
		String archivo3=System.getProperty("MENSAJE2");
		System.out.println(archivo2);
		System.out.println(archivo3);
		
	}

}
