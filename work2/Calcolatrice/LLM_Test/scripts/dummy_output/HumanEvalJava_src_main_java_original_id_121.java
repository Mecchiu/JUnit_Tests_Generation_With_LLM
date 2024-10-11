// SolutionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
			/**
			* Test case for the {@link Solution#solution(List)} method.
			* It verifies that the method returns the correct sum of all of the odd elements that are in even positions.
			*/
			@Test
			void testSolution() {
				// Test case 1
				List<Integer> lst = List.of(5, 8, 7, 1);
				int expected = 12;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 2
				lst = List.of(3, 3, 3, 3, 3);
				expected = 9;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 3
				lst = List.of(30, 13, 24, 321);
				expected = 0;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 4
				lst = List.of(5, 9);
				expected = 5;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 5
				lst = List.of(2, 4, 8);
				expected = 0;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 6
				lst = List.of(30, 13, 23, 32);
				expected = 23;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 7
				lst = List.of(3, 13, 2, 9);
				expected = 3;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 8
				lst = List.of(3, 13, 2, 9, 4);
				expected = 3;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 9
				lst = List.of(3, 13, 2, 9, 4, 6);
				expected = 3;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
				
				// Test case 10
				lst = List.of(3, 13, 2, 9, 4, 6, 8);
				expected = 3;
				actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
}