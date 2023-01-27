package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class ValidatorTest {

	final static String[] ALFANUMERIC_CORRECT = {"abcde", "12345", "abcABC", "aBcDe1234", "n", "6"};
	final static String[] ALFANUMERIC_INCORRECT = {"",  "con espacios", "hola!!", "@twitter", "-.-", "\\_/"};

	@RepeatedTest(value = 6, name = "Strings alfanumericas correctas {currentRepetition}/{totalRepetitions}")
	void testIsAlfanumericCorrect(RepetitionInfo repetitionInfo) {
		String str = ALFANUMERIC_CORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertTrue(Validator.isAlfanumeric(str));
	}
	
	@RepeatedTest(value = 6, name = "Strings alfanumericas correctas {currentRepetition}/{totalRepetitions}")
	void testIsAlfanumericIncorrect(RepetitionInfo repetitionInfo) {
		String str = ALFANUMERIC_INCORRECT[repetitionInfo.getCurrentRepetition() - 1];
		assertFalse(Validator.isAlfanumeric(str));
	}

	@Test
	void testIsVacio() {
		fail("Not yet implemented");
	}

	@Test
	void testCumplePhoneNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmailValido() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleDNI() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValida() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarNuloString() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarNuloLocalDate() {
		fail("Not yet implemented");
	}

}
