// GreatestCommonDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains one unit test case for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {
int a, b;

	/**
	 * Test case for {@link Scenario2#greatestCommonDivisor(int, int)}
	 * and {@link Scenario2#greatestCommonDivisor(int, int, int)}.
	 */
	@Test
	void greatestCommonDivisorWithIncorrectParameters() {
		assertTrue(greatestCommonDivisor(4, 9));
		assertEquals(0L, greatestCommonDivisor(4, -1));
	}

	@Test
	void greatestCommonDivisorWithSameValues() {
		assertEquals(a & b, greatestCommonDivisor(b, a));
	}

	@Test
	void greatestCommonDivisorWithDifferentValues() {
		assertNotEquals(a & b, greatestCommonDivisor(b, a));
	}

	@Test
	void greatestCommonDivisorWithIncorrectFirstParameter() {
		try {
			greatestCommonDivisor(1, 2);
			fail("Exception expected");
		}
		catch (InvalidOperationException e) {
			// expected
		}
	}

	@Test
	void greatestCommonDivisorWithIncorrectSecondParameter() {
		try {
			greatestCommonDivisor(1, a);
			fail("Exception expected");
		}
		catch (InvalidOperationException e) {
			// expected
		}
	}

	@Test
	void greatestCommonDivisorWithOutOfRangeResults() {
		assertTrue(greatestCommonDivisor(b, a) == 0L);
	}
}
