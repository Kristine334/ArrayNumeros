
public class array4 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		
		
		int aux = tabla [tabla.length-1];
		
		
		for ( int i = tabla.length-1; i > 0; i++)
			tabla[i] = tabla [i-1];
			
			
			
		tabla[0] = aux;
			
			
		}


	}


