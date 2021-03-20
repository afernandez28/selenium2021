package poo;

import java.util.Scanner;

import poo.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre;
		String numero;
		double tipo;
		double importe;
		
		//vamos a crear un objeto de nuestra clase cuenta usando el constructor sin parametros
		
		Cuenta cuenta1=new Cuenta();
		
		//asignar valor a las variables por teclado
		
		System.out.println("Ingresa nombre: ");
		nombre=teclado.next();
		
		System.out.println("Ingresa numero de cuenta: ");
		numero=teclado.next();
		
		System.out.println("Ingresa tipo de interes");
		tipo=teclado.nextDouble();
		
		System.out.println("Ingresa saldo");
		importe=teclado.nextDouble();
		teclado.close();
		
		//asignar valores con nuestros metodos set. Con set asignamos valor
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		System.out.println("Nombre de la cuenta 1 "+cuenta1.getNombre());
		
		
		//vamos a crear un objeto de nuestra clase cuenta usando el constructor con parametros
		Cuenta cuenta2=new Cuenta("Angelica","12345678",12.3,3000.56);
		System.out.println("Nombre de la cuenta 2: "+cuenta2.getNombre());
		
		
		//vamos a crear un objeto de nuestra clase cuenta usando el constructor con objeto
		Cuenta cuenta3=new Cuenta(cuenta1);
		System.out.println("Cuenta 1 saldo inicial: "+cuenta1.getSaldo());
		System.out.println("Cuenta 3 saldo inicial: " + cuenta3.getSaldo());
		
		//ingreso en la cuenta 1
		cuenta1.ingreso(4000);
		System.out.println("************");
		System.out.println("Cuenta 1 saldo despues del ingreso: "+cuenta1.getSaldo());
		System.out.println("Cuenta 3 saldo: " + cuenta3.getSaldo());
		
		//mostrar datos de la cuenta2
		System.out.println("*****Datos de la cuenta 2********");
		System.out.println("Nombre de la cuenta 2: "+cuenta2.getNombre());
		System.out.println("Numero de cuenta de la cuenta 2: "+cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interes de la cuenta 2: "+cuenta2.getTipoInteres());
		System.out.println("Saldo de la cuenta 2: "+cuenta2.getSaldo());
		
		//realizar una tranferencia de 2000 de la cuenta 3 a la cuenta 2
		System.out.println("==============================");
		System.out.println("Hacer transferencia entre cuentas");
		cuenta3.transferencia(cuenta2, 2000);
		
		//mostrar datos de la cuenta2
		System.out.println("*****Datos de la cuenta 2********");
		System.out.println("Nombre de la cuenta 2: "+cuenta2.getNombre());
		System.out.println("Numero de cuenta de la cuenta 2: "+cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interes de la cuenta 2: "+cuenta2.getTipoInteres());
		System.out.println("Saldo de la cuenta 2: "+cuenta2.getSaldo());
		
		
		//mostrar datos de la cuenta3
		System.out.println("*****Datos de la cuenta 3********");
		System.out.println("Nombre de la cuenta 3: "+cuenta3.getNombre());
		System.out.println("Numero de cuenta de la cuenta 3: "+cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interes de la cuenta 3: "+cuenta3.getTipoInteres());
		System.out.println("Saldo de la cuenta 3: "+cuenta3.getSaldo());
		


		
	}

}
