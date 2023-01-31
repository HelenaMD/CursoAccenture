package ejerciciosMiguel.reloj;

public class Reloj {
	
	public static String resetString(int i) {
		return String.valueOf(i);
	}
	
	public static void reloj() throws InterruptedException {
		//Variables
		int i;
		int j;
		int k;
		String numI;
		String numJ;
		String numK;
		String cero = "0";
		//Primer bucle horas
		for (i = 0; i <= 24; i++) {
			numI = resetString(i);
			//Segundo bucle minutos
			for (j = 0; j <= 60; j++) {
				numJ = resetString(j);
				//Tercer bucle segundos
				for (k = 0; k <= 60; k++) {
					numK = resetString(k);
					if (i < 10) {
						numI = cero + numI;
					}
					if (j < 10) {
						numJ = cero + numJ;
					}
					if (k < 10) {
						numK = cero + numK;
					}
					//Muestro por pantalla
					System.out.println(numI+":"+numJ+":"+numK+"\n");
					//Espera un segundo
					Thread.sleep(1000);
					
					//Quito los ceros de los numeros para que no se acumulen.
					numI = resetString(i);
					numJ = resetString(j);
					numK = resetString(k);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			reloj();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
