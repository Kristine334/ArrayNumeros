
public class array8 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};


		boolean capicua = true;
		
		for (int i = 0; i < tabla.length/2; i++) /* Miramos si hay alguno que no coincide, sera suficiente para saber que no son capicua*/
			if(tabla[i]!= tabla[tabla.length-1-i])
			capicua = false;
		
		if (capicua)
			System.out.println ("Son capicua");
		else
			System.out.println ("No son capicua");

	
	}

}
