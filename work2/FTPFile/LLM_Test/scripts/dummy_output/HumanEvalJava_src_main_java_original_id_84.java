// Solve1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
			/**
			* Test case for {@link Solve1#solve(int)}.
			* It verifies that the method returns the correct binary string for the given input.
			*/
			@Test
			void testSolve() {
						assertEquals("1", Solve1.solve(1000));
						assertEquals("110", Solve1.solve(150));
						assertEquals("1100", Solve1.solve(147));
						assertEquals("1001", Solve1.solve(333));
						assertEquals("10010", Solve1.solve(963));
						assertEquals("0", Solve1.solve(0));
						assertEquals("1", Solve1.solve(1));
						assertEquals("10", Solve1.solve(2));
						assertEquals("11", Solve1.solve(3));
						assertEquals("100", Solve1.solve(4));
			}
}