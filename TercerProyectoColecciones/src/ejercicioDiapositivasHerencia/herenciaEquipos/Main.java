package ejercicioDiapositivasHerencia.herenciaEquipos;

public class Main {

	/**
	 * Método main para ejecutar el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo los objetos
		Futbolista futbolista1 = new Futbolista(11223344, "Antonio", "Perez", 24, 5, "Delantero");
		Futbolista futbolista2 = new Futbolista(22334455, "David", "Molina", 19, 7, "Lateral");
		
		Masajista masajista1 = new Masajista(99887766, "Lara", "Mendez", 41, "Fisioterapeuta", 10);
		Masajista masajista2 = new Masajista(99775533, "Jose", "Smith", 56, "Licenciado de ciencias de la educacion fisica", 25);
		
		Entrenador entrenador1 = new Entrenador(11992288, "Pedro", "Lopez", 33, "FED001122");
		Entrenador entrenador2 = new Entrenador(22883377, "Marina", "Delamain", 29, "FED998877");
		
		//Meto los objetos en un array como pide el ejercicio
		Persona plantilla[] = {futbolista1, futbolista2, masajista1, masajista2, entrenador1, entrenador2};
		
		//Pruebo todos los metodos de cada uno de los objetos creados.
		//Recorro el array de Personas 
		for (Persona p : plantilla) {
			//Siempre viene bien comprobar que el objeto no sea nulo para evitar petes
			if (p != null) {
				//Llamo a los metodos que tienen en comun
				p.concentrarse();
				p.viajar();
				//Compruebo de que clase hija es instancia y llamo sus metodos
				if (p instanceof Futbolista) {
					Futbolista f = (Futbolista)p;
					f.jugarPartido();
					f.entrenar();
				} else if (p instanceof Masajista) {
					Masajista m = (Masajista)p;
					m.darMasaje();
				} else {
					Entrenador e = (Entrenador)p;
					e.dirigirPartido();
					e.dirigirEntrenamiento();
				}
			}
		}
	}

}
