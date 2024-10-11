// SolutionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

	@Test
	void testSolution() {
		assertEquals(12, Solution.solution(List.of(5, 8, 7, 1)));
		assertEquals(9, Solution.solution(List.of(3, 3, 3, 3, 3)));
		assertEquals(0, Solution.solution(List.of(30, 13, 24, 321)));
		assertEquals(5, Solution.solution(List.of(5, 9)));
		assertEquals(0, Solution.solution(List.of(2, 4, 8)));
		assertEquals(23, Solution.solution(List.of(30, 13, 23, 32)));
		assertEquals(3, Solution.solution(List.of(3, 13, 2, 9)));
		assertEquals(0, Solution.solution(List.of(2, 4, 6, 8)));
		assertEquals(0, Solution.solution(List.of(2, 4, 6, 8, 10)));
		assertEquals(0, Solution.solution(List.of(2, 4, 6, 8, 10, 12)));
	}
}