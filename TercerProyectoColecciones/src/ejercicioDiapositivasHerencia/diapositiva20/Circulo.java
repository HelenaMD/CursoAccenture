package ejercicioDiapositivasHerencia.diapositiva20;

/**
 * Clase Circulo que hereda de Formas
 * @author helena.martinez.duro
 *
 */
public class Circulo extends Formas {

	/**
	 * Cosntructor principal de la clase
	 * @param lado
	 */
	public Circulo(int radio) {
		super(radio);
	}

	/**
	 * Método que muestra cuando mide el radio y el diametro.
	 * @return String
	 */
	@Override
	public String dibujar() {
		return "Con el compás dibujo un circulo cuyo radio mide " + getMedidaBasica() + " cm y el diametro mide " + getMedidaBasica()*2 + " cm";
	}

	/**
	 * Método que calcula el area del circulo
	 * @return double
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*(getMedidaBasica()*getMedidaBasica());
	}
}
