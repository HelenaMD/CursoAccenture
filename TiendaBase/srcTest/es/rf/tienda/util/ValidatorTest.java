package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class ValidatorTest {

	final String[] ALFANUMERIC_CORRECT = {"abcde", "12345", "abcABC", "aBcDe1234", "n", "6"};
	final String[] ALFANUMERIC_INCORRECT = {"",  "con espacios", "hola!!", "@twitter", "-.-", "\\_/"};
	final String[] VACIO_CORRECT = {"",  null};
	final String[] VACIO_INCORRECT = {"hola",  "___", " "};
	final String[] PHONENUMBER_CORRECT = {"34 666777888", "2 111 222 333"};
	final String[] PHONENUMBER_INCORRECT = {"+(34)666777888", "2456", "          23"};
	final String[] EMAIL_CORRECT = {"hola@adios.es", "of_courSe@hola-tio.com", "welcOme1@adiOs2.py", "a@e.es", "a.la@olo.com"};
	final String[] EMAIL_INCORRECT = {"hola@adios.a", "@adios.com", "eje@.com", "to!!@egg.es", "ole@ole@ole.com"};
	final String[] DNI_CORRECT = {"23.456.789-H", "99.888.666-T"};
	final String[] DNI_INCORRECT = {"2..456.789-H", "11111111111F", "A", "222222222222", "TYUIOPLKJHGF"};
	final String[] FECHAS_ERRONEAS = {"10-12", "23D12M2020A", "2024_03", "jueves 29 de enero de 2023", "23-04-1999"};
	final String[] PASS_CORRECT = {"aA12!@.", "aaAA1122!!@."};
	final String[] PASS_INCORRECT = {"", "aaAA1122!!@@eeeeeeeee", "aaaaa", "aaaaAAAA", "aaAA22."};
	
	@RepeatedTest(value = 6, name = "Strings alfanumericas correctas {currentRepetition}/{totalRepetitions}")
	void testIsAlfanumericCorrect(RepetitionInfo repetitionInfo) {
		String str = ALFANUMERIC_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.isAlfanumeric(str));
	}
	
	@RepeatedTest(value = 6, name = "Strings alfanumericas incorrectas {currentRepetition}/{totalRepetitions}")
	void testIsAlfanumericIncorrect(RepetitionInfo repetitionInfo) {
		String str = ALFANUMERIC_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.isAlfanumeric(str));
	}

	@RepeatedTest(value = 2, name = "Strings vacias correctas {currentRepetition}/{totalRepetitions}")
	void testIsVacioCorrect(RepetitionInfo repetitionInfo) {
		String str = VACIO_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.isVacio(str));
	}
	
	@RepeatedTest(value = 2, name = "Strings vacias incorrectas {currentRepetition}/{totalRepetitions}")
	void testIsVacioIncorrect(RepetitionInfo repetitionInfo) {
		String str = VACIO_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.isVacio(str));
	}

	@RepeatedTest(value = 2, name = "Strings phoneNumber correctas {currentRepetition}/{totalRepetitions}")
	void testCumplePhoneNumberCorrecto(RepetitionInfo repetitionInfo) {
		String str = PHONENUMBER_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.cumplePhoneNumber(str));
	}
	
	@RepeatedTest(value = 3, name = "Strings phoneNumber correctas {currentRepetition}/{totalRepetitions}")
	void testCumplePhoneNumberIncorrecto(RepetitionInfo repetitionInfo) {
		String str = PHONENUMBER_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.cumplePhoneNumber(str));
	}

	@RepeatedTest(value = 5, name = "Strings email correctas {currentRepetition}/{totalRepetitions}")
	void testIsEmailValidoCorrecto(RepetitionInfo repetitionInfo) {
		String str = EMAIL_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.isEmailValido(str));
	}
	
	@RepeatedTest(value = 5, name = "Strings email incorrectas {currentRepetition}/{totalRepetitions}")
	void testIsEmailValidoIncorrecto(RepetitionInfo repetitionInfo) {
		String str = EMAIL_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.isEmailValido(str));
	}
	
	@RepeatedTest(value = 2, name = "Strings dni correctas {currentRepetition}/{totalRepetitions}")
	void testCumpleDNICorrecto(RepetitionInfo repetitionInfo) {
		String str = DNI_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.cumpleDNI(str));
	}
	
	@RepeatedTest(value = 5, name = "Strings dni incorrectas {currentRepetition}/{totalRepetitions}")
	void testCumpleDNIIncorrecto(RepetitionInfo repetitionInfo) {
		String str = DNI_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.cumpleDNI(str));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(5, 1, 10));
		assertTrue(Validator.cumpleRango(1, 1, 10));
		assertTrue(Validator.cumpleRango(10, 1, 10));
		
		assertFalse(Validator.cumpleRango(13, 1, 10));
		assertFalse(Validator.cumpleRango(0, 1, 10));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(5.87, 1, 10));
		assertTrue(Validator.cumpleRango(1.33, 1, 10));
		assertTrue(Validator.cumpleRango(9.07, 1, 10));
		
		assertFalse(Validator.cumpleRango(10.56, 1, 10));
		assertFalse(Validator.cumpleRango(0.99, 1, 10));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin("Prueba ocho", 10));
		assertTrue(Validator.cumpleLongitudMin("Prueba ocho", 11));
		assertFalse(Validator.cumpleLongitudMin("Prueba ocho", 12));
	}

	@Test
	void testCumpleLongitudMax() {
		assertFalse(Validator.cumpleLongitudMax("Prueba ocho", 10));
		assertTrue(Validator.cumpleLongitudMax("Prueba ocho", 11));
		assertTrue(Validator.cumpleLongitudMax("Prueba ocho", 12));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Validator.cumpleLongitud("Prueba ocho", 10, 12));
		assertTrue(Validator.cumpleLongitud("Prueba ochoo", 10, 12));
		assertTrue(Validator.cumpleLongitud("Prueba och", 10, 12));
		
		assertFalse(Validator.cumpleLongitud("Prueba ochooo", 10, 12));
		assertFalse(Validator.cumpleLongitud("Prueba oc", 10, 12));
	}

	@Test
	void testValDateMin() {
		assertTrue(Validator.valDateMin(LocalDate.of(2023, 1, 27), LocalDate.of(2023, 1, 25)));
		assertTrue(Validator.valDateMin(LocalDate.of(2023, 1, 27), LocalDate.of(2023, 1, 27)));
		assertFalse(Validator.valDateMin(LocalDate.of(2023, 1, 27), LocalDate.of(2023, 1, 30)));
	}

	@Test
	void testValDateMax() {
		assertTrue(Validator.valDateMax(LocalDate.of(2023, 1, 27), LocalDate.of(2024, 1, 2)));
		assertTrue(Validator.valDateMax(LocalDate.of(2023, 1, 27), LocalDate.of(2023, 1, 27)));
		assertFalse(Validator.valDateMax(LocalDate.of(2023, 1, 27), LocalDate.of(2022, 1, 30)));
	}

	@RepeatedTest(value = 5, name = "Fechas validas erroneas {currentRepetition}/{totalRepetitions}")
	void testEsFechaValidaIncorrecto(RepetitionInfo repetitionInfo) {
		String fecha = FECHAS_ERRONEAS[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.esFechaValida(fecha));
	}
	
	@Test
	void testEsFechaValidaCorrecto() {
		assertTrue(Validator.esFechaValida("23/04/1999"));
	}

	@RepeatedTest(value = 2, name = "Passwords correctas {currentRepetition}/{totalRepetitions}")
	void testEsPasswordValidaCorrecto(RepetitionInfo repetitionInfo) {
		String str = PASS_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.esPasswordValida(str));
	}
	
	@RepeatedTest(value = 5, name = "Passwords incorrectas {currentRepetition}/{totalRepetitions}")
	void testEsPasswordValidaIncorrecto(RepetitionInfo repetitionInfo) {
		String str = PASS_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.esPasswordValida(str));
	}

	@Test
	void testComprobarNuloString() {
		String str = null;
		assertTrue(Validator.comprobarNulo("2"));
		assertTrue(Validator.comprobarNulo(""));
		assertFalse(Validator.comprobarNulo(str));
	}

	@Test
	void testComprobarNuloLocalDate() {
		LocalDate date = null;
		assertTrue(Validator.comprobarNulo(LocalDate.of(2023, 1, 27)));
		assertFalse(Validator.comprobarNulo(date));
	}

}
