// SolutionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Integer> lst = new ArrayList<>();
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with only even numbers
			@Test
			void testEvenNumbers() {
				List<Integer> lst = Arrays.asList(2, 4, 6, 8);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with only odd numbers
			@Test
			void testOddNumbers() {
				List<Integer> lst = Arrays.asList(1, 3, 5, 7);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with alternating even and odd numbers
			@Test
			void testAlternatingNumbers() {
				List<Integer> lst = Arrays.asList(2, 3, 4, 5, 6, 7);
				int expected = 8;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with negative numbers
			@Test
			void testNegativeNumbers() {
				List<Integer> lst = Arrays.asList(-2, -4, -6, -8);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with both positive and negative numbers
			@Test
			void testMixedNumbers() {
				List<Integer> lst = Arrays.asList(-2, 3, -4, 5, -6, 7);
				int expected = 8;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with duplicate numbers
			@Test
			void testDuplicateNumbers() {
				List<Integer> lst = Arrays.asList(2, 2, 4, 4, 6, 6);
				int expected = 10;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with large numbers
			@Test
			void testLargeNumbers() {
				List<Integer> lst = Arrays.asList(1000000, 2000000, 3000000, 4000000);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with one element
			@Test
			void testOneElement() {
				List<Integer> lst = Arrays.asList(5);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with null values
			@Test
			void testNullValues() {
				List<Integer> lst = Arrays.asList(null, null, null);
				int expected = 0;
				int actual = Solution.solution(lst);
				assertEquals(expected, actual);
			}
}