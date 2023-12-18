
public class array5 {
	static int factorial (int x) {
		int fact = 1;
		for (int i = 2; i <= x ; i++)
			fact = fact*i;
		return fact;
	}

	public static void main(String[] args) {  /* Se declara la tabla */
		int tabla[]= new int [10];
		
		for(int i = 0; i< tabla.length; i++) /* Se rellena la tabla con factoriales de 0-9 */
			tabla[i]= factorial(i);
		
		for (int i = 0; i< tabla.length; i++) /* Se muestra la tabla en pantalla */
			System.out.println(i + ": " + tabla[i]);
			

	}

}
