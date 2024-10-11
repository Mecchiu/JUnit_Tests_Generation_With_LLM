// CountUpperTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains one unit test case for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
/**
		 * Test for {@link CountUpper#countUpper(String)}.
		 */
		@Test
		void testCountUpper() {
			int expected = 3;
			assertEquals(expected, CountUpper.countUpper("AA"));
			assertEquals(expected, CountUpper.countUpper("A"));
			assertEquals(expected, CountUpper.countUpper("Aa"));
			assertEquals(expected, CountUpper.countUpper("0"));
			assertEquals(expected, CountUpper.countUpper("0.1234567"));
			assertEquals(expected, CountUpper.countUpper("1234567"));
			assertEquals(expected, CountUpper.countUpper("1234"));
			assertEquals(expected, CountUpper.countUpper(""));

			assertEquals(expected, CountUpper.countUpper("A.1234"));
			assertEquals(expected, CountUpper.countUpper("A.0.1234"));
			assertEquals(expected, CountUpper.countUpper("A.0-1234"));
		}

}
// End CountUpperTest.java
