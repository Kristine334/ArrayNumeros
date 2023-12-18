
public class array7 {

	public static void main(String[] args) {

		
			
			int tabla[]= {3,6,2,77,3,10,23,14};		
			int contadorpares=0;
			int contadorimpares=0;
			
			for (int i=0; i<tabla.length;i++)
				if (tabla[i] % 2==0)
					contadorpares++;
			System.out.println("Hay " + contadorpares + " números pares");
			
			for (int i=0; i<tabla.length;i++)
				if (tabla[i] % 2==1)
					contadorimpares++;
			System.out.println("Hay " + contadorimpares + " números impares");
			
			if (contadorpares<contadorimpares)
				System.out.println ("Hay más impares que pares");
			if (contadorpares>contadorimpares)
				System.out.println ("Hay más pares que impares");
			if (contadorimpares==contadorpares)
				System.out.println("Hay el mismo número de pares que de impares");
			

		}

	


	}


