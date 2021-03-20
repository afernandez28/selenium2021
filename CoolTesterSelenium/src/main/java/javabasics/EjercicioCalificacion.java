package javabasics;

import javax.swing.JOptionPane;

public class EjercicioCalificacion {

	public static void main(String[] args) {
		
		
		// que deberia pasar si estaba en el rango de 61 a 69??
		// es correcto que haya menor igual a 90 y la otra condicion mayor o igual a 90
		double calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion"));
		
		if(calificacion<=60) {
			
			JOptionPane.showMessageDialog(null, "Reprobado");
				
			}
		else
		{
			if(calificacion>=70 && calificacion <=90 )
			{
				JOptionPane.showMessageDialog(null, "Aprobado buena");
			}
			else
			{
				if(calificacion>90) {
				JOptionPane.showMessageDialog(null, "Aprobado sobresaliente");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No esta em el rango de calificaciones");
				}
				
			}
		}

	}

}
