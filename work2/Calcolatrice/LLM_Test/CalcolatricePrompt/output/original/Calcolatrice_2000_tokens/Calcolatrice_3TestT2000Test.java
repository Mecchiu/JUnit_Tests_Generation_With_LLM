// Calcolatrice_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#divide(double, double)} method.
*/
class Calcolatrice_3Test {
	@Test
			void testDivide1() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(3, 2);
				assertEquals(1.5, result);
			}

			@Test
			void testDivide2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(2, 4);
				assertEquals(0.5, result);
			}

			@Test
			void testDivide3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(0, 1);
				assertEquals(0, result);
			}

			@Test
			void testDivide4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertThrows(IllegalArgumentException.class, () -> calcolatrice.divide(1, 0));
			}

			@Test
			void testDivide5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-1, 2);
				assertEquals(-0.5, result);
			}

			@Test
			void testDivide6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-2, 1);
				assertEquals(-2.0, result);
			}

			@Test
			void testDivide7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(15, -3);
				assertEquals(-5.0, result);
			}

			@Test
			void testDivide8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(3, -15);
				assertEquals(-0.2, result);
			}

			@Test
			void testDivide9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-2, -4);
				assertEquals(0.5, result);
			}

			@Test
			void testDivide10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				double result = calcolatrice.divide(-4, -2);
				assertEquals(2.0, result);
			}
}
