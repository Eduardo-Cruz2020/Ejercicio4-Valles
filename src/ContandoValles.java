
public class ContandoValles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 22;
		String path= "UDDDUDUUDUDUUUUDDDDDUU";
		
		System.out.println("\nNumero de valles atravesados: " + counttingValleys(steps, path));
		
		
	}
	
	public static int counttingValleys(int steps, String path) { // Cuenta el numero de valles ue atraviesa el viajero
		int numValles = 0;
		int nivelMar = 0;
		boolean dentroValle = false;
 		
		for (int n=0; n<steps; n ++) { 
			
			char step = path.charAt (n);
			
			if (step == 'D') {
				if (nivelMar == 0) { //Por definicion: si estamos al nivel del mar y descendemos entonces entramos a un valle
					nivelMar --;
					numValles ++;
					dentroValle = true;
					System.out.println("Entramos a un valle");
				}
				else 
					nivelMar --;
			}				
			else 
				nivelMar ++;
				if (dentroValle == true && nivelMar == 0) { // Esto indica que regresamos al nivel del mar
					dentroValle = false;
					System.out.println("Salimos del valle");
				}
				
			System.out.println("Paso: "+ step+ " nivel del mar: "+ nivelMar);
			
		}
		
		
		return numValles;
	}

}
