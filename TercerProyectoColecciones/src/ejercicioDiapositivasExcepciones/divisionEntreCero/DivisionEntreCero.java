package ejercicioDiapositivasExcepciones.divisionEntreCero;

public class DivisionEntreCero {

	private int a;
	private int b;
	
	public DivisionEntreCero(int a, int b) {
		setA(a);
		setB(b);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int dividirBEntreA() {
		return getB()/getA();
	}
}
