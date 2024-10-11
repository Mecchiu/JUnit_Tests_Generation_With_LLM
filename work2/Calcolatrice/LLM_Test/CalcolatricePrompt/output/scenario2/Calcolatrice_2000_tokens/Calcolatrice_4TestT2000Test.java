// Calcolatrice_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#factorial(int)} method.
*/
class Calcolatrice_4Test {
	// Test case 1
			@Test
			void testFactorial1() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(0);
				assertEquals(1, result);
			}

			// Test case 2
			@Test
			void testFactorial2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(1);
				assertEquals(1, result);
			}

			// Test case 3
			@Test
			void testFactorial3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(2);
				assertEquals(2, result);
			}

			// Test case 4
			@Test
			void testFactorial4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(3);
				assertEquals(6, result);
			}

			// Test case 5
			@Test
			void testFactorial5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(4);
				assertEquals(24, result);
			}

			// Test case 6
			@Test
			void testFactorial6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(5);
				assertEquals(120, result);
			}

			// Test case 7
			@Test
			void testFactorial7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(6);
				assertEquals(720, result);
			}

			// Test case 8
			@Test
			void testFactorial8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(7);
				assertEquals(5040, result);
			}

			// Test case 9
			@Test
			void testFactorial9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(8);
				assertEquals(40320, result);
			}

			// Test case 10
			@Test
			void testFactorial10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				int result = calcolatrice.factorial(9);
				assertEquals(362880, result);
			}
}