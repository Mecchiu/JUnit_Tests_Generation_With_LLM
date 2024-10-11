// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains one unit test case for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

	// This class test tests implementation of methods
	@Test
	public void testSumToN() {
		assertEquals(54, new SumToN().sumToN(1));
	}

}
