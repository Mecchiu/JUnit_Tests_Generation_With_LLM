// SolutionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains one unit test case for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
private final String expected;

		/**
* Constructor of SolutionTest.
* @param expected Exception to thrown into the case if the method did not return the expected number.
*/
public SolutionTest(String expected) {
		this.expected = expected;
}

/**
* {@link SolutionTest#solution(List)} test for the {@link Solution} public static method with incorrect numbers.
*/
// TODO: Add your test code here
@Test
//    public void shouldThrowException() {
//    	int[] result = (int[])solution(new int[] {7,5,20,1,2,9});
//    	if (result.length!= 1) {
//    		assertTrue(false);
//    	}
//    }
	
	@Test
	public void shouldReturnSumOfNUmber() {
		int sum = solution(new int[]{5, 5, 5, 5, 1});
		assertEquals(expected, sum);
	}

	@Test
	public void shouldReturnNUmber() {
		int result = Solution.solution(new int[]{5, 9, 9, 1});
		assertEquals(expected, result);
	}
	

}
