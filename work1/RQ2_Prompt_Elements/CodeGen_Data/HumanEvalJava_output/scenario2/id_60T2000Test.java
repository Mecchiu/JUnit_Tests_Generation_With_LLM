// SumToNTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains one unit test case for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

	/**
	 *
	 * @throws Exception should not happen
	 */
	@Test
	void test() throws Exception {
		assertEquals(12, new SumToN().sumToN(1));
		assertEquals(123, new SumToN().sumToN(2));
		assertEquals(1212, new SumToN().sumToN(12));
		assertEquals(12312, new SumToN().sumToN(1212));
	}


}