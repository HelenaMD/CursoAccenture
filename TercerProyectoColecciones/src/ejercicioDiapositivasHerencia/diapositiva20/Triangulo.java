package ejercicioDiapositivasHerencia.diapositiva20;

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
	 */
	public Triangulo(int medidaBasica, int altura) {
		super(medidaBasica);
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
	
	
}
