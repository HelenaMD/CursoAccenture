package ejerciciosMiguel.reparteBaraja;

import java.util.HashSet;
import java.util.Set;

import ejerciciosMiguel.reparteBaraja.EnumsReparteBaraja.TipoPalo;

/**
 * Clase que almacena una baraja con su info del tipo.
 * @author helena.martinez.duro
 *
 */
public class Paquete {
	
	/**
	 * Atributos de la clase
	 */
	private Set<Carta> baraja;
	private final String[] PALO_ESP; 
	private final String[] PALO_POK;
	private TipoPalo tipoPalo;

	/**
	 * Constructor principal de la clase
	 * @param tipoPalo enum TipoPalo
	 */
	//Al constructor le paso un enum con el tipo de baraja.
	public Paquete(TipoPalo tipoPalo) {
		this.tipoPalo = tipoPalo;
		PALO_ESP = new String[]{"oros", "bastos", "espadas", "copas"};
		PALO_POK = new String[]{"diamantes", "picas", "corazones", "treboles"};
		setBaraja(tipoPalo);
		
	}
	
	/**
	 * Constructor de copia
	 * @param p Paquete
	 */
	public Paquete(Paquete p) {
		this.tipoPalo = p.getTipoPalo();
		PALO_ESP = new String[]{"oros", "bastos", "espadas", "copas"};
		PALO_POK = new String[]{"diamantes", "picas", "corazones", "treboles"};
		setBaraja(p.getTipoPalo());
		
	}

	/**
	 * Getter de baraja
	 * @return Set<Carta>
	 */
	public Set<Carta> getBaraja() {
		return baraja;
	}

	/**
	 * Setter de baraja. Crea la baraja del tipo pasado por parametro
	 * @param tipoPalo enum TipoPalo
	 */
	public void setBaraja(TipoPalo tipoPalo) {
		//Variables auxiliares
		String[] p;
		Set<Carta> aux = new HashSet<Carta>();
		
		//Veo si es baraja española o poker
		if (tipoPalo == TipoPalo.ESP) {
			p = PALO_ESP;
		} else {
			p = PALO_POK;
		}
		
		//Relleno una baraja
		for (String s : p) {
			for (int i = 1; i <= 12; i++) {
				aux.add(new Carta(s, i));
			}
		}

		//Asigno el HashSet al atributo.
		this.baraja = new HashSet<Carta>(aux);
	}

	/**
	 * Getter de tipoPalo version string
	 * @return String tipo de baraja
	 */
	public String getTipoPaloStr() {
		if (this.tipoPalo == TipoPalo.ESP) {
			return "baraja espaniola";
		} else {
			return "baraja de poker";
		}
	}
	
	/**
	 * Getter de tipoPalo version enum
	 * @return enum TipoPalo
	 */
	public TipoPalo getTipoPalo() {
		return this.tipoPalo;
	}
	
	/**
	 * Metodo que devuelve el numero de cartas que tiene actualmente la baraja
	 * @return int
	 */
	public int numeroCartas() {
		return getBaraja().size();
	}
	
}
