// LargestPrimeFactorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains one unit test case for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

	/** 
	  * Test for {@link LargestPrimeFactor#largestPrimeFactor(int)}.
	*/
    @Test
	public void testLargestPrimeFactor () {
		int test = 2377;
		assertEquals(967, LargestPrimeFactor.largestPrimeFactor(test));
	}
	
}
