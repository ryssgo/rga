package com.incyde;

import java.util.Scanner;

public class Clase_Principal
    {
        static float capital;
	    static float precio= 7.5f;
	    static int  horaIda;
	    static int horaPase_1 = 7;
	    static int horaPase_2 = 9;
	    static int horaRecomendada;
	    
	    public static void main(String[] args)
	    {
	    	
		    boolean resultadoCine;
		    System.out.println("Programa Cine V4");
		    pedirDatos();
		    resultadoCine = comprobarSiVamosAlCine();
		    mostrarResultado(resultadoCine);
		    
		}
	    public static void pedirDatos () {
	    	{
	    	Scanner teclado;
		    teclado = new Scanner(System.in);
		    System.out.println("Introduzca su dinero");
		    capital = teclado.nextFloat();
		    System.out.println("Introduzca La Hora De ida:");
		    horaIda = teclado.nextInt();
		    teclado.close();
		    return;
	    	}
	 
	    }
	    public static boolean comprobarSiVamosAlCine()
	    {
	    	if (capital >= precio) {
	    		if (horaIda >= horaPase_1 - 130
	    				&& horaIda <= horaPase_1) {
	    			horaRecomendada =horaPase_1;
	    					return true;
	    		}
	    		else if(horaIda >= horaPase_2 && horaIda <= horaPase_2) {
	    				horaRecomendada = horaPase_2;
	    				return true;
	    			}
	    		if (horaIda <= horaRecomendada )
	    			return true;		
	    	}
	    	   return false;
	  
    }
	    public static void mostrarResultado(boolean resultado) {
	    	{
	    		System.out.println("La hora recomendada es :" + horaRecomendada);
	    		
		if (resultado == true ) {
			System.out.println ("SÍ podemos ir al cine");
		} else {
			System.out.println ("NO que podemos ir al cine");
		
		}	
	  }
	   	    
   }
    
 }
