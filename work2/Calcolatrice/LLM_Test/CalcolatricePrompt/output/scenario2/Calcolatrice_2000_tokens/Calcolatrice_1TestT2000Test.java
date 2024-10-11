// Calcolatrice_1Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#subtract(int, int)} method.
*/
class Calcolatrice_1Test {
	@Test
			void testSubtractPositiveNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(5, 3);
				assertEquals(2, result);
			}

			@Test
			void testSubtractNegativeNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(-5, -3);
				assertEquals(-2, result);
			}

			@Test
			void testSubtractPositiveAndNegativeNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(5, -3);
				assertEquals(8, result);
			}

			@Test
			void testSubtractNegativeAndPositiveNumbers() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(-5, 3);
				assertEquals(-8, result);
			}

			@Test
			void testSubtractZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(5, 0);
				assertEquals(5, result);
			}

			@Test
			void testSubtractPositiveAndZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(0, 3);
				assertEquals(-3, result);
			}

			@Test
			void testSubtractNegativeAndZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(0, -3);
				assertEquals(3, result);
			}

			@Test
			void testSubtractZeroAndZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(0, 0);
				assertEquals(0, result);
			}

			@Test
			void testSubtractMaxValue() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(Integer.MAX_VALUE, 0);
				assertEquals(Integer.MAX_VALUE, result);
			}

			@Test
			void testSubtractMinValue() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.subtract(Integer.MIN_VALUE, 0);
				assertEquals(Integer.MIN_VALUE, result);
			}
}