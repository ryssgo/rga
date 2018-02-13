package com.mipaquete;

public class EjemplosBooleanos {

	public static void  funcionPrincipal() {
		System.out.println("EjemplosBooleanos");
	
		int a =  8   ;
	    int b =  9   ;
	    operadoresComparacion(a, b);
	}
	public static void operadoresComparacion (int a, int b){
    if(a == b) {
	    System.out.println("Son iguales");
	}
	if (a > b)
		System.out.println( a + " mayor que " + b);
	if (a <=b)
		System.out.println( a + " menor o igual que " +  b);
	if (a >= b)
		System.out.println( a + " mayor igual que " +  b);
	if (a <= b)
		System.out.println( a + " menor o igual que " +  b);
	if (a != b)
		System.out.println( a + " distinto que " +  b);
}
}
