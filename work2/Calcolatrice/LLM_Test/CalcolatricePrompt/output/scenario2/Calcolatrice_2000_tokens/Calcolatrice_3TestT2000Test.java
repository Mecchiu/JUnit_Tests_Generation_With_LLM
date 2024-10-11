// Calcolatrice_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#divide(double, double)} method.
*/
class Calcolatrice_3Test {
	// Test case 1: 10 / 2 = 5
			@Test
			void testDivide1() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(10, 2);
				assertEquals(5, result);
			}

			// Test case 2: 0 / 10 = 0
			@Test
			void testDivide2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(0, 10);
				assertEquals(0, result);
			}

			// Test case 3: 10 / 0 = IllegalArgumentException
			@Test
			void testDivide3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertThrows(IllegalArgumentException.class, () -> calcolatrice.divide(10, 0));
			}

			// Test case 4: 0 / 0 = IllegalArgumentException
			@Test
			void testDivide4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertThrows(IllegalArgumentException.class, () -> calcolatrice.divide(0, 0));
			}

			// Test case 5: -10 / 2 = -5
			@Test
			void testDivide5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-10, 2);
				assertEquals(-5, result);
			}

			// Test case 6: 10 / -2 = -5
			@Test
			void testDivide6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(10, -2);
				assertEquals(-5, result);
			}

			// Test case 7: -10 / -2 = 5
			@Test
			void testDivide7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-10, -2);
				assertEquals(5, result);
			}

			// Test case 8: 10.5 / 2.5 = 4.2
			@Test
			void testDivide8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(10.5, 2.5);
				assertEquals(4.2, result);
			}

			// Test case 9: 10.5 / 2 = 5.25
			@Test
			void testDivide9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(10.5, 2);
				assertEquals(5.25, result);
			}

			// Test case 10: 10 / 2.5 = 4
			@Test
			void testDivide10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(10, 2.5);
				assertEquals(4, result);
			}
}