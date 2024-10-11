// IsMultiplyPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains one unit test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
/**
		 * This method shall invoke the object under test.
		 */
		@Test
		public void test() {
			assertEquals(true, IsMultiplyPrime.isMultiplyPrime(10));
			assertEquals(true, IsMultiplyPrime.isMultiplyPrime(30));
			assertEquals(false, IsMultiplyPrime.isMultiplyPrime(100));
			assertEquals(false, IsMultiplyPrime.isMultiplyPrime(125));

			assertNull(IsMultiplyPrime.isMultiplyPrime(5));
			assertNull(IsMultiplyPrime.isMultiplyPrime(2));
			assertNull(IsMultiplyPrime.isMultiplyPrime(5.0));
			assertNull(IsMultiplyPrime.isMultiplyPrime(2.0));
			assertNull(IsMultiplyPrime.isMultiplyPrime(5l));
			assertNull(IsMultiplyPrime.isMultiplyPrime(2l));
			assertNull(IsMultiplyPrime.isMultiplyPrime(5.5));
			assertNull(IsMultiplyPrime.isMultiplyPrime(2.5));
			assertNull(IsMultiplyPrime.isMultiplyPrime(5.999));
			
			try {
				IsMultiplyPrime.isMultiplyPrime(90l);
				fail("Expected: IllegalArgumentException");
			} catch (java.lang.IllegalArgumentException e) {
				// Expected
			}
			try {
				IsMultiplyPrime.isMultiplyPrime(891l);
				fail("Expected: IllegalArgumentException");
			} catch (java.lang.IllegalArgumentException e) {
				// Expected
			}
			
			// try negative numbers
			try {
				IsMultiplyPrime.isMultiplyPrime(-90l);
				fail("Expected: NullPointerException");
			} catch(java.lang.NullPointerException e) {
				// Expected
			}
			try {
				IsMultiplyPrime.isMultiplyPrime(-891l);
				fail("Expected: IllegalArgumentException");
			} catch(java.lang.IllegalArgumentException e) {
				// Expected
			}
			
			// test negative negatives
			try {
				IsMultiplyPrime.isMultiplyPrime(-90l);
				fail("Expected: IllegalArgumentException");
			} catch (java.lang.IllegalArgumentException e) {
				// Expected
			}
			try {
				IsMultiplyPrime.isMultiplyPrime(-891l);
				fail("Expected: IllegalArgumentException");
			} catch (java.lang.IllegalArgumentException e) {
				// Expected
			}

			// test negatives
			try {
				IsMultiplyPrime.isMultiplyPrime(10l);
				fail("Expected: IllegalArgumentException");
			} catch(java.lang.IllegalArgumentException e) {
				// Expected
			}
			try {
				IsMultiplyPrime.isMultiplyPrime(30l);
				fail("Expected: IllegalArgumentException");
			} catch(java.lang.IllegalArgumentException e) {
				// Expected
			}
		}
}
