package ejercicioDiapositivasHerencia.herenciaFormas;

import ejercicioDiapositivasHerencia.composicionFormas.Punto;

/**
 * Clase Circulo que hereda de Formas
 * @author helena.martinez.duro
 *
 */
public class Circulo extends Formas {

	/**
	 * Cosntructor principal de la clase
	 * @param lado
	 * @param x int
	 * @param y int
	 */
	public Circulo(int radio, int x, int y) {
		super(radio, x, y);
	}
	
	/**
	 * Cosntructor alternativo de la clase
	 * @param lado
	 * @param p Punto
	 */
	public Circulo(int radio, Punto p) {
		super(radio, p);
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

	/**
	 * Metodo que muestra el valor de las coordenadas de inicio
	 */
	@Override
	public void mostrarPuntoOrigen() {
		// TODO Auto-generated method stub
		System.out.println("El Circulo comienza en las coordenadas " + getPuntoOrigen().toString());
	}
}
