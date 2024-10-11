// GreatestCommonDivisorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains one unit test case for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {

	// Test for the method {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)}.
	@Test
	public void testGreatestCommonDivisor(
			@JUnitCompatible(other=300) Class<ScenarioTest1> testCaseClass) {
		
		// Instantiate the class that should be tested.
		int a = 300;
		int b = 100;
		
		// Test the greatestCommonDivisor of 2 and 1:
		assertEquals("A-1 must be less than or equal to A-1", b,
				greatestCommonDivisor(a, b));
			
		// Test the greatestCommonDivisor of a and 1:
		assertEquals("A-1 must be greater than or equal to A-1", a,
				greatestCommonDivisor(a, b));
	}
}
