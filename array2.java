
public class array2 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14,7,5};
		
		int suma1 = 0;
		int suma2 = 0;
		
		for (int i = 0; i< (tabla.length/2); i++) 
			suma1 = suma1 + tabla [i];
		
		System.out.println("La suma de la primera mitad es: " + suma1);
		
		for (int i =(tabla.length/2); i< tabla.length; i++ )
			suma2 = suma2 + tabla [i];
		
		System.out.println("La suma de la segunda mitad es: " + suma2);
		
		
		if (suma1>suma2)
			System.out.println ("La primera mitad suma más que la segunda");
		else
			System.out.println ("La segunda mitad suma más que la primera");
		
		
		
	}

}
