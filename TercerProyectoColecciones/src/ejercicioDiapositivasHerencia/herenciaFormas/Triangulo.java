package ejercicioDiapositivasHerencia.herenciaFormas;

import ejercicioDiapositivasHerencia.composicionFormas.Punto;

/**
 * Clase Triangulo que hereda de Formas
 * @author helena.martinez.duro
 */
public class Triangulo extends Formas {

	/**
	 * Atributos de la clase
	 */
	//Aqui solo necesito uno mas, ya que son distintos.
	private int altura;
	
	/**
	 * Constructor principal de la clase
	 * @param medidaBasica
	 * @param altura
	 * @param x int
	 * @param y int
	 */
	public Triangulo(int medidaBasica, int altura, int x, int y) {
		super(medidaBasica, x, y);
		setAltura(altura);
	}
	
	/**
	 * Constructor alternativo de la clase
	 * @param medidaBasica
	 * @param altura
	 * @param p Punto
	 */
	public Triangulo(int medidaBasica, int altura, Punto p) {
		super(medidaBasica, p);
		setAltura(altura);
	}

	/**
	 * Getter del atributo altura
	 * @return int
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Setter del atributo altura
	 * @param altura int
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Metodo que muestra las medidas del triangulo
	 */
	@Override
	public String dibujar() {
		// TODO Auto-generated method stub
		return "Dibujo un triangulo equilatero cuyos lados miden " + getMedidaBasica() + " cm.";
	}

	/**
	 * Metodo que calcula el area del triangulo
	 * @return double
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getMedidaBasica()*getAltura())/2;
	}
	
	/**
	 * Metodo que muestra el valor de las coordenadas de inicio
	 */
	@Override
	public void mostrarPuntoOrigen() {
		// TODO Auto-generated method stub
		System.out.println("El Triangulo comienza en las coordenadas " + getPuntoOrigen().toString());
	}
}
