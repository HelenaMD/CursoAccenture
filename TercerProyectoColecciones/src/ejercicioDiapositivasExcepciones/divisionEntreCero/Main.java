package ejercicioDiapositivasExcepciones.divisionEntreCero;

public class Main {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try {
			DivisionEntreCero d = new DivisionEntreCero(0, 300);
			d.dividirBEntreA();
		} /*catch (ArithmeticException ae) {
			System.out.println("Has intentado una operacion matematica imposible!");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("Se ha producido una excepción inesperada!");
			System.out.println(e.toString());
		} */finally {
			System.out.println("Esto se ejecuta siempre :)");
		}
	}

}
