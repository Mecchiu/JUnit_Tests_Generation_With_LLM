// SolveTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains one unit test case for the {@link Solve#solve(String)} method.
*/
class SolveTest {
/**
		 * @throws java.lang.Exception if an error occurs
		 */
		@Test
		void SolveStringTest() {
			assertEquals("4321", Solve.solve("1234"));
			assertEquals("1234", Solve.solve("123"));
			assertEquals("1234", Solve.solve("abc"));
			fail("No failure thrown");
		}
}

// SolveTestMain
#if 0
Test suite() {
		return new TestSuite(SolveTest.class);
}
#endif