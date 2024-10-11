// FactorizeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
	// Test case 1: Factorize a prime number
			@Test
			void testFactorizePrime() {
				int n = 17;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(17);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Factorize a composite number with two prime factors
			@Test
			void testFactorizeTwoPrimes() {
				int n = 35;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(7);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Factorize a composite number with multiple prime factors
			@Test
			void testFactorizeMultiplePrimes() {
				int n = 180;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Factorize a number with repeated prime factors
			@Test
			void testFactorizeRepeatedPrimes() {
				int n = 16;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Factorize a number with one prime factor appearing multiple times
			@Test
			void testFactorizeOneRepeatedPrime() {
				int n = 125;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(5);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Factorize a number with one prime factor appearing multiple times and other prime factors
			@Test
			void testFactorizeRepeatedPrimeAndOtherPrimes() {
				int n = 300;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Factorize a number with one prime factor appearing multiple times and other prime factors appearing multiple times
			@Test
			void testFactorizeRepeatedPrimesAndOtherPrimes() {
				int n = 900;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				expected.add(5);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Factorize a number with one prime factor appearing multiple times and other prime factors appearing multiple times
			@Test
			void testFactorizeRepeatedPrimesAndOtherPrimes2() {
				int n = 720;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Factorize a number with one prime factor appearing multiple times and other prime factors appearing multiple times
			@Test
			void testFactorizeRepeatedPrimesAndOtherPrimes3() {
				int n = 1260;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Factorize a number with one prime factor appearing multiple times and other prime factors appearing multiple times
			@Test
			void testFactorizeRepeatedPrimesAndOtherPrimes4() {
				int n = 2520;
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Integer> actual = Factorize.factorize(n);
				assertEquals(expected, actual);
			}
}