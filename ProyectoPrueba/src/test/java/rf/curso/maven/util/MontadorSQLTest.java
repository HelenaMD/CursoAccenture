package rf.curso.maven.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontadorSQLTest {
	
	private static final String[] NOMBRE_CAMPOS = {"COUNTRY_ID", "COUNTRY_NAME", "REGION_ID"};
	private static final String[] VALORES_CAMPOS_STRING = {"CA", "POLONIA"};
	private static final int VALORES_CAMPOS_INT = 66;
	private static final String SEPARADOR_COMA = ",";
	private static final String SEPARADOR_WHERE = " WHERE ";
	private static final String SEPARADOR_AND = " AND ";
	private static final String SEPARADOR_OR = " OR ";
	
	private static final String SALIDA_INSERT_VALUES = "INSERT INTO COUNTRIES VALUES ";
	private static final String SALIDA_INSERT_SELECT_PARTE1 = "INSERT INTO COUNTRIES SELECT ";
	private static final String SALIDA_INSERT_SELECT_PARTE2 = " FROM COUNTRIES";
	private static final String SALIDA_UPDATE = "UPDATE COUNTRIES SET ";
	private static final String VACIO = "";

	@Test
	void testAddSalidaSencillaInsertValues() {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, VACIO, VALORES_CAMPOS_STRING[0], SEPARADOR_COMA);
		salida = MontadorSQL.addSalida(salida, VACIO, VALORES_CAMPOS_STRING[1], SEPARADOR_COMA);
		salida = MontadorSQL.addSalida(salida, VACIO, VALORES_CAMPOS_INT, SEPARADOR_COMA);
		assertEquals(SALIDA_INSERT_VALUES + "'" + VALORES_CAMPOS_STRING[0] + "' , '" + VALORES_CAMPOS_STRING[1] + "' , " +  VALORES_CAMPOS_INT, SALIDA_INSERT_VALUES + salida);
	}

}
