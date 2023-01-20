package ejercicioDiapositivasHerencia.diapositiva20;

/**
 * Clase Cuadrado que hereda de la clase Formas
 * @author helena.martinez.duro
 */
public class Cuadrado extends Formas {

	/**
	 * Cosntructor principal de la clase
	 * @param lado
	 */
	public Cuadrado(int lado) {
		super(lado);
	}

	/**
	 * Método que muestra cuando miden los lados.
	 * @return String
	 */
	@Override
	public String dibujar() {
		// TODO Auto-generated method stub
		String dibujo = "\n";
		for (int i = 0; i < getMedidaBasica(); i++) {
			//Segundo for que escribe los asteriscos por linea
			for (int j = 0; j < getMedidaBasica(); j++) {
				dibujo += "* ";
			}
			dibujo += "\n";
		}
		return "Dibujo un cuadrado cuyos lados miden " + getMedidaBasica() + " cm." + dibujo;
	}

	/**
	 * Método que calcula el area del cuadrado
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getMedidaBasica()*getMedidaBasica();
	}

}
