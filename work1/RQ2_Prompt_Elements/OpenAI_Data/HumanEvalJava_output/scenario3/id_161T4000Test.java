// SolveTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

	@Test
	void testSolve() {
		assertEquals("aSdF", Solve.solve("AsDf"));
		assertEquals("4321", Solve.solve("1234"));
		assertEquals("AB", Solve.solve("ab"));
		assertEquals("#A@c", Solve.solve("#a@C"));
		assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
		assertEquals("2@6#", Solve.solve("#6@2"));
		assertEquals("#$A^d", Solve.solve("#$a^D"));
		assertEquals("#CCC", Solve.solve("#ccc"));
		assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
		assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
	}
}