// Calcolatrice_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#factorial(int)} method.
*/
class Calcolatrice_4Test {
	@Test
			void testFactorial1() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("120", calcolatrice.factorial(5));
			}

			@Test
			void testFactorial2() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("40320", calcolatrice.factorial(8));
			}

			@Test
			void testFactorial3() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("2", calcolatrice.factorial(2));
			}

			@Test
			void testFactorial4() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("6", calcolatrice.factorial(3));
			}

			@Test
			void testFactorial5() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("1", calcolatrice.factorial(1));
			}

			@Test
			void testFactorial6() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("1", calcolatrice.factorial(0));
			}

			@Test
			void testFactorial7() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("IllegalArgumentException", calcolatrice.factorial(-5));
			}

			@Test
			void testFactorial8() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("IllegalArgumentException", calcolatrice.factorial(-1));
			}

			@Test
			void testFactorial9() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("2432902008176640000", calcolatrice.factorial(20));
			}

			@Test
			void testFactorial10() {
				Calcolatrice_4 calcolatrice = new Calcolatrice_4();
				assertEquals("IllegalArgumentException", calcolatrice.factorial(21));
			}
}
