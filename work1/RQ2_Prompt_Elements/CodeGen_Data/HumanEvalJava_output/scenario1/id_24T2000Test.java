// LargestDivisorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains one unit test case for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
public class Case1 {
			
			@Test
			public void whenSmallDivisorThenTestMethodReturnsSmallest() {
				assertEquals(smallest(1), LargestDivisor.largestDivisor(1));
			}
			
			@Test
			public void whenLargestDivisorEqualsSmallestThenTestMethodReturnsSmallest() {
				assertEquals(smallest(LargestDivisor.largestDivisor(3)), LargestDivisor.largestDivisor(3));
			}
			
			@Test
			public void whenLargestDivisorLessThanSmallestThenTestMethodReturnsSmallest() {
				assertEquals(smallest(-1), LargestDivisor.largestDivisor(-1));
			}
			
			@Test
			public void whenLargestDivisorGreatersThanSmallestThenTestMethodReturnsSmallest() {
				assertEquals(smallest(LargestDivisor.largestDivisor(4)), LargestDivisor.largestDivisor(4));
			}
			
		}
		
}
