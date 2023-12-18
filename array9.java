
public class array9 {
	
		/*Comprobar si un número está repetido */
	static boolean seRepite(int t[],int numero,int cantidad) {
		for (int i =0; i< cantidad; i++)
			if(t[i]==numero)
				return true;
		
		return false;
	}
	public static void main(String[] args) {
		int tabla[] = new int [8];
		
		/*Calcular ocho posiciones diferentes */
		
		for (int i=0; i<tabla.length; i++){
			int aleatorio=(int)Math.floor(Math.random()*40);
			while (seRepite(tabla, aleatorio, i))
				aleatorio=(int)Math.floor(Math.random()*40);
			tabla[i] = aleatorio;		
	}	
		/* Visualizar tabla */
		for (int i=0; i<tabla.length; i++){
			System.out.println (i + " - " + tabla[i]);

	}

	}
}