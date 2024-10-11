// Calcolatrice_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#factorial(int)} method.
*/
class Calcolatrice_4Test {
	// Test case #1
			@Test
			void testFactorialOfZero() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(0);
				assertEquals(1, actual);
			}

			// Test case #2
			@Test
			void testFactorialOfOne() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(1);
				assertEquals(1, actual);
			}

			// Test case #3
			@Test
			void testFactorialOfTwo() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(2);
				assertEquals(2, actual);
			}

			// Test case #4
			@Test
			void testFactorialOfThree() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(3);
				assertEquals(6, actual);
			}

			// Test case #5
			@Test
			void testFactorialOfFour() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(4);
				assertEquals(24, actual);
			}

			// Test case #6
			@Test
			void testFactorialOfFive() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(5);
				assertEquals(120, actual);
			}

			// Test case #7
			@Test
			void testFactorialOfSix() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(6);
				assertEquals(720, actual);
			}

			// Test case #8
			@Test
			void testFactorialOfSeven() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(7);
				assertEquals(5040, actual);
			}

			// Test case #9
			@Test
			void testFactorialOfEight() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(8);
				assertEquals(40320, actual);
			}

			// Test case #10
			@Test
			void testFactorialOfNine() {
				Calcolatrice calc = new Calcolatrice();
				int actual = calc.factorial(9);
				assertEquals(362880, actual);
			}
}