// Solve1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
	@Test
			void testSolve1() {
				assertEquals("1", Solve1.solve(1000));
			}

			@Test
			void testSolve2() {
				assertEquals("110", Solve1.solve(150));
			}

			@Test
			void testSolve3() {
				assertEquals("1100", Solve1.solve(147));
			}

			@Test
			void testSolve4() {
				assertEquals("1001", Solve1.solve(333));
			}

			@Test
			void testSolve5() {
				assertEquals("10010", Solve1.solve(963));
			}

			@Test
			void testSolve6() {
				assertEquals("0", Solve1.solve(0));
			}

			@Test
			void testSolve7() {
				assertEquals("1", Solve1.solve(1));
			}

			@Test
			void testSolve8() {
				assertEquals("10", Solve1.solve(2));
			}

			@Test
			void testSolve9() {
				assertEquals("11", Solve1.solve(3));
			}

			@Test
			void testSolve10() {
				assertEquals("100", Solve1.solve(4));
			}
}
