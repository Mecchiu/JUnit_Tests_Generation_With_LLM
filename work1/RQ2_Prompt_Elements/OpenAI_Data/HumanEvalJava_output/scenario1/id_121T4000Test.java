// SolutionTest.java
package scenario1;

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
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(25, Solution.solution(lst));
	}
	
	@Test
	void testSolution2() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(36, Solution.solution(lst));
	}
	
	@Test
	void testSolution3() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(36, Solution.solution(lst));
	}
	
	@Test
	void testSolution4() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(49, Solution.solution(lst));
	}
	
	@Test
	void testSolution5() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(49, Solution.solution(lst));
	}
	
	@Test
	void testSolution6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(64, Solution.solution(lst));
	}
	
	@Test
	void testSolution7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(64, Solution.solution(lst));
	}
	
	@Test
	void testSolution8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(81, Solution.solution(lst));
	}
	
	@Test
	void testSolution9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(81, Solution.solution(lst));
	}
	
	@Test
	void testSolution10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(100, Solution.solution(lst));
	}
}