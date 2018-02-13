/*Programa Cine:
*/

import java.util.Scanner;

public class ProgramaCine3 {
	public static void main(String[] args) {
		// CREACION DE VARIANLES
		
		boolean siIrAlCine = false;
		double precioEntrada = 7.50 ;
		int horaUsuario =0;
		int horaCine_1 = 21;
		int horaCine_2 =23;
		
		//PETICION DE DATOS
			System.out.println("introduzca  su nombre");
			
			Scanner escaner = new Scanner(System.in);
	        String nombre = escaner. nextLine();
	        System.out.println("El nombre es " + nombre + ".introduzca capital");
                double capital = escaner.nextDouble();
            System.out.println("introduzca  la hora que puedes ir");
            horaUsuario = escaner.nextInt();
            
            siIrAlCine = siTenemosCapital(precioEntrada, capital);
            siIrAlCine =siHayPase (horaUsuario, horaCine_1);
            if (siIrAlCine)
            System.out.println("Si podemos ir al cine");
            else
           	System.out.println("No podemos ir al cine");	           
            escaner.close();
} 
            if (capital < precio) {
            	return false;
            } else {
            	return true;
            }
	}

}
