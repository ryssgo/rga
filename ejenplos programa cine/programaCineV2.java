// Fichero: ProgramaCineV2.java

public class ProgramaCineV2
{
    public static void main(String[] args) 
	{
		int numCompadres = 0;
		System.out.println("Version 2 programa Cine");
		
		while (numCompadres <= 5)
		{
			System.out.println( "numCompadres "
		+ numCompadres );
		numCompadres = numCompadres + 1;
        }
		System.out.println("intentando hacer lo mismo");
		numCompadres= 0;
		do
		{
			System.out.println( "numero compadres "	
			   + numCompadres );
		    numCompadres = numCompadres + 1;
		} while (numCompadres <= 5);
	}
}		