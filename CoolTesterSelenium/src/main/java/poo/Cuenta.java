package poo;

public class Cuenta {
	
	//modificaciones de accesos son: private, protected, public
	//private solo las que esten en la misma clase
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 * **/
	
	//esto es un constructor, esto no sirve para crear instancias desde otra clase,
	//y tener acceso a sus metodos
	public Cuenta(){
	}//cierra constructor Cuenta
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param String String double double
	 * **/
	
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
			
			this.nombre=nombre;
			this.numeroCuenta=numeroCuenta;
			this.tipoInteres=tipoInteres;
			this.saldo=saldo;
	}
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param Object
	 * **/
	
	public Cuenta(Cuenta c) {
		
		nombre=c.nombre;
		numeroCuenta=c.numeroCuenta;
		tipoInteres=c.tipoInteres;
		saldo=c.saldo;
		
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param String
	 * **/
	//con el metodo set obtener el valor
	public void setNombre(String nombre)
	{
	   this.nombre=nombre;
	   
	}
	

	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param numeroCuenta
	 * **/
	
	public void setNumeroCuenta(String numeroCuenta)
	{
	   this.numeroCuenta=numeroCuenta;
	   
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param double
	 * **/
	
	public void setTipoInteres(double tipoInteres)
	{
	   this.tipoInteres=tipoInteres;
	   
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param double
	 * **/
	
	public void setSaldo(double saldo)
	{
	   this.saldo=saldo;
	   
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return Strinf 
	 * **/
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return string 
	 * **/
	
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return double 
	 * **/
	
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return double 
	 * **/
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return double 
	 * **/
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto=true;
		
		if(n<0) {
			ingresoCorrecto=false;
		}else {
			
			this.saldo=saldo+n;
		}
		
		return ingresoCorrecto;
	}
	
	
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return double 
	 * **/
	
	public boolean reintegro(double n) {
		boolean reintegroCorrecto=true;
		
		if(n<0) {
			reintegroCorrecto=false;
		}else if(saldo>=n) {
			
			//saldo=saldo-n
			saldo-=n;
			
		}
		else {
			reintegroCorrecto=false;
		}
		
		return reintegroCorrecto;
	}
	
	/**
	 * 
	 *@author Angelica
	 *@date 06/03/2021
	 *@param N/A
	 *@return double 
	 * **/
	
	public boolean transferencia(Cuenta c, double n) {
	
		boolean correcto=true;
		
		if(n<0) {
			correcto=false;
		
		}
		else {
			if(saldo>=n) {
				reintegro(n);
				c.ingreso(n);
				
			}
			else {
				correcto=false;
			}
		}
		return correcto;
	}
	
	
	
	
	

}
