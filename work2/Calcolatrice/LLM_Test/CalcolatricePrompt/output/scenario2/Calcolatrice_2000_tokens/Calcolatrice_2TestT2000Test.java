// Calcolatrice_2Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#multiply(int, int)} method.
*/
class Calcolatrice_2Test {
	@Test
			void testMultiplyPositiveNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(6, calcolatrice.multiply(2, 3));
			}

			@Test
			void testMultiplyNegativeNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(6, calcolatrice.multiply(-2, -3));
			}

			@Test
			void testMultiplyPositiveAndNegativeNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-6, calcolatrice.multiply(-2, 3));
			}

			@Test
			void testMultiplyZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(0, calcolatrice.multiply(0, 3));
			}

			@Test
			void testMultiplyOne() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(3, calcolatrice.multiply(1, 3));
			}

			@Test
			void testMultiplyMaxInt() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MAX_VALUE, calcolatrice.multiply(1, Integer.MAX_VALUE));
			}

			@Test
			void testMultiplyMinInt() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MIN_VALUE, calcolatrice.multiply(1, Integer.MIN_VALUE));
			}

			@Test
			void testMultiplyMaxIntAndMinInt() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MIN_VALUE, calcolatrice.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE));
			}

			@Test
			void testMultiplyMaxIntAndOne() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MAX_VALUE, calcolatrice.multiply(Integer.MAX_VALUE, 1));
			}

			@Test
			void testMultiplyMinIntAndOne() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MIN_VALUE, calcolatrice.multiply(Integer.MIN_VALUE, 1));
			}
}