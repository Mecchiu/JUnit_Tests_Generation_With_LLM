// Calcolatrice_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#divide(double, double)} method.
*/
class Calcolatrice_3Test {
	// Test case #1
			@Test
			void testDivide1() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, 2);
				assertEquals(5, result);
			}

			// Test case #2
			@Test
			void testDivide2() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, 3);
				assertEquals(3.3333333333333335, result);
			}

			// Test case #3
			@Test
			void testDivide3() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, 0);
				assertEquals(Double.POSITIVE_INFINITY, result);
			}

			// Test case #4
			@Test
			void testDivide4() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(0, 10);
				assertEquals(0, result);
			}

			// Test case #5
			@Test
			void testDivide5() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(0, 0);
				assertEquals(Double.NaN, result);
			}

			// Test case #6
			@Test
			void testDivide6() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(-10, 2);
				assertEquals(-5, result);
			}

			// Test case #7
			@Test
			void testDivide7() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, -2);
				assertEquals(-5, result);
			}

			// Test case #8
			@Test
			void testDivide8() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(-10, -2);
				assertEquals(5, result);
			}

			// Test case #9
			@Test
			void testDivide9() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, 2.5);
				assertEquals(4, result);
			}

			// Test case #10
			@Test
			void testDivide10() {
				Calcolatrice calc = new Calcolatrice();
				double result = calc.divide(10, 2.5);
				assertEquals(4, result);
			}
}