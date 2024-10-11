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
			void test1() {
				List<Integer> lst = List.of(5, 8, 7, 1);
				assertEquals(12, Solution.solution(lst));
			}

			@Test
			void test2() {
				List<Integer> lst = List.of(3, 3, 3, 3, 3);
				assertEquals(9, Solution.solution(lst));
			}

			@Test
			void test3() {
				List<Integer> lst = List.of(30, 13, 24, 321);
				assertEquals(0, Solution.solution(lst));
			}

			@Test
			void test4() {
				List<Integer> lst = List.of(5, 9);
				assertEquals(5, Solution.solution(lst));
			}

			@Test
			void test5() {
				List<Integer> lst = List.of(2, 4, 8);
				assertEquals(0, Solution.solution(lst));
			}

			@Test
			void test6() {
				List<Integer> lst = List.of(30, 13, 23, 32);
				assertEquals(23, Solution.solution(lst));
			}

			@Test
			void test7() {
				List<Integer> lst = List.of(3, 13, 2, 9);
				assertEquals(3, Solution.solution(lst));
			}

			@Test
			void test8() {
				List<Integer> lst = List.of(3, 13, 2, 9, 4);
				assertEquals(3, Solution.solution(lst));
			}

			@Test
			void test9() {
				List<Integer> lst = List.of(3, 13, 2, 9, 4, 6);
				assertEquals(3, Solution.solution(lst));
			}

			@Test
			void test10() {
				List<Integer> lst = List.of(3, 13, 2, 9, 4, 6, 8);
				assertEquals(3, Solution.solution(lst));
			}
}
